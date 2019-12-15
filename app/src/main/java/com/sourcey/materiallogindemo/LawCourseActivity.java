package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class LawCourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law_course);

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
}
