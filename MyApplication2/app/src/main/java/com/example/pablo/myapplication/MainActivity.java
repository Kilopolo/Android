package com.example.pablo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;
    private EditText et1,et2;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et2=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv3=(TextView)findViewById(R.id.tv3);

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        String []opciones={"SUMAR","RESTAR","MULTIPLICAR","DIVIDIR"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this,android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);
    }
    //Este método se ejecutará cuando se presione el boton

    public void operar(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        String resu;
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        String selec = spinner1.getSelectedItem().toString();
        if (selec.equals("SUMAR")){
            int suma = nro1+nro2;
            resu=String.valueOf(suma);
            tv3.setText(resu);
        }else
            if (selec.equals("RESTAR")){
            int resta=nro1-nro2;
                resu=String.valueOf(resta);
                tv3.setText(resu);
        }else
            if (selec.equals("MULTIPLICAR")){
            int multi=nro1*nro2;
                resu=String.valueOf(multi);
                tv3.setText(resu);
        }else
            if (selec.equals("DIVIDIR")){
                if (nro2==0){
                    resu="Error: División por cero";
                } else {
                    int divi = nro1/nro2;
                    resu=String.valueOf(divi);
                }
                tv3.setText(resu);
            }






    }
}
