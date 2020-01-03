package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private boolean login_token;
    ListView simpleList;
    String List[] = {"海巡法規", "射擊通報", "海巡統計", "標準作業程序", "特殊船舶", "數位學習","常見船舶","變更密碼"};
    int flags[] = {R.drawable.opt01, R.drawable.opt02, R.drawable.opt03, R.drawable.opt04, R.drawable.opt05, R.drawable.opt06,R.drawable.opt07,R.drawable.opt08};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = (ListView) findViewById(R.id.list_options);
        MainAdapter mainAdapter = new MainAdapter(getApplicationContext(), List, flags);
        simpleList.setAdapter(mainAdapter);

        GlobalVariable gv=(GlobalVariable)getApplicationContext();
        login_token=gv.getLoginToken();
        if(login_token!=true){
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {

                if (position==0) {
                    Intent intent=new Intent(MainActivity.this,CgaRegulationsActivity.class);
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(MainActivity.this,FiringBulletinActivity.class);
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(MainActivity.this,SopCategoryActivity.class);
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(MainActivity.this,LearnCategoryActivity.class);
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(MainActivity.this,CommonShipCategoryActivity.class);
                    startActivity(intent);
                }
                else if(position==7){
                    Intent intent=new Intent(MainActivity.this,ChangePasswordCategoryActivity.class);
                    startActivity(intent);
                }

            }
        };
        ListView listView =(ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.logout) {
            GlobalVariable gv=(GlobalVariable)getApplicationContext();
            gv.setLoginToken(false);
            Intent i=new Intent(this,LoginActivity.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
