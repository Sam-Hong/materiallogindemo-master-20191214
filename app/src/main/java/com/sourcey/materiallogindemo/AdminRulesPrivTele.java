package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AdminRulesPrivTele extends AppCompatActivity {

    ListView simpleList;
    String[] List = {"pdf", "pdf", "pdf", "pdf"};
    String[] flags = {"附件一（申請程序）", "附件二（申請表）" , "附件三（契約範本）", "海岸巡防機關因應通資業務需求與民間通信業者以互惠方式交換站台要點"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_rules_priv_tele);

        simpleList = (ListView) findViewById(R.id.AR_PrivTele);
        DutyAdapter dutyAdapter = new DutyAdapter(getApplicationContext(), List, flags);
        simpleList.setAdapter(dutyAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(AdminRulesPrivTele.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1kGS-6vyts8t0oj97SMsid8tFRM9rmHWs/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(AdminRulesPrivTele.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/12012W4N5VDo__ORJwOearccCqpCKRQtu/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(AdminRulesPrivTele.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1aki9dAjdcvFZuAkKjG0mkNPYnFwl0uI_/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(AdminRulesPrivTele.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1R-dHRL2a9OH_JMPjTrpUtbuSVpdQlmEZ/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listCourses=(ListView) findViewById(R.id.AR_PrivTele);
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
