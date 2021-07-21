package com.surajpatel.yogaanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView animationView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide(); // toolbar not show
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN); //stetus bar not show

        animationView = findViewById(R.id.splash_animation);
        button = findViewById(R.id.btn_yoga);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationView.setVisibility(View.VISIBLE);
                button.setVisibility(View.INVISIBLE);
                animationView.playAnimation();

                Thread thread = new Thread(){
                    public void run(){
                        try{
                            sleep(1000);
                        }catch (Exception e){
                            e.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this,YogaActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    }
                };thread.start();
            }
        });
    }
}