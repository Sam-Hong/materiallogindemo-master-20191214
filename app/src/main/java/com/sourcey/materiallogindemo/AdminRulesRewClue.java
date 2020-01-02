package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AdminRulesRewClue extends AppCompatActivity {

    ListView simpleList;
    String[] List = {"pdf", "pdf", "pdf", "pdf", "pdf"};
    String[] flags = {"海岸巡防機關獎勵民眾提供犯罪線索協助破案實施要點", "附件1", "附件2", "附件3", "附件4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_rules_rew_clue);

        simpleList = (ListView) findViewById(R.id.AR_RewClue);
        DutyAdapter dutyAdapter = new DutyAdapter(getApplicationContext(), List, flags);
        simpleList.setAdapter(dutyAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(AdminRulesRewClue.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1NWJuuv9StH2OzVpiexol4NLxdvsjAk8u/preview");
                    startActivity(intent);
                }
                else if (position==1)
                {
                    Intent intent=new Intent(AdminRulesRewClue.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/11PxMM170Yme6z-JJw8XyIzs24YSA_wi0/preview");
                    startActivity(intent);
                }
                else if (position==2)
                {
                    Intent intent=new Intent(AdminRulesRewClue.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1n0hjzltDGKD0z9FL4MVqYcf85T0BSnaa/preview");
                    startActivity(intent);
                }
                else if (position==3)
                {
                    Intent intent=new Intent(AdminRulesRewClue.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1jeCBkUMytHDph32nrymwg4A-ot8zDrcr/preview");
                    startActivity(intent);
                }
                else if (position==4)
                {
                    Intent intent=new Intent(AdminRulesRewClue.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1lNkYELCg6TsO_U8YNvOQAM0wue6OXYj3/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listCourses=(ListView) findViewById(R.id.AR_RewClue);
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
