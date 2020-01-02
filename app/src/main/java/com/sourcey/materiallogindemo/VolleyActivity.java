package com.sourcey.materiallogindemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class VolleyActivity extends AppCompatActivity {

    RequestQueue requestQueue;

//    static final int INTERNET_REQ = 23;
    static final String REQ_TAG = "VACTIVITY";
    TextView serverResp;
//    ImageView serverImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volley);

        serverResp = (TextView)findViewById(R.id.server_resp);
        serverResp.setMovementMethod(new ScrollingMovementMethod());
//        serverImg = (ImageView)findViewById(R.id.server_img);

        requestQueue = RequestQueueSingleton.getInstance(this.getApplicationContext())
                .getRequestQueue();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (requestQueue != null) {
            requestQueue.cancelAll(REQ_TAG);
        }
    }
    /*public void  getStringResponse(View v){
        String url = getResources().getString(R.string.get_url);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        serverResp.setText("String Response : "+ response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                serverResp.setText("Error getting response");
            }
        });
        stringRequest.setTag(REQ_TAG);
        requestQueue.add(stringRequest);
    }
    public void  getStringResponsePost(View v){

        final String storeName = "xyz";
        final String couponType = "sale";

        String url = getResources().getString(R.string.post_url);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, getPostResponseListener()
                , getPostErrorListener()){
            protected Map<String, String> getParams() throws com.android.volley.AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                params.put("name", storeName);
                params.put("type", couponType);
                return params;
            };
        };
        stringRequest.setTag(REQ_TAG);
        requestQueue.add(stringRequest);
    }
    private Response.Listener<String> getPostResponseListener(){
        return new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                serverResp.setText("String Response : "+ response);
            }
        };
    }
    private Response.ErrorListener getPostErrorListener(){
        return new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                serverResp.setText("Error getting response");
            }
        };
    }*/
    public void  getJsonResponse(View v){
        JSONObject json = new JSONObject();
        try {
            json.put("identification","A228582124");
            json.put("birthday","Cga00000");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        String url = getResources().getString(R.string.json_login_url);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url, json,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        serverResp.setText("String Response : "+ response.toString());
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                serverResp.setText("Error getting response");
            }
        });
        jsonObjectRequest.setTag(REQ_TAG);
        requestQueue.add(jsonObjectRequest);
    }
    public void  getJsonResponsePost(View v){

        JSONObject json = new JSONObject();
        try {
            json.put("password","Cga11111");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        String url = getResources().getString(R.string.json_reset_url);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url, json,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        serverResp.setText("String Response : "+ response.toString());
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                serverResp.setText("Error getting response");
            }
        })
        {
            /* Passing some request headers*/
            @Override
            public Map<String,String> getHeaders() {
                Map<String, String> headers = new HashMap<String, String>();
                headers.put("Authorization", "Basic QTIyODU4MjEyNDozOThhNTI0Zjg3MGUxYjJiYzkzZmYyYjkyNzE5MDRhMw==");
                return headers;
            }
        };
        jsonObjectRequest.setTag(REQ_TAG);
        requestQueue.add(jsonObjectRequest);
    }
    /*public void  getImage(View v){

        String url = getResources().getString(R.string.image_url);
        ImageRequest imageRequest = new ImageRequest(url,
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap response) {
                        serverImg.setImageBitmap(response);
                    }
                },0, 0,null, null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                serverResp.setText("Error getting response");
            }
        });
        imageRequest.setTag(REQ_TAG);
        requestQueue.add(imageRequest);
    }*/
}