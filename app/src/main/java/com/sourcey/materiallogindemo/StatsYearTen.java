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

public class StatsYearTen extends AppCompatActivity {

    String[] CategoryList = {"表10-1　災難救護及服務工作統計—按月份分", "表10-1　災難救護及服務工作統計—按月份分（續）", "表10-2　災難救護及服務工作統計—按單位分"
            , "表10-2　災難救護及服務工作統計—按單位分（續1）", "表10-2　災難救護及服務工作統計—按單位分（續2）", "表10-2　災難救護及服務工作統計—按單位分（續3完）"
            , "表10-3　災難救護及服務工作統計—按縣市分", "表10-3　災難救護及服務工作統計—按縣市分（續）", "表10-4　救難統計—按船舶種類及事故地點分"
            , "表10-4　救難統計—按船舶種類及事故地點分(續)", "表10-5　救難統計—按事故原因及救助結果分", "表10-5　救難統計—按事故原因及救助結果分(續1)"
            , "表10-5　救難統計—按事故原因及救助結果分（續2完）", "表10-6　海域地區遭難船舶統計—按風力及浪高分", "表10-7　海域地區遭難船舶統計－按船舶種類、噸位、國籍分"
            , "表10-8 　救難、救生人員統計－按國籍、性別、救助結果分"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_year_ten);

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
                    Intent intent=new Intent(StatsYearTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1x66vfcu1QyuCYZK6yapf7i4f6y-5U1DS/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(StatsYearTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1iynKvDktBmTPlD_Jl3XD2xbeRJOtgo17/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(StatsYearTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1w34IsNdKQqIDUnW8k2HLsBZhXfTMs2BR/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(StatsYearTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1hHuhN1J2SQ9KLHMjxR23vBYZxGMJyu19/preview");
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(StatsYearTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1fRfaxDteb8o7h2vJfyKUnC9dFlbJz_E2/preview");
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(StatsYearTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1hQxdWLvRP8lemvQm1P59nePhQIZcgda0/preview");
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(StatsYearTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1EhmJX16Cju9i-UE1SB5L8lUnl2kwNSc6/preview");
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent=new Intent(StatsYearTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1oDvkL24rlhFJDZkc1h6nVL7F-6YtuX16/preview");
                    startActivity(intent);
                }
                else if (position==8){
                    Intent intent=new Intent(StatsYearTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1D1VMDHXp-VYCqctL2BMSUhqDUgHkD_Q6/preview");
                    startActivity(intent);
                }
                else if (position==9){
                    Intent intent=new Intent(StatsYearTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1eOpsJWAAVLRs3VCoTzNpo7Mg2FbihW8b/preview");
                    startActivity(intent);
                }
                else if (position==10){
                    Intent intent=new Intent(StatsYearTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1sg3S1TvN2LyhAgpHpeNAGx9y_El_DTIB/preview");
                    startActivity(intent);
                }
                else if (position==11){
                    Intent intent=new Intent(StatsYearTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1sg3S1TvN2LyhAgpHpeNAGx9y_El_DTIB/preview");
                    startActivity(intent);
                }
                else if (position==12){
                    Intent intent=new Intent(StatsYearTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/14cpWnIin53P3t8d3kDBxpZB5ga79ehbM/preview");
                    startActivity(intent);
                }
                else if (position==13){
                    Intent intent=new Intent(StatsYearTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/17wEMrF5q2FPhMOzWvqna4IkOX6Ifnzpp/preview");
                    startActivity(intent);
                }
                else if (position==14){
                    Intent intent=new Intent(StatsYearTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1c0XKcUQO7Q8T6Rl8I65Lt5gLVZORuLOf/preview");
                    startActivity(intent);
                }
                else if (position==15){
                    Intent intent=new Intent(StatsYearTen.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1sfaN4V_BG0vPgoZT5BPAuHq5eMaK1I3o/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.stats_year10);
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
