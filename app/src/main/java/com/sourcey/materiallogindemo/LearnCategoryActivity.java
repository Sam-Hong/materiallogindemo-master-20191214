package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class LearnCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_category);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(LearnCategoryActivity.this,LawCourseActivity.class);
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(LearnCategoryActivity.this,DutyCourseActivity.class);
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(LearnCategoryActivity.this,EnglishCourseActivity.class);
                    startActivity(intent);
                }
            }
        };
        ListView listView =(ListView) findViewById(R.id.list_courses);
        listView.setOnItemClickListener(itemClickListener);
    }
}
