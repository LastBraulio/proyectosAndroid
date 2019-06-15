package com.example.darkm.miapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

public class ObjectoJSON extends AppCompatActivity {

    JsonObjectRequest arrays;
    RequestQueue opRequestQuerius;
    private final String url = "http://api.geonames.org/citiesJSON?north=44.1&south=-9.9&east=-22.4&west=55.2&lang=de&username=demo";
    public final String TAG ="Pruebita";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objecto_json);

        opRequestQuerius = VolleySingleton.Getinstances().getpRequestQuery();
        arrays = new JsonObjectRequest(Request.Method.GET,url,"", new Response.Listener <JSONObject>(){
            @Override
            public void onResponse(JSONObject response){
                Log.d(TAG,response.toString() );
            }
        }, new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error){
                Log.d(TAG,error.toString() );
            }
        });

        opRequestQuerius.add(arrays);
    }

}
