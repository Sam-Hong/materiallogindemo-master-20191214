package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
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

public class CgaAdminRulesActivity extends AppCompatActivity {

    String[] CategoryList = {"海岸巡防機關執行臺灣地區漁港及遊艇港安全檢查作業規定使用條例", "違反海岸巡防法罰鍰額度裁量基準使用條例", "海岸巡防機關國家賠償事件處理要點使用條例"
            ,"公務人員特種考試海岸巡防人員考試錄取人員分配實務訓練作業規定使用條例", "海岸巡防機關執行海上救難作業程序使用條例", "海岸巡防機關獲案毒品沒入物處理作業要點使用條例"
            ,"海岸巡防機關協請直轄市縣市政府災害防救團體或災害防救志願組織支援救災作業規定使用條例", "海岸巡防機關岸際雷達航跡資料申請作業要點使用條例", "海岸巡防機關處理拾得遺失物要點使用條例"
            ,"海岸巡防機關獎勵民眾提供犯罪線索協助破案實施要點使用條例", "海岸巡防機關受理民眾報案實施要點使用條例", "海岸巡防機關執行重大海洋油污染緊急應變計畫使用條例"
            ,"海岸巡防機關獎狀核頒要點使用條例", "海洋委員會海巡署門禁管制及停車場管理規定使用條例", "海岸巡防機關執行中西太平洋漁業委員會公海登臨檢查作業要點使用條例"
            ,"海岸巡防機關因應通資業務需求與民間通信業者以互惠方式交換站台要點使用條例", "海洋委員會海巡署署長電子信箱信件處理作業程序使用條例","海洋委員會海巡署文物陳列室管理規定使用條例"
            ,"海洋委員會海巡署性騷擾防治申訴調查及處理要點使用條例", "海岸巡防機關執行搜索扣押應行注意要點使用條例", "行政規則承接辦理使用條例", "海岸巡防機關執行臺灣地區商港及工業專用港安全檢查作業規定使用條例"
            ,"海岸巡防機關實施檢查注意要點使用條例", "海岸巡防法第十條第四項規定原具司法警察身分者之範圍釋示令使用條例"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cga_admin_rules);

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
                    Intent intent=new Intent(CgaAdminRulesActivity.this,CgaLawActivity.class);
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(CgaAdminRulesActivity.this,CgaCommandsActivity.class);
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(CgaAdminRulesActivity.this,CgaAdminRulesActivity.class);
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.cga_Admin_Rules);
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
