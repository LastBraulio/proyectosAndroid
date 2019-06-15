package com.example.darkm.miapp1;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by darkm on 02/27/2017.
 */

public class VolleySingleton {

    private static VolleySingleton instance = null;
    private RequestQueue pRequestQuery;
    private VolleySingleton()
    {
        pRequestQuery = Volley.newRequestQueue(MyApplication.getAppContext());
    }
    public static VolleySingleton Getinstances()
    {
        if (instance ==null) {
            instance = new VolleySingleton();
        }
        return instance;
    }

    public RequestQueue getpRequestQuery() {
        return pRequestQuery;
    }

    public void AddQueue(){

    }
}
