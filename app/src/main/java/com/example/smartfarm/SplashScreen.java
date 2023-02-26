package com.example.smartfarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


       /* this handler() is used for parallel threading coz we want to slow down the speed
         or we can say that we want some action to be taken place but after some time  */

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                /*here we can define intent upper also the main thing is hmara
                 startActivity h wohi method h jisko hme slow down krna h */
                Intent splash=new Intent(SplashScreen.this,MainActivity.class);
                startActivity(splash);
                finish();

            }
        },4000);
    }
}