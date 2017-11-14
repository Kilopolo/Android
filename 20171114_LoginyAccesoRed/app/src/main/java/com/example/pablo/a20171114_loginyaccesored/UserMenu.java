package com.example.pablo.a20171114_loginyaccesored;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UserMenu extends AppCompatActivity {

    private TextView txtUsu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_menu);

        txtUsu = (TextView)findViewById(R.id.txtUsu);
        Bundle bundle= getIntent().getExtras();

        txtUsu.setText(bundle.getString("Usuario"));

    }

    public void ejecutar(View view){

        Intent i = new Intent(this, webAcces.class);
        i.putExtra("direccion", txtUsu.getText().toString());
        startActivity(i);
    }

   //

}
