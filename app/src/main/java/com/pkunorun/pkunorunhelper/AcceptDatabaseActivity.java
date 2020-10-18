package com.pkunorun.pkunorunhelper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class AcceptDatabaseActivity extends AppCompatActivity {
    public DatabaseManager manager;

    public String selectedUserId = null;

    private UserSpinnerAdapter userAdapter;

    @SuppressLint("HandlerLeak")
    @SuppressWarnings("deprecation")
    private final Handler getUserHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Spinner spinner = (Spinner) findViewById(R.id.user_edit);
            userAdapter = new UserSpinnerAdapter(getApplicationContext(), manager.userItemList);
            spinner.setAdapter(userAdapter);
//            Toast toast = new Toast(getApplicationContext());
//            toast.makeText(getApplicationContext(), "用户总数:" + (new Integer(userAdapter.getCount())).toString(), Toast.LENGTH_LONG).show();
            spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    selectedUserId = ((UserItem) userAdapter.getItem(position)).userId;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    selectedUserId = null;
                }
            });
            FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.submit);
            floatingActionButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    float path_length;
                    float speed;
                    try {
                        path_length = Float.parseFloat(((TextView) findViewById(R.id.path_length_edit)).getText().toString());
                    } catch (Exception e) {
                        Toast toast = new Toast(getApplicationContext());
                        toast.makeText(getApplicationContext(), "请检查输入", Toast.LENGTH_LONG).show();
                        return;
                    }
                    try {
                        speed = Float.parseFloat(((TextView) findViewById(R.id.speed_edit)).getText().toString());
                    } catch (Exception e) {
                        Toast toast = new Toast(getApplicationContext());
                        toast.makeText(getApplicationContext(), "请检查输入", Toast.LENGTH_LONG).show();
                        return;
                    }
                    if (selectedUserId == null) {
                        Toast toast = new Toast(getApplicationContext());
                        toast.makeText(getApplicationContext(), "请选择账户", Toast.LENGTH_LONG).show();
                        return;
                    }
                    Toast toast = new Toast(getApplicationContext());

                    {
                        Calendar cal = Calendar.getInstance();
                        TimeZone tz = TimeZone.getTimeZone("GMT");
                        cal.setTimeZone(tz);

                        toast.makeText(getApplicationContext(), Long.toString(cal.getTimeInMillis()), Toast.LENGTH_LONG).show();
                    }
                    try {
                        Record record = new Record(path_length, speed, 180.0f);
                        (new Thread(() -> {
                            try {
                                Calendar cal = Calendar.getInstance();
                                TimeZone tz = TimeZone.getTimeZone("GMT");
                                cal.setTimeZone(tz);
                                long recordDbId = manager.appendRecord(selectedUserId, cal.getTimeInMillis(), path_length, record.duration, record.step);
                                manager.appendTrack(recordDbId, record.detail);
                                manager.database.close();
                                finishHandler.sendEmptyMessage(0);
                            } catch (Exception e) {
                                toast.makeText(getApplicationContext(), Log.getStackTraceString(e), Toast.LENGTH_SHORT).show();
                                Log.e("SQLite", Log.getStackTraceString(e));
                            }
                        })).run();
                    }catch (Exception e){
                        toast.makeText(getApplicationContext(), Log.getStackTraceString(e), Toast.LENGTH_SHORT).show();
                        Log.e("SQLite", Log.getStackTraceString(e));
                    }
                }
            });
        }
    };

    @SuppressLint("HandlerLeak")
    @SuppressWarnings("deprecation")
    private final Handler finishHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            String authority = "com.pkunorun.pkunorunhelper.fileprovider";
            String type = "*/*";
            String title = "告诉你们一点，人生的经验";
            try{
                File dir = getFilesDir();
                File db = new File(dir,"data.db");
                Uri uri = FileProvider.getUriForFile(getApplicationContext(),authority,db);
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType(type);
                share.putExtra(Intent.EXTRA_STREAM,uri);
                startActivity(Intent.createChooser(share, title));
            }catch (Exception e){
                Toast toast = new Toast(getApplicationContext());
                toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG).show();
            }
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accept_database);
        Toast toast = new Toast(getApplicationContext());
        Intent intent = getIntent();
        Uri uri = intent.getParcelableExtra(intent.EXTRA_STREAM);
        File dir = getFilesDir();
        try {
            InputStream input = getContentResolver().openInputStream(uri);
            File f = new File(dir, "data.db");
            FileOutputStream output = new FileOutputStream(f);
            byte[] bt = new byte[1024];
            int c;
            while ((c = input.read(bt)) > 0) {
                output.write(bt, 0, c);
            }
            input.close();
            output.close();
            toast.makeText(getApplicationContext(), "成功打开数据库文件", Toast.LENGTH_SHORT).show();

            (new Thread(() -> {
                try {
                    SQLiteDatabase database = SQLiteDatabase.openOrCreateDatabase(f.getPath(), null, new DatabaseErrorHandler() {
                        public void onCorruption(SQLiteDatabase dbObj) {
                            toast.makeText(getApplicationContext(), "数据库文件解析失败", Toast.LENGTH_SHORT).show();
                        }
                    });
                    manager = new DatabaseManager(database);
                    toast.makeText(getApplicationContext(), "正在获取用户列表", Toast.LENGTH_SHORT).show();
                    manager.loadUser();
                    getUserHandler.sendEmptyMessage(0);
                } catch (Exception e) {
                    toast.makeText(getApplicationContext(), Log.getStackTraceString(e), Toast.LENGTH_SHORT).show();
                    Log.e("SQLite", Log.getStackTraceString(e));
                }
            })).run();

        } catch (IOException e) {
            Log.e("SQLite", Log.getStackTraceString(e));
            System.exit(-1);
        }
//        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }
}