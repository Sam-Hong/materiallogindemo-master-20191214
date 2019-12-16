package com.sourcey.materiallogindemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainAdapter extends BaseAdapter {
    Context context;
    String List[];
    int flags[];
    LayoutInflater inflater;

    public MainAdapter(Context applicationContext, String[] List, int[] flags) {
        this.context = applicationContext;
        this.List = List;
        this.flags = flags;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return List.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_main_list_view, null);
        TextView mainlist = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        mainlist.setText(List[i]);
        icon.setImageResource(flags[i]);
        return view;
    }
}
