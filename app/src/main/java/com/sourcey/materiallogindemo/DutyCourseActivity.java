package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class DutyCourseActivity extends AppCompatActivity {

    ListView simpleList;
    String List[] = {"pdf", "pdf", "jpg", "youtube", "youtube", "youtube", "youtube", "pdf", "pdf"};
    String flags[] = {"海巡118專線運用", "非洲豬瘟防疫", "雙氣囊充氣式救生衣簡介", "水中自救-水母漂", "水中自救-仰漂", "水中自救-韻律呼吸", "CPR+AED", "槍械(炮)訓練規範", "綜合體技訓練手冊"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duty_course);

        simpleList = (ListView) findViewById(R.id.list_duties);
        DutyAdapter dutyAdapter = new DutyAdapter(getApplicationContext(), List, flags);
        simpleList.setAdapter(dutyAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(DutyCourseActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1j2ToDgvBb5r7107bs0ASDSzxZAJEX3IF/view");
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(DutyCourseActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1rOi24UscJLXsUBt_TZeAdGAAiUomKYEV/view");
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(DutyCourseActivity.this, ImageViewActivity.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(DutyCourseActivity.this, YoutubeViewActivity.class);
                    intent.putExtra("VIDEO_ID", "SnZcgk-azfs");
                    startActivity(intent);
                } else if (position == 4) {
                    Intent intent = new Intent(DutyCourseActivity.this, YoutubeViewActivity.class);
                    intent.putExtra("VIDEO_ID", "UOO8q6Cyy8g");
                    startActivity(intent);
                } else if (position == 5) {
                    Intent intent = new Intent(DutyCourseActivity.this, YoutubeViewActivity.class);
                    intent.putExtra("VIDEO_ID", "UkKUDzJ6PMY");
                    startActivity(intent);
                } else if (position == 6) {
                    Intent intent = new Intent(DutyCourseActivity.this, YoutubeViewActivity.class);
                    intent.putExtra("VIDEO_ID", "xkNShMfmPjI");
                    startActivity(intent);
                } else if (position == 7) {
                    Intent intent = new Intent(DutyCourseActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1ignS5qd2X9pa02EC6UKcjQMVgR6Fbzc4/view");
                    startActivity(intent);
                } else if (position == 8) {
                    Intent intent = new Intent(DutyCourseActivity.this, WebViewActivity.class);
                    intent.putExtra("url", "https://drive.google.com/file/d/1hgNKbTto6AOkZO4k21zXnjog2RKzr-Ri/view");
                    startActivity(intent);
                }
            }
        };
        ListView listCourses = (ListView) findViewById(R.id.list_duties);
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
            Intent i = new Intent(this, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        } else if (id == R.id.logout) {
            GlobalVariable gv = (GlobalVariable) getApplicationContext();
            gv.setLoginToken(false);
            Intent i = new Intent(this, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

}
