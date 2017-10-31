package com.example.pablo.a20171031_actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class segunda_actividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);
    }

    public void mainActiviti (View view){
        /**       -  Nos vuelve a la anterior actividad igual que el finish() que libera memoria
         *         Intent i = new Intent(this,MainActivity.class);
                    startActivity(i);
         */
        finish();
    }

}
