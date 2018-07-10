package com.example.ahuang.myframe.activity.feature;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.adapter.wrapper.viewpager.FragmentAdapter;
import com.example.ahuang.myframe.fragment.TabLayoutFargment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CollapsingToolbarLayout2Activity extends AppCompatActivity {

    @BindView(R.id.imageView)
    ImageView mImageView;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.collapsing_toolbar)
    CollapsingToolbarLayout mCollapsingToolbar;
    @BindView(R.id.appbar)
    AppBarLayout mAppbar;
    @BindView(R.id.tabLayout)
    TabLayout mTabLayout;
    @BindView(R.id.viewPager)
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar_layout2);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mCollapsingToolbar.setTitle("哆啦A梦");
        initViewPager();
    }

    private void initViewPager(){
        List<String> titles=new ArrayList<>();
        titles.add("精选");
        titles.add("最新");
        titles.add("热门");
        for (int i = 0; i <titles.size() ; i++) {
            mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(i)));
        }
        List<Fragment> fragments=new ArrayList<>();
        for (int i = 0; i <titles.size() ; i++) {
            fragments.add(new TabLayoutFargment());
        }
        /*fragments.add(new TabLayoutFargment());
        fragments.add(new TabLayout1Fargment());
        fragments.add(new TabLayoutFargment());*/

        FragmentAdapter mFragmentAdapter=new FragmentAdapter(getSupportFragmentManager(),fragments,titles);
        //给ViewPager设置适配器
        mViewPager.setAdapter(mFragmentAdapter);
        //将TabLayout和ViewPager关联起来
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        //给TabLayout设置适配器
        // mTab.setTabsFromPagerAdapter(mFragmentAdapter);
    }
}
