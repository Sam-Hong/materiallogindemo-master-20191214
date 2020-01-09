package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AdminRulesParkMan extends AppCompatActivity {

    ListView simpleList;
    String[] List = {"pdf", "pdf", "pdf" ,"pdf"};
    String[] flags = {"附件一", "附件二", "附件三", "海洋委員會海巡署門禁管制及停車場管理規定"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_rules_park_man);

        simpleList = (ListView) findViewById(R.id.AR_ParkMan);
        DutyAdapter dutyAdapter = new DutyAdapter(getApplicationContext(), List, flags);
        simpleList.setAdapter(dutyAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(AdminRulesParkMan.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1grg7C67guBaOYEZAPTEWedqllTwmvYsV/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(AdminRulesParkMan.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Y6vY13PjSWMpDKWVGjHo1Xk1lVwB1YW1/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(AdminRulesParkMan.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1CY49mqGElQgcm8W9Shedwt3N0ko48yat/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(AdminRulesParkMan.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1fJn2TRd8GcW4dVADft51a2ARiM4L31mq/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listCourses=(ListView) findViewById(R.id.AR_ParkMan);
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
