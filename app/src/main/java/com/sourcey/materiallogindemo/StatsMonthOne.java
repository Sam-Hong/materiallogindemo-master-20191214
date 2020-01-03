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

public class StatsMonthOne extends AppCompatActivity {

    String[] CategoryList = {"表1-1　各類海巡績效案件數統計─按月份分", "表1-2　各類海巡績效案件數統計—按單位分", "表1-2　各類海巡績效案件數統計—按單位分（續）"
            , "表1-3　各類海巡績效案件數統計—按縣市分", "表1-4　各類海巡績效案件數統計—按查獲區域分", "表1-4　各類海巡績效案件數統計—按查獲區域分(續1)"
            , "表1-4　各類海巡績效案件數統計—按查獲區域分(續2)", "表1-4　各類海巡績效案件數統計—按查獲區域分(續3)", "表1-4　各類海巡績效案件數統計—按查獲區域分(續4)"
            , "表1-4　各類海巡績效案件數統計—按查獲區域分(續5完)", "表1-5　各類海巡績效嫌犯人數統計—按國籍及性別分", "表1-5　各類海巡績效嫌犯人數統計—按國籍及性別分(續1)"
            , "表1-5　各類海巡績效嫌犯人數統計—按國籍及性別分(續2)", "表1-5　各類海巡績效嫌犯人數統計—按國籍及性別分(續3)", "表1-5　各類海巡績效嫌犯人數統計—按國籍及性別分(續4)"
            , "表1-5　各類海巡績效嫌犯人數統計—按國籍及性別分(續5完)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_month_one);

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
                    Intent intent=new Intent(StatsMonthOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/14uMtBDAXBExDBLqk1jADLhhdRmdKDtPP/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(StatsMonthOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/143gtB5QsQQRQ-0AbrZ90aD3lETAELAox/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(StatsMonthOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1onn0Qjqcfd1uI1vHVcBvB0P5RmpfYhj7/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(StatsMonthOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1WRUvErf-J56adu7OxjlYQbA9U2p_CZPw/preview");
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(StatsMonthOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1QRfpu3flq-OlfYSl9p2BjBUBu-P4AQoS/preview");
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(StatsMonthOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1EuiPx9zb8XHpj1uhkvYr8M4P9x1rk_Sd/preview");
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(StatsMonthOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1r8A9b6veRthdqOpIomq4sfVWvb0qdWz0/preview");
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent=new Intent(StatsMonthOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1psHq2fDJbGKncI1InCJsCiN_GSi-CImP/preview");
                    startActivity(intent);
                }
                else if (position==8){
                    Intent intent=new Intent(StatsMonthOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1lHmKZEb6cugDhe7090OCnEY1e2IBRZtM/preview");
                    startActivity(intent);
                }
                else if (position==9){
                    Intent intent=new Intent(StatsMonthOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1r52p1t6U3VMwlNX2hdSmpbYirzVHH6r6/preview");
                    startActivity(intent);
                }
                else if (position==10){
                    Intent intent=new Intent(StatsMonthOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1nanW_hMAAzrHG1WCgkmoNmd5EVa4tW9m/preview");
                    startActivity(intent);
                }
                else if (position==11){
                    Intent intent=new Intent(StatsMonthOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1MS---i9ztd0KlmfV4eNVVxXvNTTUrst_/preview");
                    startActivity(intent);
                }
                else if (position==12){
                    Intent intent=new Intent(StatsMonthOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1vaLMXOINdSXrl6wHIzTWNFBHHYJvXBAO/preview");
                    startActivity(intent);
                }
                else if (position==13){
                    Intent intent=new Intent(StatsMonthOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1gKp_K1bZ4yVeQXMRyV7cjIdekewKrvXu/preview");
                    startActivity(intent);
                }
                else if (position==14){
                    Intent intent=new Intent(StatsMonthOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1J0j8eJ-d3F2dk7jAyvKWLqE-FCB0Hduw/preview");
                    startActivity(intent);
                }
                else if (position==15){
                    Intent intent=new Intent(StatsMonthOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1-ef0KOfKg42EF5fET78MEA4YON5boi4k/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.stats_month1);
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
