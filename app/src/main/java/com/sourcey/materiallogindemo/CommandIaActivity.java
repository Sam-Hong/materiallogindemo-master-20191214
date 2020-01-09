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

public class CommandIaActivity extends AppCompatActivity {

    String[] CategoryList = {"海岸巡防機關人員司法警察專長訓練辦法使用條例", "行政院公告變更管轄權使用條例", "海岸巡防機關服制規則使用條例"
            , "海岸巡防機關受理遊艇出海報備表格及程序使用條例", "海岸巡防機關配備器械種類規格表使用條例"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command_ia);

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
                    Intent intent=new Intent(CommandIaActivity.this,CommTraining.class);
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(CommandIaActivity.this,CommJurisdiction.class);
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(CommandIaActivity.this,CommRules.class);
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(CommandIaActivity.this,CommProcedures.class);
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(CommandIaActivity.this,CommSheet.class);
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.command_ia);
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
