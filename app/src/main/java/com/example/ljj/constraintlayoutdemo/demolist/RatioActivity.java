package com.example.ljj.constraintlayoutdemo.demolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ljj.constraintlayoutdemo.R;

/**
 * created by ljj on 2017.11.22
 * <p>
 * ratio指一个控件的宽高比
 */
public class RatioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratio);

        getSupportActionBar().setTitle("ratio使用介绍");
    }
}
