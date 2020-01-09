package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AdminRulesCWPac extends AppCompatActivity {

    ListView simpleList;
    String[] List = {"pdf", "pdf", "pdf", "pdf", "pdf", "pdf", "pdf"};
    String[] flags = {"附件1_海域範圍圖", "附件2_通報受檢漁船船籍國", "附件3_登檢問卷_法文版", "附件3_登檢問卷_日文版"
            , "附件3_登檢問卷_中英文版", "附件4_公海登檢報告表", "海岸巡防機關執行中西太平洋漁業委員會公海登臨檢查作業要點"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_rules_cwpac);

        simpleList = (ListView) findViewById(R.id.AR_Cwpac);
        DutyAdapter dutyAdapter = new DutyAdapter(getApplicationContext(), List, flags);
        simpleList.setAdapter(dutyAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(AdminRulesCWPac.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1f5kUuQTFwor8x1cjuxwXsOOBsOjJujn7/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(AdminRulesCWPac.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1bl9_ZXT4xhVdTZqdgHKUkaJoFay91STd/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(AdminRulesCWPac.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1xemvOgURiPVBx9MM87x1GecFF49lvGb8/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(AdminRulesCWPac.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/18qb3OIDsMmkjG8xVFd9FChEqhVjzjjTJ/preview");
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(AdminRulesCWPac.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1SGorvqVFuk0_CDR0e59UP1_vSCT4i3yC/preview");
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(AdminRulesCWPac.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1A62yS_Sn7fLMsAnvm4ABKdaq9_sl2p5Q/preview");
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(AdminRulesCWPac.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1CQocrMhZkYkN9cRkt_8sH3Ci-DFV-vK9/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listCourses=(ListView) findViewById(R.id.AR_Cwpac);
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
