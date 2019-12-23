package com.example.FashionHub.ui.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.FashionHub.R;
import com.example.FashionHub.ui.Login.Login;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        CountDownTimer timer=new CountDownTimer(4000,400) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.d("checktick","Ticked!");
            }

            @Override
            public void onFinish() {
            Intent intent=new Intent(SplashActivity.this, Login.class);
            startActivity(intent);
            finish();
            }
        };
        timer.start();
    }
}
