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

public class CgStatsMonthActivity extends AppCompatActivity {

    String[] CategoryList = {"凡例", "提要分析", " 壹、業務績效綜合概況", "貳、查獲槍砲彈藥刀械", "參、查獲毒品"
            , "肆、查獲私運農林漁畜產品及其他物品", "伍、查獲非法入出國", "陸、查獲人口販運", "柒、查獲經濟犯罪之專案工作"
            , "捌、取締非法越區捕魚", "玖、維護海域海岸資源", "拾、災難救護及服務工作", "拾壹、其他海巡績效"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cg_stats_month);

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
                    Intent intent=new Intent(CgStatsMonthActivity.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1KKxjKmZtnpnUwMVKXDkLQI4HysbNgE-a/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(CgStatsMonthActivity.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/192fIyE4nNs16R563m4aPJICpSKfW7F8b/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(CgStatsMonthActivity.this,StatsMonthOne.class);
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(CgStatsMonthActivity.this,StatsMonthTwo.class);
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(CgStatsMonthActivity.this,StatsMonthThree.class);
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(CgStatsMonthActivity.this,StatsMonthFour.class);
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(CgStatsMonthActivity.this,StatsMonthFive.class);
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent=new Intent(CgStatsMonthActivity.this,StatsMonthSix.class);
                    startActivity(intent);
                }
                else if (position==8){
                    Intent intent=new Intent(CgStatsMonthActivity.this,StatsMonthSeven.class);
                    startActivity(intent);
                }
                else if (position==9){
                    Intent intent=new Intent(CgStatsMonthActivity.this,StatsMonthEight.class);
                    startActivity(intent);
                }
                else if (position==10){
                    Intent intent=new Intent(CgStatsMonthActivity.this,StatsMonthNine.class);
                    startActivity(intent);
                }
                else if (position==11){
                    Intent intent=new Intent(CgStatsMonthActivity.this,StatsMonthTen.class);
                    startActivity(intent);
                }
                else if (position==12){
                    Intent intent=new Intent(CgStatsMonthActivity.this,StatsMonthEleven.class);
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.stats_month);
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
