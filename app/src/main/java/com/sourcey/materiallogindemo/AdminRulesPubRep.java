package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AdminRulesPubRep extends AppCompatActivity {

    ListView simpleList;
    String[] List = {"pdf", "pdf", "pdf", "pdf", "pdf", "pdf", "pdf"};
    String[] flags = {"海岸巡防機關受理民眾報案實施要點", "附件1", "附件2", "附件3(受理報案三聯單)", "附件4(報案三聯單填寫內容及要領)",
    "附件5(填寫交付及保存報案三聯單權責)", "附件6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_rules_pub_rep);

        simpleList = (ListView) findViewById(R.id.AR_PubRep);
        DutyAdapter dutyAdapter = new DutyAdapter(getApplicationContext(), List, flags);
        simpleList.setAdapter(dutyAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(AdminRulesPubRep.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1v-8Zj4LalO5M6aQYghtRPgPHvwMmsTKf/preview");
                    startActivity(intent);
                }
                else if (position==1)
                {
                    Intent intent=new Intent(AdminRulesPubRep.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1UyDUbZgJSk6phjXHV0wHmTjJC4EDpHFW/preview");
                    startActivity(intent);
                }
                else if (position==2)
                {
                    Intent intent=new Intent(AdminRulesPubRep.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1RcBvP_cuFYQTyIaAPvNrWMuJ2jNABFfx/preview");
                    startActivity(intent);
                }
                else if (position==3)
                {
                    Intent intent=new Intent(AdminRulesPubRep.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Lt4HMP_rY94Eifao2MFwWdu7HOYbL9gN/preview");
                    startActivity(intent);
                }
                else if (position==4)
                {
                    Intent intent=new Intent(AdminRulesPubRep.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/17d7TKM4bIw4ZJQJV1WGioJUNHsZd8DV7/preview");
                    startActivity(intent);
                }
                else if (position==5)
                {
                    Intent intent=new Intent(AdminRulesPubRep.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1O-aO3xEJIv6pK2dUAIw-qLiDkLylbixf/preview");
                    startActivity(intent);
                }
                else if (position==6)
                {
                    Intent intent=new Intent(AdminRulesPubRep.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1RIDaiHombmpcd6AhzH-xLDdmktnVWk72/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listCourses=(ListView) findViewById(R.id.AR_PubRep);
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
