package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AdminRulesShoRad extends AppCompatActivity {

    ListView simpleList;
    String[] List = {"pdf", "pdf", "pdf", "pdf"};
    String[] flags = {"海岸巡防機關岸際雷達航跡資料申請作業要點", "附件1", "附件2", "附件3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_rules_sho_rad);

        simpleList = (ListView) findViewById(R.id.AR_ShoRad);
        DutyAdapter dutyAdapter = new DutyAdapter(getApplicationContext(), List, flags);
        simpleList.setAdapter(dutyAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(AdminRulesShoRad.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1cM2XYgwIT3DRE2TqqHBLpiSZIrS6Iphc/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(AdminRulesShoRad.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Kf5ymw74O-PzSGeAi1Hi7Fas2-tyfSuA/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(AdminRulesShoRad.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1INNbZ4kV8MSFHl6VktQxgKHqPTEBACiG/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(AdminRulesShoRad.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1NQp5_ip3thmvOEI49cXNC2uluJZgiFxI/preview");
                    startActivity(intent);
                }

            }
        };
        ListView listCourses=(ListView) findViewById(R.id.AR_ShoRad);
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
