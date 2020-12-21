package com.example.marchaadventure;

import android.support.v7.app.AppCompatActivity; import android.content.Intent;
import android.os.Bundle; import android.os.Handler; import android.view.Window;
import android.view.WindowManager;

import com.example.marchaadventure.MainActivity;
import com.example.marchaadventure.R;

public class SplashScreen extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_splashscreen);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(SplashScreen.this,MainActivity.class));
                        finish();

                    }
                },2000);

            }

}
