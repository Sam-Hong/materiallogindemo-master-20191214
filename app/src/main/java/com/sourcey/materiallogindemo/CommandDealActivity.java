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

public class CommandDealActivity extends AppCompatActivity {

    String[] CategoryList = {"海岸巡防機關人員使用器械致人傷亡財產損失醫療費慰撫金喪葬費補償金賠償金支給標準使用條例", "行政院功能業務與組織調整暫行條例施行期間原行政院海岸巡防署所屬軍職人員權益保障處理辦法使用條例"
            , "海岸巡防機關與警察移民及消防機關協調聯繫辦法使用條例", "行政院海岸巡防署與行政院農業委員會協調聯繫辦法使用條例", "行政院海岸巡防署與財政部協調聯繫辦法使用條例"
            , "行政院海岸巡防署與國防部協調聯繫辦法使用條例", "海岸巡防機關與環境保護機關協調聯繫辦法使用條例", "行政院海岸巡防署與交通部協調聯繫辦法使用條例"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command_deal);

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
                    Intent intent=new Intent(CommandDealActivity.this,CommDealCompen.class);
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(CommandDealActivity.this,CommDealReg.class);
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(CommandDealActivity.this,CommDealPF.class);
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(CommandDealActivity.this,CommDealAgr.class);
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(CommandDealActivity.this,CommDealMinFin.class);
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(CommandDealActivity.this,CommDealMinDef.class);
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(CommandDealActivity.this,CommDealEnvi.class);
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent=new Intent(CommandDealActivity.this,CommDealTrans.class);
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.command_deal);
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
