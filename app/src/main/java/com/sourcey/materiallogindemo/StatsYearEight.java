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

public class StatsYearEight extends AppCompatActivity {

    String[] CategoryList = {"表8-1　取締非法越區捕魚統計—按月份分", "表8-2　取締非法越區捕魚統計—按單位分", "表8-2　取締非法越區捕魚統計—按單位分（續）"
            , "表8-3　取締非法越區捕魚統計—按縣市分", "表8-4　取締非法越區捕魚統計—按發生時間分", "表8-5　取締非法越區捕魚統計─按風力及浪高分"
            , "表8-5　取締非法越區捕魚統計─按風力及浪高分（續1）", "表8-5　取締非法越區捕魚統計─按風力及浪高分（續2完）"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_year_eight);

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
                    Intent intent=new Intent(StatsYearEight.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1hW1I2XnOZc44rRM85wfIW7Vrl_ysO6IJ/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(StatsYearEight.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1GYcHnsLYclNsia_flHiluZ2ihSRovI1n/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(StatsYearEight.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1GYcHnsLYclNsia_flHiluZ2ihSRovI1n/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(StatsYearEight.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Ug35GfDPe1EVk4NhwoIzQeizc-OKQ5YL/preview");
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(StatsYearEight.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Ug35GfDPe1EVk4NhwoIzQeizc-OKQ5YL/preview");
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(StatsYearEight.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Ug35GfDPe1EVk4NhwoIzQeizc-OKQ5YL/preview");
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(StatsYearEight.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1rY6gS3YD8QWbFN6NOVSe6crg4O0FaY_J/preview");
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent=new Intent(StatsYearEight.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1rY6gS3YD8QWbFN6NOVSe6crg4O0FaY_J/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.stats_year8);
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
