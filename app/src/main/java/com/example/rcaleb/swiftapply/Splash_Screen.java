package com.example.rcaleb.swiftapply;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
        Thread waiter = new Thread(){
            @Override
            public void run() {

                try {
                    sleep(4000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }finally {
                    Intent next = new Intent(getApplicationContext(),application_status.class);
                    startActivity(next);
                    finish();
                }
            }
        };

        waiter.start();

    }
}
