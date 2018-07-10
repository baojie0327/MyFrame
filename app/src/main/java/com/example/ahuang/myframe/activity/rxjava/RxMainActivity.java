package com.example.ahuang.myframe.activity.rxjava;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.ahuang.myframe.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RxMainActivity extends AppCompatActivity {

    @BindView(R.id.basic_used)
    TextView mBasicUsed;
    @BindView(R.id.tv_operator)
    TextView mTvOperator;
    @BindView(R.id.tv_retrofit)
    TextView mTvRetrofit;


    @OnClick(R.id.basic_used) //基础使用
    public void jumpToBasic() {
        startActivity(new Intent(RxMainActivity.this, BasicUsedActivity.class));
    }

    @OnClick(R.id.tv_operator) //操作符
    public void jumpToOperator() {
        startActivity(new Intent(RxMainActivity.this, RtOperatorActivity.class));
    }

    @OnClick(R.id.tv_retrofit)
    public void jumpToRxRe(){
        startActivity(new Intent(RxMainActivity.this,RxRetrActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_main);
        ButterKnife.bind(this);

    }
}
