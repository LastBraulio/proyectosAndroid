package com.example.darkm.miapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class CalendarioPregrado extends AppCompatActivity {

    WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario_pregrado);

        try {
            webView1 = (WebView) this.findViewById(R.id.Webview1);

            // TODO
            // Next code write here!
            webView1.setWebViewClient(new WebViewClient());
            webView1.getSettings().setJavaScriptEnabled(true);

            /* Go to link */
            webView1.loadUrl("http://google.com/");
        }
        catch (Exception ex) {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

}
