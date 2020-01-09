package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CommOrgTable extends AppCompatActivity {
    ListView simpleList;
    String[] List = {"pdf","pdf","pdf","pdf","pdf","pdf","pdf","pdf","pdf","pdf"};
    String[] flags = {"01海洋委員會海巡署編制表", "02海洋委員會海巡署北部分署編制表","03海洋委員會海巡署中部分署編制表","04海洋委員會海巡署南部分署編制表"
            ,"05海洋委員會海巡署東部分署編制表","06海洋委員會海巡署金馬澎分署編制表","07海洋委員會海巡署東南沙分署編制表","08海洋委員會海巡署艦隊分署編制表"
            ,"09海洋委員會海巡署偵防分署編制表","10海洋委員會海巡署教育訓練測考中心編制表"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comm_org_table);

        simpleList = (ListView) findViewById(R.id.org_table);
        DutyAdapter dutyAdapter = new DutyAdapter(getApplicationContext(), List, flags);
        simpleList.setAdapter(dutyAdapter);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(CommOrgTable.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1iXnmr6mC1GOcpDdi9eba_FmsZ68sdt5F/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(CommOrgTable.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/17HHxaXuMrfNe0bdgiiGdvocC47QTwQw-/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(CommOrgTable.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/11c4-uHwCnHpOLB2WyhZMyuzs9t7aaVRg/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(CommOrgTable.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1J4Sn5NSxgwq-KS3tm8it3qawI4DTyO0O/preview");
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(CommOrgTable.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1ysyd_lKJZaLtLmJ3luGLacypmwjdC_O6/preview");
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(CommOrgTable.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1T31qJMvp_3Bm3L5LaWAkgkv-__XmAxhj/preview");
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(CommOrgTable.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1oYTJOO5dI8rscni7SIKdAbeErcBExzpT/preview");
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent=new Intent(CommOrgTable.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1us2iK_7cjch-eevBkenl0CGbZoGYRnGx/preview");
                    startActivity(intent);
                }
                else if (position==8){
                    Intent intent=new Intent(CommOrgTable.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1g6d0zqKwYo7b5552kz3yfYqsbC7JXheI/preview");
                    startActivity(intent);
                }
                else if (position==9){
                    Intent intent=new Intent(CommOrgTable.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1t5EadP7JV9EgLrhviVuvOtOcaW4Bpqpp/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listCourses=(ListView) findViewById(R.id.org_table);
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