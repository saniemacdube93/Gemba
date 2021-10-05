package com.example.gemby;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ProgressBar;

public class SplashScreenActivity extends AppCompatActivity {
    ProgressBar progressBar;
    int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Handler handler = new Handler(Looper.getMainLooper());
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent i = new Intent(SplashScreenActivity.this, PolicyActivity.class);
//              //  startActivity(i);
//               // finish();
//            }
//        }, 5000);


        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        int color = 0xFF3e4095;
        progressBar.getIndeterminateDrawable().setColorFilter(color, PorterDuff.Mode.SRC_IN);
        progressBar.getProgressDrawable().setColorFilter(color, PorterDuff.Mode.SRC_IN);

        Thread thread = new Thread() {
            public void run() {
                try {
                    for (int progress = 0; progress <= 70; progress++) {
                        sleep(80);
                        progressBar.setProgress(progress);
                        if(progress==70) {
                            Intent intent = new Intent(SplashScreenActivity.this, PolicyActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    }


                } catch (Exception ex) {

                }
            }
        };
        thread.start();
    }
}


