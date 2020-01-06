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

public class StatsYearEleven extends AppCompatActivity {

    String[] CategoryList = {"表11-1　其他海巡績效統計—按月份分", "表11-1　其他海巡績效統計—按月份分(續1)", "表11-1　其他海巡績效統計—按月份分(續2完)"
            , "表11-2　其他海巡績效統計—按單位分", "表11-2　其他海巡績效統計—按單位分（續1）", "表11-2　其他海巡績效統計—按單位分（續2）"
            , "表11-2　其他海巡績效統計—按單位分（續3）", "表11-2　其他海巡績效統計—按單位分（續4）", "表11-2　其他海巡績效統計—按單位分（續5完）"
            , "表11-3　其他海巡績效統計—按縣市分", "表11-3　其他海巡績效統計—按縣市分(續1)", "表11-3　其他海巡績效統計—按縣市分(續2完)"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_year_eleven);

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
                    Intent intent=new Intent(StatsYearEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1-b7LLqbngCh2iTQsJ3sRVnB6M7UEdFlv/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(StatsYearEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1dA251MkBxgM9cuUjbLobPAerFN8Sft6I/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(StatsYearEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1aDzgYEcwWq5_JGRATkClBMWoaBT2PE59/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(StatsYearEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1qOVimc7XZ0YwiMGu9eWrFvQDiyr67ZRr/preview");
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(StatsYearEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1aTmnde1vS3iIXRciB8PO1C88aPuoaCUK/preview");
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(StatsYearEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/113wFYa5NfMPJSMY07Lqgx3_TM0cCoBqC/preview");
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(StatsYearEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1auRK7D_19pEteLSx_tGz01tmWFdhyOQS/preview");
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent=new Intent(StatsYearEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1lgQWbid0_1tS8TNBx5qpKQUcMLDULzZ0/preview");
                    startActivity(intent);
                }
                else if (position==8){
                    Intent intent=new Intent(StatsYearEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1ygoCqNLPlPpVulgtGJSFqTUERZuPZV2I/preview");
                    startActivity(intent);
                }
                else if (position==9){
                    Intent intent=new Intent(StatsYearEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1AyqfW-Y3od1rco9U_8OsZSGK8ZDW06CE/preview");
                    startActivity(intent);
                }
                else if (position==10){
                    Intent intent=new Intent(StatsYearEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1aVAoYi65HXXaeU5LagHq6mYE4d0SK8Ft/preview");
                    startActivity(intent);
                }
                else if (position==11){
                    Intent intent=new Intent(StatsYearEleven.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1hA3zbhCL0i_thUbIV_fx5KOWPyB-YXhe/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.stats_year11);
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
