package com.example.ljj.constraintlayoutdemo.demolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ljj.constraintlayoutdemo.R;

/**
 * created by ljj on 2017.11.22
 * 对chains相关属性的介绍
 */
public class ChainsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chains);

        getSupportActionBar().setTitle("相互约束");
    }
}
