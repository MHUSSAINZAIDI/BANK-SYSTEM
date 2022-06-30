
package com.internship.bank_sparks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);


        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);
        TextView otp =(TextView) findViewById(R.id.otp);

        Button loginbtn = (Button) findViewById(R.id.loginbtn);
        Button loginbtn2 = (Button) findViewById(R.id.loginbtn2);

        //admin and admin
        loginbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"YOUR OTP IS: '12345'",Toast.LENGTH_SHORT).show();
        }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin") && otp.getText().toString().equals("12345") ){
                    //correct
                    startActivity(new Intent(MainActivity.this,signin.class));
                }else
                    //incorrect
                    Toast.makeText(MainActivity.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

