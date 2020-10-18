package com.pkunorun.pkunorunhelper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class UserSpinnerAdapter extends BaseAdapter {
    private final List<UserItem> userItemList;
    private final Context context;

    public UserSpinnerAdapter(Context context, List<UserItem> userItemList) {
        this.userItemList = userItemList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return userItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return userItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    class ViewHolder {
        TextView name;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        UserItem data = (UserItem) getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.user_spinner_item, null);
            viewHolder = new ViewHolder();
            viewHolder.name = (TextView) view.findViewById(R.id.user_spinner_item);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.name.setText(String.format("%s\t%s", data.name, data.userId));
        return view;
    }

}
