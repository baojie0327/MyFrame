package com.example.ahuang.myframe.activity.retrofit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.ahuang.myframe.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RetrofitMainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.tv_basic)
    TextView mTvBasic;
    @BindView(R.id.tv_basic_post)
    TextView mTvBasicPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_main);
        ButterKnife.bind(this);
        mTvBasic.setOnClickListener(this);
        mTvBasicPost.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_basic:
                startActivity(new Intent(RetrofitMainActivity.this, BasicUsedActivity.class));
                break;
            case R.id.tv_basic_post:
                startActivity(new Intent(RetrofitMainActivity.this,BasicUsePostActivity.class));
                break;
        }
    }
}
