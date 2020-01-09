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

public class StatsYearFive extends AppCompatActivity {

    String[] CategoryList = {"表5-1　查獲非法入出國統計—按月份分", "表5-1　查獲非法入出國統計—按月份分（續）", "表5-2　查獲非法入出國統計—按單位分"
            , " 表5-2　查獲非法入出國統計—按單位分（續1）", "表5-2　查獲非法入出國統計—按單位分（續2）", "表5-2　查獲非法入出國統計—按單位分（續3完）"
            , "表5-3　查獲非法入出國統計—按縣市分", "表5-3　查獲非法入出國統計—按縣市分（續）", "表5-4　查獲非法入出國偷渡犯統計—按年齡及性別分"
            , "表5-6　查獲非法入出國偷渡犯統計—按職業及性別分", "表5-7　查獲非法入出國偷渡犯統計—按出發地點及上岸地點分", "表5-7　查獲非法入出國偷渡犯統計—按出發地點及上岸地點分(續1)"
            , "表5-7　查獲非法入出國偷渡犯統計—按出發地點及上岸地點分(續2)", "表5-7　查獲非法入出國偷渡犯統計—按出發地點及上岸地點分(續3)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_year_five);

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
                    Intent intent=new Intent(StatsYearFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1xFN_P4Tz3Py9pmRbk9q-3yDmJL6c_eIl/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(StatsYearFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/15oBF01Jh65VFrGpwKhurpEzRx6kXqrEI/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(StatsYearFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1mMqMRMbmyY1btd_w9rHmkoRoRT7NxtaS/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(StatsYearFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1_FG8c1yb5ELpCVVh2O0lAUTn607zb5z6/preview");
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(StatsYearFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1DAgfjB28UOBAjUMjz90_pgWTP2cra6YD/preview");
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(StatsYearFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1XpkwvKWjIhtPgvecbEbQWC690CJ135SY/preview");
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(StatsYearFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1VmdhfLzOkHy5cp_Z_rP3DRmcd5NwY5Kg/preview");
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent=new Intent(StatsYearFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1SJh279T-YJDgeJgY3POuaerpcbW-ikXi/preview");
                    startActivity(intent);
                }
                else if (position==8){
                    Intent intent=new Intent(StatsYearFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1bMGrT3rGWiGmnBayEBlK6PetIt8ppIAd/preview");
                    startActivity(intent);
                }
                else if (position==9){
                    Intent intent=new Intent(StatsYearFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1oTNkuNgkNr_1qaaO3OeZ_wYXD7IR4jvW/preview");
                    startActivity(intent);
                }
                else if (position==10){
                    Intent intent=new Intent(StatsYearFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1vcYEQujmM1uPxhPBnjoiE6HuNW5f1EbK/preview");
                    startActivity(intent);
                }
                else if (position==11){
                    Intent intent=new Intent(StatsYearFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1KYt8f_4CScTUnCdFTynROvPCaTVpv1Lo/preview");
                    startActivity(intent);
                }
                else if (position==12){
                    Intent intent=new Intent(StatsYearFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Cjxrn1693Ybh1UleFhwhQzYWf2-CCkN6/preview");
                    startActivity(intent);
                }
                else if (position==13){
                    Intent intent=new Intent(StatsYearFive.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1f8QuyGP0fSQZWJzJXXzwepL3Dx777IlY/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.stats_year5
        );
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
