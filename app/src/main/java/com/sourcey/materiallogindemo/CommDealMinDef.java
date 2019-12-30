package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CommDealMinDef extends AppCompatActivity {


    ListView simpleList;
    String[] List = {"pdf"};
    String[] flags = {"行政院海岸巡防署與國防部協調聯繫辦法"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comm_deal_min_def);

        simpleList = (ListView) findViewById(R.id.deal_min_def);
        DutyAdapter dutyAdapter = new DutyAdapter(getApplicationContext(), List, flags);
        simpleList.setAdapter(dutyAdapter);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(CommDealMinDef.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1TNbK9Hdw8KFc7Jd_nVlE3MLYeKQSJtdS/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listCourses=(ListView) findViewById(R.id.deal_min_def);
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
