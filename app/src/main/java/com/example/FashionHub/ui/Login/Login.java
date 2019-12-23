package com.example.FashionHub.ui.Login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.FashionHub.R;
import com.example.FashionHub.ui.ProductIdentity.ProductIdentity;

public class Login extends AppCompatActivity {
    private EditText customerId;
    private EditText password;
    private Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        customerId=findViewById(R.id.customerId);
        password=findViewById(R.id.password);
        loginbtn=findViewById(R.id.loginbtn);

    }

    public void login(View view) {
        Intent intent = new Intent(Login.this, ProductIdentity.class);
        startActivity(intent);
        finish();
    }
}
