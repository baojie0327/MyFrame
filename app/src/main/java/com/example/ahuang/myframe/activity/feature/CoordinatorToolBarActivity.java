package com.example.ahuang.myframe.activity.feature;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.adapter.wrapper.viewpager.FragmentAdapter;
import com.example.ahuang.myframe.fragment.TabLayout1Fargment;
import com.example.ahuang.myframe.fragment.TabLayoutFargment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CoordinatorToolBarActivity extends AppCompatActivity  {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.appbar)
    AppBarLayout mAppbar;
    @BindView(R.id.tabLayout)
    TabLayout mTabLayout;
    @BindView(R.id.viewPager)
    ViewPager mViewPager;
    @BindView(R.id.main_coordinator)
    CoordinatorLayout mMainCoordinator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_tool_bar);
        ButterKnife.bind(this);
        initToolbar();
        initViewPager();
    }


    private void initToolbar(){
        //  mToolbar.setLogo(R.drawable.gowalla); //设置logo
        // mToolbar.setTitle("My Title");
        //  mToolbar.setSubtitle("Subtitle Title");
        setSupportActionBar(mToolbar);
        // Navigation Icon 要設定在 setSupoortActionBar 才有作用
        // 否则会出现 back button
        //   mToolbar.setNavigationIcon(R.drawable.ic_launcher);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu); //重新设置返回键图标
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);  //显示返回键

        //  mToolbar.inflateMenu(R.menu.toolbar_menu);  //有可能不起作用
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
       /*for (int i = 0; i <titles.size() ; i++) {
            fragments.add(new TabLayoutFargment());
        }*/
        fragments.add(new TabLayoutFargment());
        fragments.add(new TabLayout1Fargment());
        fragments.add(new TabLayoutFargment());

        FragmentAdapter mFragmentAdapter=new FragmentAdapter(getSupportFragmentManager(),fragments,titles);
        //给ViewPager设置适配器
        mViewPager.setAdapter(mFragmentAdapter);
        //将TabLayout和ViewPager关联起来
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        //给TabLayout设置适配器
        // mTab.setTabsFromPagerAdapter(mFragmentAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                Toast.makeText(CoordinatorToolBarActivity.this,"click menu",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.tool_search:
                Toast.makeText(CoordinatorToolBarActivity.this,"click search",Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
