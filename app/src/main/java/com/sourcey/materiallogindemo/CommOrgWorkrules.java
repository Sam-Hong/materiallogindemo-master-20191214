package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CommOrgWorkrules extends AppCompatActivity {

    ListView simpleList;
    String[] List = {"pdf", "pdf", "pdf"};
    String[] flags = {"3海洋委員會海巡署各地區分署辦事細則總說明", "3海洋委員會海巡署各地區分署辦事細則", "3A附表-海洋委員會海巡署各地區分署內部單位設置表"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comm_org_workrules);

        simpleList = (ListView) findViewById(R.id.org_workrules);
        DutyAdapter dutyAdapter = new DutyAdapter(getApplicationContext(), List, flags);
        simpleList.setAdapter(dutyAdapter);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(CommOrgWorkrules.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1DTf6fIF7LTbxZ4FEav8KBkV4Em4G6B2n/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(CommOrgWorkrules.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1fc5HjrnF_5M9yQx95-FbiaE0BEtyDqOk/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(CommOrgWorkrules.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1HYXEvpSUjyT-0UBxJtRrkAYh_-xU3bz1/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listCourses=(ListView) findViewById(R.id.org_workrules);
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
