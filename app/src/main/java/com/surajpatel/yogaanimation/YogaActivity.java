package com.surajpatel.yogaanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

public class YogaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);

        getSupportActionBar().hide(); // toolbar not show
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN); //stetus bar not show
    }
}