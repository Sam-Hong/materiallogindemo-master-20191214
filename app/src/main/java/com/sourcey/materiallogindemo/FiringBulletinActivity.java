package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class FiringBulletinActivity extends AppCompatActivity {

    ListView simpleList;
    String[] List = {"pdf", "pdf", "pdf", "pdf", "pdf", "pdf", "pdf", "pdf", "pdf", "pdf"
        , "pdf", "pdf", "pdf", "pdf", "pdf", "pdf", "pdf", "pdf", "pdf", "pdf"
        , "pdf", "pdf", "pdf", "pdf", "pdf", "pdf"
    };
    String[] flags = {"(108)署巡勤射字第199號-國防部空軍司令部","(108)署巡勤射字第198號-國防部海軍司令部", "(108)署巡勤射字第197號-國防部陸軍司令部", "(108)署巡勤射字第196號-國防部空軍司令部"
            , "(108)署巡勤射字第195號-國家中山科學研究院", "(108)署巡勤射字第194號-國防部陸軍司令部", "(108)署巡勤射字第193號-國家中山科學研究院"
            , "(108)署巡勤射字第192號-國防部軍備局規格鑑測中心兵器試驗場", "(108)署巡勤射字第180號-國防部軍備局規格鑑測中心兵器試驗場", "(108)署巡勤射字第179號-國防部海軍司令部艦隊指揮部"
            , "(108)署巡勤射字第178號-國防部陸軍司令部", "(108)署巡勤射字第177號-國家中山科學研究院", "(108)署巡勤射字第176號-國防部海軍司令部", "(108)署巡勤射字第175號-國防部陸軍司令部"
            , "(108)署巡勤射字第174號-國防部陸軍司令部", "(108)署巡勤射字第173號-國防部海軍司令部", "(108)署巡勤射字第172號-國防部海軍司令部", "(108)署巡勤射字第171號-國防部陸軍司令部金門防衛指揮部"
            , "(108)署巡勤射字第170號-國防部海軍司令部艦隊指揮部", "(108)署巡勤射字第169號-國家中山科學研究院", "(108)署巡勤射字第168號-國防部陸軍司令部東引地區指揮部", "(108)署巡勤射字第167號-國防部陸軍司令部馬祖防衛指揮部"
            , "(108)署巡勤射字第166號-國家中山科學研究院", "(108)署巡勤射字第165號-海洋委員會海巡署", "(108)署巡勤射字第164號-國防部海軍司令部", "(108)署巡勤射字第163號-國防部陸軍司令部金門防衛指揮部"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firing_bulletin);

        simpleList = (ListView) findViewById(R.id.list_firing_bulletin);
        DutyAdapter BulletinAdapter = new DutyAdapter(getApplicationContext(), List, flags);
        simpleList.setAdapter(BulletinAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/16vpIWLtMsJ6lIXffK3p-su0xun9jN9-o/preview");
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/142SARV61OjS2VXtoChcnnMwGVKPqedtr/preview");
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1FCT3wJ-9NLLGt3CU9FXB5x6zf93SILqu/preview");
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1xQ43N68gdTm9NUp1C8ZpWCauHkLd_mX9/preview");
                    startActivity(intent);
                } else if (position == 4) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1VXWs6d8uRW0O_PNF8KZ-c6IobtZazBqc/preview");
                    startActivity(intent);
                } else if (position == 5) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/16ZNvYa1wQEEk0xKTRvSVdwAQu-BSUpqE/preview");
                    startActivity(intent);
                } else if (position == 6) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1rXlGyh0LTyEqjAJGQB5FFbdtI9xSi9AC/preview");
                    startActivity(intent);
                } else if (position == 7) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1i_oxy-xngzhx0mDjp_IKIK4RJQCuJBPt/preview");
                    startActivity(intent);
                } else if (position == 8) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1QfeTmf6RhjTXu1Leqzd5zRm9FVGOTUhD/preview");
                    startActivity(intent);
                } else if (position == 9) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/18_H_6iwh8t9HEGFRntOBedpVKcyX626t/preview");
                    startActivity(intent);
                } else if (position == 10) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1fs4-WsSYbkuVGg6hjIyMbtGlGOdm0LlQ/preview");
                    startActivity(intent);
                } else if (position == 11) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1UIuktUKFUNeVUklhiKgihlxZwQYnsr-K/preview");
                    startActivity(intent);
                } else if (position == 12) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/14906_LIb7vFZXL7bNZfoXPusQ4Vunbl8/preview");
                    startActivity(intent);
                } else if (position == 13) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1o28g0QqRT14TeEAQoboojs7mvV3ZSPi8/preview");
                    startActivity(intent);
                } else if (position == 14) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1GvGIPOuxeSN560H3DU4TVOzqiiTOIU9n/preview");
                    startActivity(intent);
                } else if (position == 15) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1THMGqJaLBeNMq0StBotbxZEWSok66yba/preview");
                    startActivity(intent);
                } else if (position == 16) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1XBpS_phXHzq_B1tC3o3UOFuw10RnbGod/preview");
                    startActivity(intent);
                } else if (position == 17) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1Xbk6QqFQkeYU9PEUUc5vFdK9Ij4paMTR/preview");
                    startActivity(intent);
                } else if (position == 18) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1PMIH-oDXT0bE-EYjXHFLswh2S5xAetn3/preview");
                    startActivity(intent);
                } else if (position == 19) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1kLVOgFtt5rI6zzo5FZYXHzsSK4esRvzC/preview");
                    startActivity(intent);
                } else if (position == 20) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/13U3tObZHqV-S4hekjYU874l8AGLP2tlI/preview");
                    startActivity(intent);
                } else if (position == 21) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1OEo7iqX7Nhfcub75OJi9oPpX5qcBy4T4/preview");
                    startActivity(intent);
                } else if (position == 22) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1USXejW-iqSaOEzi-qV_rstK2Tsk-NMFX/preview");
                    startActivity(intent);
                } else if (position == 23) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1soDvASl4T-QFcpf0ZNvEJXO5ycAPg0yn/preview");
                    startActivity(intent);
                } else if (position == 24) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1tYkWsRpbHagiaEXy3atn7F03WUlDiKqW/preview");
                    startActivity(intent);
                } else if (position == 25) {
                    Intent intent = new Intent(FiringBulletinActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1crBUEA5bYbqcZj6NDONEC4EqANnFB50x/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listCourses=(ListView) findViewById(R.id.list_firing_bulletin);
        listCourses.setOnItemClickListener(itemClickListener);
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
            Intent i=new Intent(this,MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        }
        else if (id==R.id.logout){
            GlobalVariable gv=(GlobalVariable)getApplicationContext();
            gv.setLoginToken(false);
            Intent i=new Intent(this,MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

}
