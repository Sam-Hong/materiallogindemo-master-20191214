package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SopCategoryActivity extends AppCompatActivity {

    String List[] = {"海上巡防勤務", "安檢勤務", "協助漁工管理勤務", "岸際巡防勤務","走私案件查緝勤務","偷渡案件查緝勤務","其他違法案件查緝勤務","通報勤務","支援勤務","海岸巡防機關執法涉及原住民事務相關疑義問題集"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sop_category);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, List){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view =super.getView(position, convertView, parent);
                TextView textView=(TextView) view.findViewById(android.R.id.text1);
                textView.setTextColor(Color.WHITE);
                return view;
            }
        };
        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position==0){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cga.gov.tw/GipOpen/wSite/public/Attachment/51b3f7ee2baab26b5aa408e232d88a31.pdf"));
                    startActivity(browserIntent);
                }
                else if (position==1){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cga.gov.tw/GipOpen/wSite/public/Attachment/51b3f7ee2baab26b5aa408e232d88a32.pdf"));
                    startActivity(browserIntent);
                }
                else if (position==2){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cga.gov.tw/GipOpen/wSite/public/Attachment/51b3f7ee2baab26b5aa408e232d88a33.pdf"));
                    startActivity(browserIntent);
                }
                else if (position==3){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cga.gov.tw/GipOpen/wSite/public/Attachment/51b3f7ee2baab26b5aa408e232d88a34.pdf"));
                    startActivity(browserIntent);
                }
                else if (position==4){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cga.gov.tw/GipOpen/wSite/public/Attachment/51b3f7ee2baab26b5aa408e232d88a35.pdf"));
                    startActivity(browserIntent);
                }
                else if (position==5){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cga.gov.tw/GipOpen/wSite/public/Attachment/51b3f7ee2baab26b5aa408e232d88a36.pdf"));
                    startActivity(browserIntent);
                }
                else if (position==6){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cga.gov.tw/GipOpen/wSite/public/Attachment/51b3f7ee2baab26b5aa408e232d88a37.pdf"));
                    startActivity(browserIntent);
                }
                else if (position==7){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cga.gov.tw/GipOpen/wSite/public/Attachment/51b3f7ee2baab26b5aa408e232d88a38.pdf"));
                    startActivity(browserIntent);
                }
                else if (position==8){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cga.gov.tw/GipOpen/wSite/public/Attachment/51b3f7ee2baab26b5aa408e232d88a39.pdf"));
                    startActivity(browserIntent);
                }
                else if (position==9){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cga.gov.tw/GipOpen/wSite/public/Attachment/51b3f7ee2baab26b5aa408e232d88a40.pdf"));
                    startActivity(browserIntent);
                }
            }
        };
        ListView listview = (ListView) findViewById(R.id.sop);
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
