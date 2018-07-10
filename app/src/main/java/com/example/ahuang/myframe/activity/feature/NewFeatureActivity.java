package com.example.ahuang.myframe.activity.feature;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.ahuang.myframe.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Android新特性
 */
public class NewFeatureActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.snackbar)
    TextView mSnackbar;
    @BindView(R.id.textInputLayout)
    TextView mTextInputLayout;
    @BindView(R.id.tv_tab_layout)
    TextView mTvTabLayout;
    @BindView(R.id.tv_navigationView)
    TextView mTvNavigationView;
    @BindView(R.id.tv_coordinatorLayout)
    TextView mTvCoordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_feature);
        ButterKnife.bind(this);
        mSnackbar.setOnClickListener(this);
        mTextInputLayout.setOnClickListener(this);
        mTvTabLayout.setOnClickListener(this);
        mTvNavigationView.setOnClickListener(this);
        mTvCoordinatorLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.snackbar:
                startActivity(new Intent(NewFeatureActivity.this, SnackBarActivity.class));
                break;
            case R.id.textInputLayout:
                startActivity(new Intent(NewFeatureActivity.this, TextInputLayoutActivity.class));
                break;
            case R.id.tv_tab_layout:
                startActivity(new Intent(NewFeatureActivity.this, TabLayoutActivity.class));
                break;
            case R.id.tv_navigationView:
                startActivity(new Intent(NewFeatureActivity.this, NavigationActivity.class));
                break;
            case R.id.tv_coordinatorLayout:
                startActivity(new Intent(NewFeatureActivity.this,CoordinatorLayoutActivity.class));
                break;
        }
    }
}
