package com.example.ahuang.myframe.activity.feature;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.ahuang.myframe.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CoordinatorLayoutActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.tv_toolBar)
    TextView mTvToolBar;
    @BindView(R.id.tv_collapsingToolbarLayout1)
    TextView mTvCollapsingToolbarLayout1;
    @BindView(R.id.tv_collapsingToolbarLayout2)
    TextView mTvCollapsingToolbarLayout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_layout);
        ButterKnife.bind(this);
        mTvToolBar.setOnClickListener(this);
        mTvCollapsingToolbarLayout1.setOnClickListener(this);
        mTvCollapsingToolbarLayout2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_toolBar:
                startActivity(new Intent(CoordinatorLayoutActivity.this,CoordinatorToolBarActivity.class));
                break;
            case R.id.tv_collapsingToolbarLayout1:
                startActivity(new Intent(CoordinatorLayoutActivity.this,CollapsingToolbarLayout1Activity.class));
                break;
            case R.id.tv_collapsingToolbarLayout2:
                startActivity(new Intent(CoordinatorLayoutActivity.this,CollapsingToolbarLayout2Activity.class));
                break;
        }
    }
}
