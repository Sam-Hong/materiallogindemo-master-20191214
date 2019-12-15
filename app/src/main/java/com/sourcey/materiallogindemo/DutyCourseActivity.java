package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class DutyCourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duty_course);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(DutyCourseActivity.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1j2ToDgvBb5r7107bs0ASDSzxZAJEX3IF/view");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(DutyCourseActivity.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1rOi24UscJLXsUBt_TZeAdGAAiUomKYEV/view");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(DutyCourseActivity.this,ImageViewActivity.class);
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(DutyCourseActivity.this,YoutubeViewActivity.class);
                    intent.putExtra("VIDEO_ID","SnZcgk-azfs");
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(DutyCourseActivity.this,YoutubeViewActivity.class);
                    intent.putExtra("VIDEO_ID","UOO8q6Cyy8g");
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(DutyCourseActivity.this,YoutubeViewActivity.class);
                    intent.putExtra("VIDEO_ID","UkKUDzJ6PMY");
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(DutyCourseActivity.this,YoutubeViewActivity.class);
                    intent.putExtra("VIDEO_ID","xkNShMfmPjI");
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent=new Intent(DutyCourseActivity.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1ignS5qd2X9pa02EC6UKcjQMVgR6Fbzc4/view");
                    startActivity(intent);
                }
                else if (position==8){
                    Intent intent=new Intent(DutyCourseActivity.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1hgNKbTto6AOkZO4k21zXnjog2RKzr-Ri/view");
                    startActivity(intent);
                }
            }
        };
        ListView listCourses=(ListView) findViewById(R.id.list_duties);
        listCourses.setOnItemClickListener(itemClickListener);
    }

}
