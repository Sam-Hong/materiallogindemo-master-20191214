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

public class StatsMonthTen extends AppCompatActivity {

    String[] CategoryList = {"表10-1　災難救護及服務工作統計—按月份分", "表10-1　災難救護及服務工作統計—按月份分(續1)"
            , "表10-2　災難救護及服務工作統計—按單位分", "表10-2　災難救護及服務工作統計—按單位分(續1)", "表10-2　災難救護及服務工作統計—按單位分(續2)"
            ,"表10-2　災難救護及服務工作統計—按單位分(續3)","表10-3　災難救護及服務工作統計—按縣市分","表10-3　災難救護及服務工作統計—按縣市分(續1)"
            ,"表10-4　救難統計—按事故原因及救助結果分","表10-4　救難統計—按事故原因及救助結果分(續1)","表10-5 　救難救生人員統計－按國籍、性別、救助結果分"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_month_ten);

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
                    Intent intent=new Intent(StatsMonthTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1t4HzAeRAS-DaQG2e32TEC3tL_xasnOBP/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(StatsMonthTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Umbnwpj8-gM8mx-V0K2Ekz9HZVHCMxRw/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(StatsMonthTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1SlMB8fJCN0SZ9O87qwMrFUa_M3wNISO_/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(StatsMonthTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1k3RgO2kfXSNIt7X40mFhXbGqxBdKuUpa/preview");
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(StatsMonthTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1NbJtbj47eQuN2eF8CmJmapXyk1huWh0N/preview");
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(StatsMonthTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1pQITOKbBnMB4gqQCc8JeMNyOZF2gpIud/preview");
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(StatsMonthTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1EhmJX16Cju9i-UE1SB5L8lUnl2kwNSc6/preview");
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent=new Intent(StatsMonthTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1mYj4gjxhYs-8wN07GkcFHMhRZTT5uIOm/preview");
                    startActivity(intent);
                }
                else if (position==8){
                    Intent intent=new Intent(StatsMonthTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1YA3gDhCAJdEZOa3oRySpEL7atQYChy9B/preview");
                    startActivity(intent);
                }
                else if (position==9){
                    Intent intent=new Intent(StatsMonthTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1j4AQLXLP5Yf-NtPNEO7JzuNFC0OZAd5i/preview");
                    startActivity(intent);
                }
                else if (position==10){
                    Intent intent=new Intent(StatsMonthTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1YYpuJSWOWLrFUiFzL2UwpS9f2miIl07G/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.stats_month10);
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
