package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CommandOrgActivity extends AppCompatActivity {

    String[] CategoryList = {"本署及所屬機關構編制表使用條例", "海洋委員會海巡署處務規程使用條例", "海洋委員會海巡署各地區分署組織準則使用條例"
            , "海洋委員會海巡署各地區分署辦事細則使用條例", "海洋委員會海巡署偵防分署組織規程使用條例", "海洋委員會海巡署偵防分署辦事細則使用條例"
            , "海洋委員會海巡署教育訓練測考中心組織規程使用條例", "海洋委員會海巡署教育訓練測考中心辦事細則使用條例"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command_org);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, CategoryList){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view =super.getView(position, convertView, parent);
                TextView textView= view.findViewById(android.R.id.text1);
                textView.setTextColor(Color.WHITE);
                return view;
            }
        };

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(CommandOrgActivity.this,CommOrgTable.class);
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(CommandOrgActivity.this,CommOrgProcedure.class);
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(CommandOrgActivity.this,CommOrgGuidelines.class);
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(CommandOrgActivity.this,CommOrgWorkrules.class);
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(CommandOrgActivity.this,CommOrgOrgrules.class);
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(CommandOrgActivity.this,CommOrgTestingreg.class);
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(CommandOrgActivity.this,CommOrgPIrules.class);
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent=new Intent(CommandOrgActivity.this,CommOrgTesting.class);
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.command_org);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(itemClickListener);
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
