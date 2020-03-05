package com.example.addcontact;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends MainActivity {

    private final int splashtime = 4000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, splashtime);

    }

}
//
//



