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

public class StatsYearNine extends AppCompatActivity {

    String[] CategoryList = {"表9-1 　維護海域海岸資源統計—按月份分", "表9-1 　維護海域海岸資源統計—按月份分（續）", "表9-2　維護海域海岸資源統計—按單位分"
            , "表9-2　維護海域海岸資源統計—按單位分（續1）", "表9-2　維護海域海岸資源統計—按單位分（續2）", "表9-2　維護海域海岸資源統計—按單位分（續3完）"
            , "表9-3　維護海域海岸資源統計—按縣市分", "表9-3　維護海域海岸資源統計—按縣市分（續）"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_year_nine);

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
                    Intent intent=new Intent(StatsYearNine.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1VN7eZlwczqxcljLTIF8kFaLpyGr1QVUi/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(StatsYearNine.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1LAfmbgQ5BiSNwoKgFka9O8sz2prKLF33/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(StatsYearNine.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1A0E-yo13Xlyft9rVpw-6WnQ_dBrrlYdT/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(StatsYearNine.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1mpJVW912zFSKfwLFwTp5xs2_oqXIzp9Q/preview");
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(StatsYearNine.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1X8sFaa4rlqUo-Lbxflo8qFDzy89etCv0/preview");
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(StatsYearNine.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1I6q7Z1p9X0OOK72yce7b_Ex4l0Ok5vPh/preview");
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(StatsYearNine.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1A0E-yo13Xlyft9rVpw-6WnQ_dBrrlYdT/preview");
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent=new Intent(StatsYearNine.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1HFDr0nlcVRZnb4B8AneyXvjnd1wlbmwY/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.stats_year9);
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
