package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class LearnCategoryActivity extends AppCompatActivity {

    ListView simpleList;
    String CategoryList[] = {"法律法規", "勤務專業", "海巡英文"};
    int flags[] = {R.drawable.alt05, R.drawable.alt06, R.drawable.alt07};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_category);

        simpleList = (ListView) findViewById(R.id.list_courses);
        CategoryAdapter categoryAdapter = new CategoryAdapter(getApplicationContext(), CategoryList, flags);
        simpleList.setAdapter(categoryAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(LearnCategoryActivity.this, LawCourseActivity.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(LearnCategoryActivity.this, DutyCourseActivity.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(LearnCategoryActivity.this, EnglishCourseActivity.class);
                    startActivity(intent);
                }
            }
        };
        ListView listView = (ListView) findViewById(R.id.list_courses);
        listView.setOnItemClickListener(itemClickListener);
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
