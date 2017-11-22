package com.example.ljj.constraintlayoutdemo.demolist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.ljj.constraintlayoutdemo.R;

/**
 * created by ljj on 2017.11.22
 * 关于相对位置属性的介绍
 * layout_constraintLeft_toLeftOf
 * layout_constraintLeft_toRightOf
 * layout_constraintRight_toLeftOf
 * layout_constraintRight_toRightOf
 * layout_constraintTop_toTopOf
 * layout_constraintTop_toBottomOf
 * layout_constraintBottom_toTopOf
 * layout_constraintBottom_toBottomOf
 * layout_constraintBaseline_toBaselineOf
 * layout_constraintStart_toEndOf
 * layout_constraintStart_toStartOf
 * layout_constraintEnd_toStartOf
 * layout_constraintEnd_toEndOf
 */
public class RelativePositioningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_positioning);

    }
}
