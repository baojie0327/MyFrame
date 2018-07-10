package com.example.ahuang.myframe.activity.feature;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ahuang.myframe.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NavigationActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.tv_navigation)
    TextView mTvNavigation;
    @BindView(R.id.navigation)
    NavigationView mNavigation;
    @BindView(R.id.main_draw)
    DrawerLayout mMainDraw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        ButterKnife.bind(this);
        mTvNavigation.setOnClickListener(this);
        if (mNavigation != null){
            mNavigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    // 改变item选中状态
                    item.setCheckable(true);
                    String title=item.getTitle().toString();
                    Toast.makeText(NavigationActivity.this,title,Toast.LENGTH_SHORT).show();
                  mMainDraw.closeDrawers();
                    return true;
                }
            });
            View header=mNavigation.getHeaderView(0);
            ImageView img_avater=(ImageView) header.findViewById(R.id.avater);
            img_avater.setOnClickListener(this);
            TextView tv_name=(TextView) header.findViewById(R.id.title);
            tv_name.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_navigation:
                mMainDraw.openDrawer(GravityCompat.START);
                break;
            case R.id.avater:
                Toast.makeText(NavigationActivity.this,"avater",Toast.LENGTH_SHORT).show();
                break;
            case R.id.title:
                Toast.makeText(NavigationActivity.this,"title",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
