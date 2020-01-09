package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
//Parent == CommandIaActivity

public class CommRules extends AppCompatActivity {

    ListView simpleList;
    String[] List = {"pdf","pdf","pdf","pdf","pdf","pdf","pdf","pdf","pdf","pdf","pdf","pdf","pdf","pdf","pdf"};
    String[] flags = {"帽徽圖樣", "帽飾圖樣", "海岸巡防機關服制規則", "附圖1至10", "附圖11", "附圖12", "附圖13", "附圖14", "附圖15", "附圖16", "附圖17"
    , "附圖18", "附表1(制式說明書)", "附表2（配戴對照表）", "附表3（制服穿著時機一覽表）"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comm_rules);

        simpleList = (ListView) findViewById(R.id.comm_rules);
        DutyAdapter dutyAdapter = new DutyAdapter(getApplicationContext(), List, flags);
        simpleList.setAdapter(dutyAdapter);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(CommRules.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1xz-aY6tVuFipyhLV7LqK6Ja_F4yNyqAm/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(CommRules.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1K5PJo88gy7AnzQi2uaNhpT97ExRqggTr/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(CommRules.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1uW3MoV1cgCU02mNo_zU6veyT5kZRiBYH/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(CommRules.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1lr8_DEi4X5a4L4Uv_1Ji9mi0Huu99GJW/preview");
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(CommRules.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/17ZQvseeFK7i3SqLmo79mINz_uny6mAFJ/preview");
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(CommRules.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/15bhZl9Pew4DirRVB31y-EvDB42lW9T9F/preview");
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(CommRules.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1ld-vCXgJp6kAbfbyB4TZaeXUsAj8A7or/preview");
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent=new Intent(CommRules.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Xq-k8SsA-ycawCxB_dDVHGCLCD67CONF/preview");
                    startActivity(intent);
                }
                else if (position==8){
                    Intent intent=new Intent(CommRules.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1zgeh1GN8RKmbh_Gj8iUyCn81CxR1bAWv/preview");
                    startActivity(intent);
                }
                else if (position==9){
                    Intent intent=new Intent(CommRules.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Ut5wxEqjLYm58uNBO9USWS34jVmKNEWM/preview");
                    startActivity(intent);
                }
                else if (position==10){
                    Intent intent=new Intent(CommRules.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1FygdOekVVMgK17u8D8Wnl61SONntr32A/preview");
                    startActivity(intent);
                }
                else if (position==11){
                    Intent intent=new Intent(CommRules.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Szl11PpjD3s3eQVfjhrDmXgMSmGz5xm-/preview");
                    startActivity(intent);
                }
                else if (position==12){
                    Intent intent=new Intent(CommRules.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1eC0VnpzgB4HRwgdxSpFe50s-U4EpUF1u/preview");
                    startActivity(intent);
                }
                else if (position==13){
                    Intent intent=new Intent(CommRules.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/11DeZtioDshSF_0qLBsSgJ0N2LcrJLYjP/preview");
                    startActivity(intent);
                }
                else if (position==14){
                    Intent intent=new Intent(CommRules.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1W0idtxu-eRtIJMFWgf70jhOwp1Pybdln/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listCourses=(ListView) findViewById(R.id.comm_rules);
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
