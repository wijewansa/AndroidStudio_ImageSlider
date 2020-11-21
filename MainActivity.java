package com.example.image_slider;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager mViewPager =(ViewPager)findViewById(R.id.viewPage);
        ImageAdapter adaptView = new ImageAdapter(this);
        mViewPager.setAdapter(adaptView);
    }
}
