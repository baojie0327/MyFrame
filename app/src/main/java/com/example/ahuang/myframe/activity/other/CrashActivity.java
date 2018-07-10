package com.example.ahuang.myframe.activity.other;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.ahuang.myframe.R;

/**
 * 捕获异常的Activity
 */

public class CrashActivity extends AppCompatActivity {

    private String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crash);
        System.out.println(s.equals("any string"));
    }
}
