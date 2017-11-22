package com.example.ljj.constraintlayoutdemo.demolist;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.ljj.constraintlayoutdemo.R;

/**
 * created by ljj on 2017.11.22
 * 介绍控件的margin使用，主要是对应约束控件隐藏时的margin使用
 */
public class MarginsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_margins);

        getSupportActionBar().setTitle("margin介绍");


    }

}
