package com.sourcey.materiallogindemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class LawAdapter extends BaseAdapter {
    Context context;
    String List[];
    String flags[];
    LayoutInflater inflater;

    public LawAdapter(Context applicationContext, String[] List, String[] flags) {
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
        view = inflater.inflate(R.layout.activity_law_list_view, null);
        TextView firstlist = (TextView) view.findViewById(R.id.textView1);
        TextView secondlist = (TextView) view.findViewById(R.id.textView2);
        firstlist.setText(List[i]);
        secondlist.setText(flags[i]);
        return view;
    }
}
