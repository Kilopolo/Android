package com.example.pablo.a20171114_loginyaccesored;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;


public class webAcces extends AppCompatActivity {

    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_acces);

        webView = (WebView)findViewById(R.id.webView);


        Bundle bundle = getIntent().getExtras();
        webView.loadUrl("https://www."+bundle.getString("direccion"));
    }

    public void finalizar(View view){

        finish();

    }

}
