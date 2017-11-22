package com.example.ljj.constraintlayoutdemo.demolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ljj.constraintlayoutdemo.R;


/**
 * created by ljj on 2017.11.22
 * 圆形定位
 * layout_constraintCircle : references another widget id
 * layout_constraintCircleRadius : the distance to the other widget center
 * layout_constraintCircleAngle : which angle the widget should be at (in degrees, from 0 to 360)
 */
public class CircularPositioningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular_positioning);

        getSupportActionBar().setTitle("圆形定位");
    }
}
