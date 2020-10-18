package com.pkunorun.pkunorunhelper;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DatabaseManager {
    public static SQLiteDatabase database;
    public List<UserItem> userItemList = new ArrayList<UserItem>();

    public DatabaseManager(SQLiteDatabase database) {
        this.database = database;
        ensureDatabaseAvailable();
    }

    // check if database is valid
    // currently ignore this
    public void ensureDatabaseAvailable() {
        Cursor c = database.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
        HashMap<String, Boolean> checkList = new HashMap<String, Boolean>() {{
            put("user", false);
            put("record", false);
            put("track", false);
        }};
        while (c.moveToNext()) {
            String v = c.getString(0);
            if(checkList.containsKey(v)){
                checkList.replace(v, true);
            }
        }
        if(!checkList.get("user")){
            database.execSQL("CREATE TABLE 'user' ( 'id'TEXT PRIMARY KEY, 'PESpecialty' INTEGER ,'department' TEXT ,'gender' INTEGER ,'name' TEXT ,'offline' INTEGER ,'token' TEXT )");
        }
        if(!checkList.get("record")){
            database.execSQL("CREATE TABLE 'record' ( 'id' INTEGER PRIMARY KEY AUTOINCREMENT, 'date' INTEGER ,'detailed' INTEGER ,'distance' INTEGER ,'duration' INTEGER ,'invalidReason' INTEGER ,'photoName' TEXT ,'photoRemotePath' TEXT ,'placeHint' TEXT ,'recordId' INTEGER ,'step' INTEGER ,'uploaded' INTEGER ,'userId' TEXT ,'verified' INTEGER )");
        }
        if(!checkList.get("track")){
            database.execSQL("CREATE TABLE 'track' ( 'id' INTEGER PRIMARY KEY AUTOINCREMENT, 'latitude' REAL ,'longitude' REAL ,'recordDbId' INTEGER ,'sequence' INTEGER ,'status' INTEGER )");
        }
        c.close();
    }

    public boolean loadUser() {
        String[] columns = {
                "name", "id"
        };
        Cursor cursor = database.query("user", columns, null, null, null, null, null);
        while (cursor.moveToNext()) {
            userItemList.add(new UserItem(cursor.getString(0), cursor.getString(1)));
        }
        cursor.close();
        return true;
    }

    public long appendRecord(String userId, long dateUTC, float distance, float duration, int step) {
        ContentValues contentValues = new ContentValues();

        contentValues.put("userId", userId);
        contentValues.put("date", dateUTC);
        contentValues.put("distance", distance * 1000);
        contentValues.put("duration", duration);
        contentValues.put("step", step);
        contentValues.put("detailed", 1);
        contentValues.put("invalidReason", 0);
        contentValues.put("recordId", -1);
        contentValues.put("uploaded", 0);
        contentValues.put("verified", 1);

        return database.insert("record", null, contentValues);
    }

    public boolean appendTrack(long recordDbId, List<LatitudeLongitudeItem> lat_lon_list) {
        int i = 0;
        for (LatitudeLongitudeItem latitudeLongitudeItem : lat_lon_list) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("latitude", latitudeLongitudeItem.latitude);
            contentValues.put("longitude", latitudeLongitudeItem.longitude);
            contentValues.put("recordDbId", recordDbId);
            contentValues.put("status", 0);
            contentValues.put("sequence", i);
            database.insert("track", null, contentValues);
            i += 1;
        }
        return true;
    }
}
