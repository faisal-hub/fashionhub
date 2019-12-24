package com.example.FashionHub.ui.Login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.FashionHub.R;
import com.example.FashionHub.ui.ProductIdentity.ProductIdentity;

public class Login extends AppCompatActivity  {
    private EditText customerId;
    private EditText password;
    private Button loginbtn;
    private ImageView imageView;
    private  ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        customerId=findViewById(R.id.customerId);
        password=findViewById(R.id.password);
        loginbtn=findViewById(R.id.loginbtn);
        imageView=findViewById(R.id.imageView4);
        imageView1=findViewById(R.id.imageView5);
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String text=password.getText().toString().trim();
                if(!text.isEmpty()){
                    imageView1.setVisibility(View.GONE);
                }
                else{
                    imageView1.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        customerId.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                    String text=customerId.getText().toString().trim();
                    if(!text.isEmpty())
                    {
                        imageView.setVisibility(View.GONE);
                    }
                    else {
                        imageView.setVisibility(View.VISIBLE);
                    }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    public void login(View view) {
       Intent intent = new Intent(Login.this,ProductIdentity.class);
        startActivity(intent);
        finish();
    }


}
