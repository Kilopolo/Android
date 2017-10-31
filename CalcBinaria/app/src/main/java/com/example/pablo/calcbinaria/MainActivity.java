package com.example.pablo.calcbinaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv;
    private TextView tv2;
    private TextView nm1;
    private TextView nm2;
    private TextView rsl;
    private int num1;
    private int num2;
    private String valor1;
    private String valor2;
    private String valornum;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById (R.id.et1);
        et2=(EditText) findViewById (R.id.et2);
        tv=(TextView)findViewById (R.id.tv);
        tv2=(TextView) findViewById (R.id.rsl);
        nm1=(TextView) findViewById (R.id.nm1);
        nm2=(TextView) findViewById (R.id.nm2);
        rsl=(TextView) findViewById (R.id.rsl);

    }

    public void toDecimalnum1 (View view){

        valornum = et1.getText().toString();
        num = Integer.parseInt(valornum, 2);
        String temp = Integer.toString(num);
        nm1.setText(temp);

    }
    public void toDecimalnum2 (View view){

        valornum = et2.getText().toString();
        num = Integer.parseInt(valornum, 2);
        String temp = Integer.toString(num);
        nm2.setText(temp);

    }

    public void sumar(View view) {
        valor1 = et1.getText().toString();
        valor2 = et2.getText().toString();
        //Pasamos el binario a decimal, base 10
        num1 = Integer.parseInt(valor1, 2);
        num2 = Integer.parseInt(valor2, 2);
        //Suma decimal
        int suma = num1 + num2;
        //Pasamos a binario
        String sumabin = Integer.toBinaryString(suma);
        //Ponemos el resultado
        tv.setText(sumabin);
        rsl.setText(Integer.toString(suma));
        tv2.setText(Integer.toString(num1)+" + "+Integer.toString(num2)+" = "+Integer.toString(suma));

    }

    public void restar(View view) {
        valor1 = et1.getText().toString();
        valor2 = et2.getText().toString();
        //Pasamos el binario a decimal, base 10
        num1 = Integer.parseInt(valor1, 2);
        num2 = Integer.parseInt(valor2, 2);
        //Resta decimal
        int resta = num1 - num2;
        if (resta<0){
            tv.setText("Error");
        }else{ //Pasar Binario
            String restabin = Integer.toBinaryString(resta);
            tv.setText(restabin);}
        rsl.setText(Integer.toString(resta));
        tv2.setText(Integer.toString(num1)+" - "+Integer.toString(num2)+" = "+Integer.toString(resta));

    }
    public void multiplicar(View view){
        valor1 = et1.getText().toString();
        valor2 = et2.getText().toString();
        //Pasamos el binario a decimal, base 10
        num1 = Integer.parseInt(valor1, 2);
        num2 = Integer.parseInt(valor2, 2);
        //Multiplicacion decimal
        int multip = num1 * num2;
        String multipbin = Integer.toBinaryString(multip);
        tv.setText(multipbin);
        rsl.setText(Integer.toString(multip));
        tv2.setText(Integer.toString(num1)+" * "+Integer.toString(num2)+" = "+Integer.toString(multip));
    }

    public void dividir (View view){
        valor1 = et1.getText().toString();
        valor2 = et2.getText().toString();
        //Pasamos el binario a decimal, base 10
        num1 = Integer.parseInt(valor1, 2);
        num2 = Integer.parseInt(valor2, 2);
        //Resta decimal
        if(num2 == 0){
            tv.setText("IND");
        }else {
            int division = num1 / num2;
            String divibin = Integer.toBinaryString(division);
            tv.setText(divibin);
            rsl.setText(Integer.toString(division));
            tv2.setText(Integer.toString(num1)+" * "+Integer.toString(num2)+" = "+Integer.toString(division));
        }
    }
}
