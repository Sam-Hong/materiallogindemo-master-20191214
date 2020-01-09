package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class StatsMonthFive extends AppCompatActivity {

    String[] CategoryList = {"表5-1　查獲非法入出國統計—按月份分", "表5-1　查獲非法入出國統計—按月份分(續)"
            , "表5-2　查獲非法入出國統計—按單位分", "表5-2　查獲非法入出國統計—按單位分(續1)", "表5-2　查獲非法入出國統計—按單位分(續2)"
            ,"表5-2　查獲非法入出國統計—按單位分(續3)","表5-3　查獲非法入出國統計—按縣市分","表5-3　查獲非法入出國統計—按縣市分(續1)"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_month_five);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, CategoryList){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view =super.getView(position, convertView, parent);
                TextView textView= view.findViewById(android.R.id.text1);
                textView.setTextColor(Color.WHITE);
                return view;
            }
        };

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(StatsMonthFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/19DiuYjQzJKGgRzSizaypikhrjwm7fFtu/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(StatsMonthFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1fDAeU8FdbjeEwz9xd7eE9uBrsx1Thp2Z/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(StatsMonthFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1cf7W771u002cdM-BSjod_G6fJqk7DYws/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(StatsMonthFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Q773vOcpzg5S_ix1jQ1vxboIJITOygAx/preview");
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(StatsMonthFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1AjNAUJyHkmaPkUBvdHP_55ZqEzmkrogU/preview");
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(StatsMonthFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1m29hfbr5WwItooev-YEOkXjJJjFos9p-/preview");
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(StatsMonthFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1pHDe7i189C7K4IYVSRiZG6mBdjR8IreR/preview");
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent=new Intent(StatsMonthFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1qiWHpPQxyJ1Seg10C5ra1vUbSgnPzU84/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.stats_month5);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(itemClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_custom, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.home) {
            Intent i = new Intent(this, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        } else if (id == R.id.logout) {
            GlobalVariable gv = (GlobalVariable) getApplicationContext();
            gv.setLoginToken(false);
            Intent i = new Intent(this, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
