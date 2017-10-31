package com.example.pablo.a20171031_contrasenya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private String contra="platano";
    private EditText etcontra;
    private String guess;
    private TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etcontra=(EditText)findViewById(R.id.etcontra);

    }




    public void iniciarActividad (View view){

        guess=etcontra.getText().toString();
        if (guess==contra){
            Intent i= new Intent(this,Bienvenida.class);
            startActivity(i);
        } else {
            error.setText("contraseña erronea");
        }

    }
}
