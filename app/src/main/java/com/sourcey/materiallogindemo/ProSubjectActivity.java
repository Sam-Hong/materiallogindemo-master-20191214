package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ProSubjectActivity extends AppCompatActivity {

    ListView simpleList;
    String[] List = {"pdf", "pdf", "pdf", "pdf"};
    String[] flags = {"數位攝影機 (學習時間15分鐘)", "PVS-7頭戴式夜視鏡(學習時間10分鐘)"
            , "紅外線熱影像系統 (學習時間15分鐘)", "智慧型港區監視系統 (學習時間15分鐘)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_subject);

        simpleList = (ListView) findViewById(R.id.list_Pro_Subject);
        DutyAdapter dutyAdapter = new DutyAdapter(getApplicationContext(), List, flags);
        simpleList.setAdapter(dutyAdapter);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(ProSubjectActivity.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1zz8rp8fL80Dv0OMix6fI07S9pcbu06eH/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(ProSubjectActivity.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1GFy1CkfHjuv27YWLRCxfuuQMvB7r8iFg/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(ProSubjectActivity.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1cFdcQYjGyBAFsUJwAElzSA479uMORht3/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(ProSubjectActivity.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1q0u3yml3es8ZbOt0M-AcsbrfjQiwdwIP/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listCourses=(ListView) findViewById(R.id.list_Pro_Subject);
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

