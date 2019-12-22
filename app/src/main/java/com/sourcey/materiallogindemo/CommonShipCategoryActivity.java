package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CommonShipCategoryActivity extends AppCompatActivity {

    String List[] = {"巡防艦船艇", "科研調查船", "漁船", "其他"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_ship_category);

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
                    Intent intent=new Intent(CommonShipCategoryActivity.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/17VGpuhCmhxPCQUqDq8dVPAE2sA31Eqo6/view");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(CommonShipCategoryActivity.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1LtBeDawOcPsKRkO4S86JI1DYiJ5HAP0f/view");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(CommonShipCategoryActivity.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1QOexkB584J2WWTxphelN1KBM1rmdSl_I/view");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(CommonShipCategoryActivity.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1YU0XWAz2L9fRI-Z1EQkMmE6YeIVLibP8/view");
                    startActivity(intent);
                }
            }
        };
        ListView listview = (ListView) findViewById(R.id.common_ship_list);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(itemClickListener);
    }
}
