package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class EnglishCourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_course);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(EnglishCourseActivity.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1uFZC91rmoiHfaUoaF5jkopQLAs7waEgJ/view");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(EnglishCourseActivity.this,YoutubeViewActivity.class);
                    intent.putExtra("VIDEO_ID","fiPccRy6ZDw");
                    startActivity(intent);
                }
            }
        };
        ListView listCourses=(ListView) findViewById(R.id.list_englishs);
        listCourses.setOnItemClickListener(itemClickListener);
    }
}
