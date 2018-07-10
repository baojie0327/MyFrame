package com.example.ahuang.myframe.activity.other;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.ahuang.myframe.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OtherMainActivity extends AppCompatActivity {

    @BindView(R.id.crash)
    TextView mCrash;

    @OnClick(R.id.crash)  //异常处理
    public void jumpToCrash(){
        startActivity(new Intent(OtherMainActivity.this,CrashActivity.class));
    }

    @OnClick(R.id.fanxing)
    public void jumpFanxing(){
        startActivity(new Intent(OtherMainActivity.this,FanxingActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_main);
        ButterKnife.bind(this);
    }
}
