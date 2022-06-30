//package com.internship.bank_sparks;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.google.android.material.button.MaterialButton;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class signin extends AppCompatActivity  {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        TextView username =(TextView) findViewById(R.id.username);
//        TextView password =(TextView) findViewById(R.id.password);
//
//        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
//
//        //admin and admin
//
//        loginbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
//                    //correct
//                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
//                }else
//                    //incorrect
//                    Toast.makeText(MainActivity.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}
package com.internship.bank_sparks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class signin extends AppCompatActivity {
    ImageView customer,transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customer=findViewById(R.id.customer);
        transaction=findViewById(R.id.Transactions);

        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(signin.this,user_list.class));
            }
        });
        transaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(signin.this,history_list.class));
            }
        });
    }
}