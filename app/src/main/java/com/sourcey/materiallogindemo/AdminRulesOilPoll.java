package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AdminRulesOilPoll extends AppCompatActivity {

    ListView simpleList;
    String[] List = {"pdf", "pdf", "pdf"};
    String[] flags = {"附件1", "附件2", "海岸巡防機關執行重大海洋油污染緊急應變計畫"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_rules_oil_poll);

        simpleList = (ListView) findViewById(R.id.AR_OilPoll);
        DutyAdapter dutyAdapter = new DutyAdapter(getApplicationContext(), List, flags);
        simpleList.setAdapter(dutyAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(AdminRulesOilPoll.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1TS_sq3b4izbYs0JPaTWj49kGt899eiRm/preview");
                    startActivity(intent);
                }
                else if (position==1)
                {
                    Intent intent=new Intent(AdminRulesOilPoll.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1CMG9_YwhE2k5kqXEowWS9UGkeAiIMTQ8/preview");
                    startActivity(intent);
                }
                else if (position==2)
                {
                    Intent intent=new Intent(AdminRulesOilPoll.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/18GGNoQ5ZKrtff7ZMJDEkVujYvppIalRf/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listCourses=(ListView) findViewById(R.id.AR_OilPoll);
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
