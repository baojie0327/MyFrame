package com.example.ahuang.myframe.activity.eventbus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.event.MessageEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FirstEventActivity extends AppCompatActivity {

    @BindView(R.id.tv_show)
    TextView mTvShow;
    @BindView(R.id.tv_jump)
    TextView mTvJump;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_event);
        ButterKnife.bind(this);

        mTvShow.setText("FirstEventActivity");
        mTvJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstEventActivity.this,SecondEventActivity.class));
            }
        });
        //注册事件
        EventBus.getDefault().register(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        //取消注册事件
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMoonEvent(MessageEvent messageEvent){
        mTvShow.setText(messageEvent.getMessage());
    }

}
