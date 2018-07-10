package com.example.ahuang.myframe.activity.feature;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ahuang.myframe.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SnackBarActivity extends AppCompatActivity {

    @BindView(R.id.tv_show)
    TextView mTvShow;
    @BindView(R.id.activity_snack_bar)
    RelativeLayout mActivitySnackBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);
        ButterKnife.bind(this);
        mTvShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(mActivitySnackBar,"标题",Snackbar.LENGTH_LONG)
                        .setAction("点击事件", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(
                                        SnackBarActivity.this,
                                        "Toast",
                                        Toast.LENGTH_SHORT).show();
                            }
                        }).setDuration(Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
