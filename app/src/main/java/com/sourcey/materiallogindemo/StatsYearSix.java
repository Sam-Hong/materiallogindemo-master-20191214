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

public class StatsYearSix extends AppCompatActivity {

    String[] CategoryList = {"表6-1　查獲人口販運統計—按月份分", " 表6-2　查獲人口販運統計—按單位分", "表6-2　查獲人口販運統計—按單位分（續）"
            , "表6-3　查獲人口販運統計—按縣市分", "表6-4　查獲人口販運被害人統計—按年齡及性別分", "表6-6　查獲人口販運被害人統計—按職業及性別分"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_year_six);

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
                    Intent intent=new Intent(StatsYearSix.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1iOV4QrlePH7HSjCd_cDooV-8P9IfvZJI/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(StatsYearSix.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1s-WRdHg4crPfyxvCabAHUGmKMToLyNqa/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(StatsYearSix.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1xP-VGhqCg0dFR5o4wzzK0_JAgLcPYMY3/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(StatsYearSix.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/15kOL2chqRB16l3F7RADRtmPnoiVsQuCw/preview");
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(StatsYearSix.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1dPzNdVC6gc4hmIvAfXwBAD0tA6NLKvmu/preview");
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(StatsYearSix.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/11UKcpA8XB1LB2eNrIgEoFGPEIgbUWGlk/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.stats_year6);
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
