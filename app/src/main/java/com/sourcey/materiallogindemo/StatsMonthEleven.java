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

public class StatsMonthEleven extends AppCompatActivity {

    String[] CategoryList = {"表11-1　其他海巡績效統計—按月份分", "表11-1　其他海巡績效統計—按月份分(續1)"
            , "表11-1　其他海巡績效統計—按月份分(續2完)", "表11-2　其他海巡績效統計—按單位分", "表11-2　其他海巡績效統計—按單位分（續1）"
            ,"表11-2　其他海巡績效統計—按單位分（續2）","表11-2　其他海巡績效統計—按單位分（續3）","表11-2　其他海巡績效統計—按單位分（續4）"
            ,"表11-2　其他海巡績效統計—按單位分（續5完）","表11-3　其他海巡績效統計—按縣市分","表11-3　其他海巡績效統計—按縣市分(續1)"
            ,"表11-3　其他海巡績效統計—按縣市分(續2完)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_month_eleven);

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
                    Intent intent=new Intent(StatsMonthEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/14U1JMn3e30uV0hCy1mDbIjKTJUk_7U8G/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(StatsMonthEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1_oKujG6ApnN3zxy8lwUFv3Hmw0l4hjUR/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(StatsMonthEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1FvZ1t_PyVV_MVSScfpH3AjeD3KZsI0LT/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(StatsMonthEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/13eh1zdoVgeHqck3m3thb-n5rDnu_onTE/preview");
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(StatsMonthEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1JJm3IDw6puIgDLYw0uQn6eRFMJN4Rtgs/preview");
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(StatsMonthEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/15NMJB527Q9LWOkW7D0ctZuQT6qlw5aX2/preview");
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(StatsMonthEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1JOX1j3AD8Y8pZZUp5Bvee6qPbGw3QZLq/preview");
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent=new Intent(StatsMonthEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1J3Mx_nUnmMbNYtFS88uwek7VlGCJiI07/preview");
                    startActivity(intent);
                }
                else if (position==8){
                    Intent intent=new Intent(StatsMonthEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1wXQ6c8BcaDDfIJxbc15214aez1lxhrj_/preview");
                    startActivity(intent);
                }
                else if (position==9){
                    Intent intent=new Intent(StatsMonthEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1etpsDKOuz3i9SDXBUcouDdzFjvmNG_TQ/preview");
                    startActivity(intent);
                }
                else if (position==10){
                    Intent intent=new Intent(StatsMonthEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1-i-OTUsjclSZq6nSQ_9AJelC54MaDhPO/preview");
                    startActivity(intent);
                }
                else if (position==11){
                    Intent intent=new Intent(StatsMonthEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1CUv0Q7Hl3YQxHfnTq8xB9nSHwhknHYjF/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.stats_month11);
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
