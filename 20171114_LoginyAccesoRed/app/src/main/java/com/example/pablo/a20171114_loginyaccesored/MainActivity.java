package com.example.pablo.a20171114_loginyaccesored;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText user;
    private EditText contra;
    private TextView error;
    private String u1user, u2user, u1contra, u2contra;

    public EditText getUser() {
        return user;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        user=(EditText)findViewById(R.id.user);
        contra=(EditText)findViewById(R.id.contra);
        error=(TextView)findViewById(R.id.error) ;
        u1user="usu1";
        u1contra="contra1";
        u2user="usu2";
        u2contra="contra2";
    }


    public void login(View view){

        Intent i = new Intent(this, UserMenu.class);

        if (user.getText().toString().equals(u1user)&& contra.getText().toString().equals(u1contra)){

            i.putExtra("Usuario",user.getText().toString());
            startActivity(i);

        } else if (user.getText().toString().equals(u2user)&&contra.getText().toString().equals(u2contra)){

            i.putExtra("Usuario",user.getText().toString());
            startActivity(i);

        } else {

            error.setText("User/Pass Erroneo");

        }


    }


}
