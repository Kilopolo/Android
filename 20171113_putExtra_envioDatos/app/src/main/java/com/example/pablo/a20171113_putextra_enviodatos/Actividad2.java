package com.example.pablo.a20171113_putextra_enviodatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Actividad2 extends AppCompatActivity {

    private WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        webView1 = (WebView) findViewById(R.id.webView1);

        Bundle bundle = getIntent().getExtras();
        webView1.loadUrl("http://"+bundle.getString("direccion"));

    }

    public void finalizar(View view){
        finish();
    }

}
