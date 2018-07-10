package com.example.ahuang.myframe.activity.eventbus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.event.MessageEvent;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SecondEventActivity extends AppCompatActivity {

    @BindView(R.id.et_message)
    EditText mEtMessage;
    @BindView(R.id.tv_send)
    TextView mTvSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_event);
        ButterKnife.bind(this);
        mEtMessage.setHint("请输入要发送的内容");
        mTvSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new MessageEvent(mEtMessage.getText().toString().trim()));
                finish();
            }
        });
    }
}
