package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AdminRulesCondSS extends AppCompatActivity {

    ListView simpleList;
    String[] List = {"pdf", "pdf", "pdf", "pdf", "pdf", "pdf"};
    String[] flags = {"附件一（海巡機關搜索票聲請書）", "附件二（搜索扣押筆錄）" ,"附件三（扣押物品收據無應扣押之物證明書）"
            , "附件四（扣押物品目錄表）", "附件一之一（海巡機關扣押裁定聲請書）", "海岸巡防機關執行搜索扣押應行注意要點"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_rules_cond_ss);

        simpleList = (ListView) findViewById(R.id.AR_CondSS);
        DutyAdapter dutyAdapter = new DutyAdapter(getApplicationContext(), List, flags);
        simpleList.setAdapter(dutyAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(AdminRulesCondSS.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1XSanTdlCXS7iiiWjNvrglxtNA-CNSFBr/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(AdminRulesCondSS.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1iVT_Xcc9c9uxp98N16hEkTuR0oQeJl9b/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(AdminRulesCondSS.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1yDHNe23LiiQ8lY_1_PgondcCeic93ztX/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(AdminRulesCondSS.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/17E2QWJzlGGRvnAyXU22qD_Q3pa4z2iMm/preview");
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(AdminRulesCondSS.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1GlQXZ8f72xjNU-AHjCcj3tXZmQ2kQd6K/preview");
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(AdminRulesCondSS.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1HV76a_gZgDP-3MsX_TptoZIlYxnCkCGP/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listCourses=(ListView) findViewById(R.id.AR_CondSS);
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
