package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AdminRulesComIndPort extends AppCompatActivity {

    ListView simpleList;
    String[] List = {"pdf", "pdf", "pdf"};
    String[] flags = {"海岸巡防機關執行臺灣地區商港及工業專用港安全檢查作業規定", "附件1 檢查紀錄表", " 附件2 排班檢查表"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_rules_com_ind_port);

        simpleList = (ListView) findViewById(R.id.AR_ComIndPort);
        DutyAdapter dutyAdapter = new DutyAdapter(getApplicationContext(), List, flags);
        simpleList.setAdapter(dutyAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(AdminRulesComIndPort.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1FMru39C9OU7jDEeQZnODF36Fy7RcqTJN/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(AdminRulesComIndPort.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1td85MJtOUF-DnTdTupGYXyznMSJgtlxe/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(AdminRulesComIndPort.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1VUEj8gF3gX7TBcxJF024SRjEAl7XZc7A/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listCourses=(ListView) findViewById(R.id.AR_ComIndPort);
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
