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

public class StatsMonthTwo extends AppCompatActivity {

    String[] CategoryList = {"表2-1　查獲槍砲彈藥刀械統計—按月份分", "表2-2　查獲槍砲彈藥刀械統計—按單位分", "表2-2　查獲槍砲彈藥刀械統計—按單位分（續）"
            , "表2-3　查獲槍砲彈藥刀械統計—按縣市分"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_month_two);

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
                    Intent intent=new Intent(StatsMonthTwo.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1RQK1cK74oOQJfCtpHFJED2Dvp0E-F0y2/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(StatsMonthTwo.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1tUa_DQc6PlTxyxOzet5K3zhJoG3vBr3e/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(StatsMonthTwo.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Rq4xTzr_hy3QnYJglwpVF25mT9fNn_cz/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(StatsMonthTwo.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1QCIZUzE7YKniCep4nKJvscSgEZOfH-QQ/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.stats_month2);
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
