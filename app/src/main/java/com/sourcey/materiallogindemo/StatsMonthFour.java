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

public class StatsMonthFour extends AppCompatActivity {

    String[] CategoryList = {"表4-1　查獲私運農林漁畜產品及其他物品統計—按月份分", "表4-2　查獲私運農林漁畜產品及其他物品統計—按單位分"
            , "表4-2　查獲私運農林漁畜產品及其他物品統計—按單位分(續1)", "表4-3　查獲私運農林漁畜產品及其他物品統計—按縣市分", "表4-4　查獲私運菸、酒統計—按月份分"
            ,"表4-5　查獲私運菸、酒統計—按單位分","表4-5　查獲私運菸、酒統計—按單位分(續1)","表4-6　查獲私運菸、酒統計—按縣市分"
            ,"表4-7　查獲私運農產品統計—按月份分","表4-7　查獲私運農產品統計—按月份分(續1)","表4-8　查獲私運漁產品—按月份分"
            ,"表4-8　查獲私運漁產品—按月份分(續1)","表4-9　查獲私運畜產品統計—按月份分","表4-9　查獲私運畜產品統計—按月份分(續1)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_month_four);

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
                    Intent intent=new Intent(StatsMonthFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1D76hHf3sHdP1fvJuCgTFOHL4fea-28xH/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(StatsMonthFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1iYtrn1nCnm8cyDEJ3LjUXdTIODmt30vR/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(StatsMonthFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/19-8bDIhFSQm6oMN-NtWubufeiHE7ohNl/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(StatsMonthFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/13QGCzWqvspwO-ffDQHsw5jrBR0PhLksx/preview");
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(StatsMonthFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1hsQ3hLg-Y-3HxUUR-1xyQItKqZgT0SyY/preview");
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(StatsMonthFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1hMlyMBcfhvs43QKZQCzNQXhA5DUZlEI-/preview");
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(StatsMonthFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1xRqUKdOQHP6Ab_LSdj6kv7zYQPqcVPNx/preview");
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent=new Intent(StatsMonthFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/17o2p4geGgIxoMCQf7oX76D1w0yGgfg7s/preview");
                    startActivity(intent);
                }
                else if (position==8){
                    Intent intent=new Intent(StatsMonthFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1A_LEzABrE1Uj2jJS4kiqI-YJRsGHnTZ7/preview");
                    startActivity(intent);
                }
                else if (position==9){
                    Intent intent=new Intent(StatsMonthFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1QyzEAZNzENx-_1hhp9pvr8FNLJjyq_ZX/preview");
                    startActivity(intent);
                }
                else if (position==10){
                    Intent intent=new Intent(StatsMonthFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1QggDgGK57o_1BU1Xb81qVrqY6p1H44n3/preview");
                    startActivity(intent);
                }
                else if (position==11){
                    Intent intent=new Intent(StatsMonthFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1XUiS6pVJ2PaT4s0wk8NS4nx-Sv-qcYRb/preview");
                    startActivity(intent);
                }
                else if (position==12){
                    Intent intent=new Intent(StatsMonthFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1LjqnQCA6s1j0c-JhmAal7_FFKF62LFtE/preview");
                    startActivity(intent);
                }
                else if (position==13){
                    Intent intent=new Intent(StatsMonthFour.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1r6wI2_58kE3IG4_8D9KBS4ksohGhRnva/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.stats_month4);
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
