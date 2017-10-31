package com.example.pablo.calcbin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    TextView tv;
    TextView tv2;
    TextView nm1;
    TextView nm2;
    TextView rsl;
    int num1;
    int num2;
    String valor1;
    String valor2;
    String valornum;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        tv=(TextView)findViewById(R.id.tv);
        tv2=(TextView) findViewById(R.id.tv2);
        nm1=(TextView) findViewById(R.id.nm1);
        nm2=(TextView) findViewById(R.id.nm2);
        rsl=(TextView) findViewById(R.id.rsl);


    }

    protected void toDecimalnum1 (View view){


        valornum = et1.getText().toString();
        num = Integer.parseInt(valornum, 2);
        nm1.setText(num);

    }
    protected void toDecimalnum2 (View view){


        valornum = et1.getText().toString();
        num = Integer.parseInt(valornum, 2);
        nm2.setText(num);

    }

    protected void sumar(View view) {
        valor1 = et1.getText().toString();
        valor2 = et2.getText().toString();
        //Pasamos el binario a decimal, base 10
        num1 = Integer.parseInt(valor1, 2);
        nm1.setText(num1);
        num2 = Integer.parseInt(valor2, 2);
        nm2.setText(num2);
        //Suma decimal
        int suma = num1 + num2;
        //Pasamos a binario
        String sumabin = Integer.toBinaryString(suma);
        tv.setText(sumabin);
        rsl.setText(suma);
        tv2.setText(num1+" + "+num2+" = "+suma);
    }

    protected void restar(View view) {
        valor1 = et1.getText().toString();
        valor2 = et2.getText().toString();
        //Pasamos el binario a decimal, base 10
        num1 = Integer.parseInt(valor1, 2);
        nm1.setText(num1);
        num2 = Integer.parseInt(valor2, 2);
        nm2.setText(num2);

        //Resta decimal
        int resta = num1 - num2;
        if (resta<0){
            tv.setText("Error");
        }else{ //Pasar Binario
            String restabin = Integer.toBinaryString(resta);
            tv.setText(restabin);}
        rsl.setText(resta);

        tv2.setText(num1+" - "+num2+" = "+resta);
    }

    protected void multiplicar(View view){
        valor1 = et1.getText().toString();
        valor2 = et2.getText().toString();
        //Pasamos el binario a decimal, base 10
        num1 = Integer.parseInt(valor1, 2);
        nm1.setText(num1);
        num2 = Integer.parseInt(valor2, 2);
        nm2.setText(num2);


        //Multiplicacion decimal
        int multip = num1 * num2;

        String multipbin = Integer.toBinaryString(multip);
        tv.setText(multipbin);
        rsl.setText(multip);

        tv2.setText(num1+" * "+num2+" = "+multip);
    }

    protected void dividir (View view){
        valor1 = et1.getText().toString();
        valor2 = et2.getText().toString();
        //Pasamos el binario a decimal, base 10
        num1 = Integer.parseInt(valor1, 2);
        nm1.setText(num1);
        num2 = Integer.parseInt(valor2, 2);
        nm2.setText(num2);


        //Resta decimal
        if(num2 == 0){
            tv.setText("IND");
        }else {
            int division = num1 / num2;

                String divibin = Integer.toBinaryString(division);
                tv.setText(divibin);

            rsl.setText(division);

            tv2.setText(num1+" / "+num2+" = "+division);
        }





    }


}
