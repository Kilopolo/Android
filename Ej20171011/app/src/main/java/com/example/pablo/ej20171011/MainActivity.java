package com.example.pablo.ej20171011;

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;
        import android.widget.EditText;
        import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv3;
    private RadioButton r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        tv3 = (TextView) findViewById(R.id.tv3);
        r1 = (RadioButton)findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);
    }

    //Este método se ejecutará cuando se presione el botón
    public void operar(View view){
        int nro1 = Integer.parseInt(et1.getText().toString());
        int nro2 = Integer.parseInt(et2.getText().toString());
        if(r1.isChecked()) {
            int suma = nro1 + nro2;
            String res = String.valueOf(suma);
            tv3.setText(res);
        }else if(r2.isChecked()){
            int resta = nro1-nro2;
            String res = String.valueOf(resta);
            tv3.setText(res);
        }
    }
}