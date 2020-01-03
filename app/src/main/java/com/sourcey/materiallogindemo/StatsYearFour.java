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

public class StatsYearFour extends AppCompatActivity {

    String[] CategoryList = {"表4-1　查獲私運農林漁畜產品及其他物品統計—按月份分", "表4-2　查獲私運農林漁畜產品及其他物品統計—按單位分", "表4-2　查獲私運農林漁畜產品及其他物品統計—按單位分（續）"
            , "表4-3　查獲私運農林漁畜產品及其他物品統計—按縣市分", "表4-4　查獲私運菸、酒統計—按月份分", "表4-5　查獲私運菸、酒統計—按單位分"
            ,"表4-5　查獲私運菸、酒統計—按單位分（續）", "表4-6　查獲私運菸、酒統計—按縣市分", "表4-7　查獲私運農林漁畜產品及其他物品統計—按來源地及來源管道分"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_year_four);

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
                    Intent intent=new Intent(StatsYearFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1D76hHf3sHdP1fvJuCgTFOHL4fea-28xH/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(StatsYearFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1J_mU6uLrhJbfziU5-xNrkp-h0N459OHD/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(StatsYearFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1RR0EkGJM1M8x_js3R0tWDoml1tPlhdAn/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(StatsYearFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1uCx11IyWVDB0kOnsUrgTNv_BBihB2eti/preview");
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(StatsYearFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1EgifdO4ftJdRYeRwiUhyNT0Yg8HMaTI0/preview");
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(StatsYearFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/10nWEDP7-waZblkbxOIe6eDC9O_8Fgi3J/preview");
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(StatsYearFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/11GO3RcxWfcf_-LWbWVB0VNvNqcNJy2jK/preview");
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent=new Intent(StatsYearFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1r5JfluALJaheKa_UP46H0_uKzvl-6G2e/preview");
                    startActivity(intent);
                }
                else if (position==8){
                    Intent intent=new Intent(StatsYearFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1J__L6jQ3MQEGt29L2vhRvE6sqo3JIPhl/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.stats_year4);
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
