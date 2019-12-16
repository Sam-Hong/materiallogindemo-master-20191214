package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class LawCourseActivity extends AppCompatActivity {

    ListView simpleList;
    String List[] = {"pdf","pdf","pdf","pdf"};
    String flags[] = {"海岸巡防法","動植物檢疫法規","災害防救法規","水域遊憩法規"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law_course);

        simpleList = (ListView) findViewById(R.id.list_laws);
        LawAdapter lawAdapter = new LawAdapter(getApplicationContext(), List, flags);
        simpleList.setAdapter(lawAdapter);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(LawCourseActivity.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Y-OuKwJqmJhhhxN2Z1-pbwA2nxmRQf4C/view");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(LawCourseActivity.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1cVOgovq3xGNGptl_ac9aCmNQoWTC0-AX/view");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(LawCourseActivity.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1-oVByDeftG4CCHui2AZcAiBcuC77hhv_/view");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(LawCourseActivity.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1bjj1lj5ZiS5G7Wu_OIcd6wrHkTBmi_3q/view");
                    startActivity(intent);
                }
            }
        };
        ListView listCourses=(ListView) findViewById(R.id.list_laws);
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
