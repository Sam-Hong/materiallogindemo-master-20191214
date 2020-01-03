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

public class StatsYearOne extends AppCompatActivity {

    String[] CategoryList = {"表1-1　各類業務績效案件數與嫌犯人數統計—按月份分", "表1-2　各類海巡績效案件數統計—按單位分", "表1-2　各類海巡績效案件數統計—按單位分（續）"
            , "表1-3　各類業務績效案件數與嫌犯人數統計—按縣市分", "表1-4　各類業務績效案件數統計—按查獲時間及區域分", "表1-4　各類業務績效案件數統計—按查獲時間及區域分（續1）"
            , "表1-4　各類業務績效案件數統計—按查獲時間及區域分（續2完）", "表1-5　各類業務績效案件數統計─按查獲（處理）途徑分", "表1-6　海域地區業務績效案件數統計─按風力及浪高分"
            , "表1-7　各類業務績效嫌犯人數統計—按國籍分", "表1-8　各類業務績效嫌犯人數統計—按年齡分", "表1-8　各類業務績效嫌犯人數統計—按年齡分（續）"
            , "表1-9　各類業務績效嫌犯人數統計—按教育程度分", "表1-9　各類業務績效嫌犯人數統計—按教育程度分（續）", "表1-10　各類業務績效嫌犯人數統計—按職業分"
            , "表1-10　各類業務績效嫌犯人數統計—按職業分（續1）", "表1-10　各類業務績效嫌犯人數統計—按職業分（續2）", "表1-10　各類業務績效嫌犯人數統計—按職業分（續3完）"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_year_one);

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
                    Intent intent=new Intent(StatsYearOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1s2ukVx3zrG5ggaHXBjBFmPCGmXAsZQYB/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(StatsYearOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/143gtB5QsQQRQ-0AbrZ90aD3lETAELAox/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(StatsYearOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1onn0Qjqcfd1uI1vHVcBvB0P5RmpfYhj7/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(StatsYearOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/122ltYB-2HnncSb6FcPjBIZTRiSMBeOUV/preview");
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(StatsYearOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1EVTymdkPCPCdKk8cbty1MrvWMPVXXmmt/preview");
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(StatsYearOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1zsx7238Gqs8sk9ty6rgC6VGDDPv_qgvz/preview");
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(StatsYearOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/16cjyEaszbxwoBhcmMgIkKLZnyqgcCTJp/preview");
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent=new Intent(StatsYearOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Y1sQwfIgoF83t322JLP5CcYMDeNvt6sv/preview");
                    startActivity(intent);
                }
                else if (position==8){
                    Intent intent=new Intent(StatsYearOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Ehi1Yn4ae3_9hECVPXTI8RTqdTM6S0xy/preview");
                    startActivity(intent);
                }
                else if (position==9){
                    Intent intent=new Intent(StatsYearOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1C1DxA-hhohYyLOqZoXQjdYoFQ1kFgD6w/preview");
                    startActivity(intent);
                }
                else if (position==10){
                    Intent intent=new Intent(StatsYearOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1DklXr2yUeGE20DWkjs1f9b6OXLT3Va6v/preview");
                    startActivity(intent);
                }
                else if (position==11){
                    Intent intent=new Intent(StatsYearOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Egtq26JvgbrhPFUcdrKTKpHcxzoo8NuF/preview");
                    startActivity(intent);
                }
                else if (position==12){
                    Intent intent=new Intent(StatsYearOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/12dhhHvSSXlqOaKaiiT2dm3V7s3f0_iUl/preview");
                    startActivity(intent);
                }
                else if (position==13){
                    Intent intent=new Intent(StatsYearOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1bMAojMuQHLhInyuwr2JVRVC5PPSuAyVX/preview");
                    startActivity(intent);
                }
                else if (position==14){
                    Intent intent=new Intent(StatsYearOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/18TbayKKLGW2a3lpe2QPXg3zqU7Wc0Tg5/preview");
                    startActivity(intent);
                }
                else if (position==15){
                    Intent intent=new Intent(StatsYearOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1EWC28N53iT6ktPN5yl8WDAV8CsvExKbH/preview");
                    startActivity(intent);
                }
                else if (position==16){
                    Intent intent=new Intent(StatsYearOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1jd0s4mcbZkLwR0EpuXdsioBrZAbAxCET/preview");
                    startActivity(intent);
                }
                else if (position==17){
                    Intent intent=new Intent(StatsYearOne.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1p8FqfvrdcME4yhdwNS_inwvQdf3XoyGl/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.stats_year1);
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
