package com.example.ahuang.myframe.activity.refresh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.activity.refresh.liaohuqiu.LiaoAdaHelperActivity;
import com.example.ahuang.myframe.activity.refresh.liaohuqiu.ListRefreshActivity;
import com.example.ahuang.myframe.activity.refresh.liaohuqiu.RecyCommAdapterActivity;
import com.example.ahuang.myframe.activity.refresh.liaoimprove.LiaoImproveHelperActivity;
import com.example.ahuang.myframe.activity.refresh.liaoimprove.ListViewActivity;
import com.example.ahuang.myframe.activity.refresh.liaoimprove.RecyRefreshActivity;
import com.example.ahuang.myframe.activity.refresh.smartrefresh.SmartBaseHongActivity;
import com.example.ahuang.myframe.activity.refresh.smartrefresh.SmartBaseRecyAdapterHelperActivity;
import com.example.ahuang.myframe.activity.refresh.smartrefresh.SmartRefreshHongActivity;
import com.example.ahuang.myframe.activity.refresh.twinkrefresh.TwinkLayoutRefreshActivity;
import com.example.ahuang.myframe.activity.refresh.twinkrefresh.TwinkRecycleActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RefreshMainActivity extends AppCompatActivity {

    @BindView(R.id.lv_liao)
    TextView mLvLiao;
    @BindView(R.id.rc_liao)
    TextView mRcLiao;
    @BindView(R.id.lv_liao_improve)
    TextView mLvLiaoImprove;
    @BindView(R.id.rc_liao_improve)
    TextView mRcLiaoImprove;
    @BindView(R.id.smart)
    TextView mSmart;
    @BindView(R.id.tw_layout)
    TextView mTwLayout;
    @BindView(R.id.tw_recy)
    TextView mTwRecy;
    @BindView(R.id.smart_recy)
    TextView mSmartRecy;
    @BindView(R.id.smart_recy_base)
    TextView mSmartRecyBase;
    @BindView(R.id.liao_im_helper)
    TextView mLiaoImHelper;
    @BindView(R.id.liao_recy_helper)
    TextView mLiaoRecyHelper;

    @OnClick({R.id.lv_liao, R.id.rc_liao, R.id.liao_recy_helper,R.id.lv_liao_improve, R.id.rc_liao_improve, R.id.smart,
            R.id.tw_layout, R.id.tw_recy, R.id.smart_recy, R.id.smart_recy_base, R.id.liao_im_helper})
    public void onJump(TextView tv) {
        switch (tv.getId()) {
            //  --------------廖谷秋原生--------
            case R.id.lv_liao: //ListView刷新加载(廖谷秋原生)
                startActivity(new Intent(RefreshMainActivity.this, ListRefreshActivity.class));
                break;
            case R.id.rc_liao:  //RecyclerView刷新加载(廖谷秋原生) crash
                startActivity(new Intent(RefreshMainActivity.this, RecyCommAdapterActivity.class));
                break;
            case R.id.liao_recy_helper:  // 廖谷秋原生+BaseRecyclerViewAdapterHelper
                startActivity(new Intent(RefreshMainActivity.this, LiaoAdaHelperActivity.class));
                break;

            //--------------------廖谷秋 改进--必须结合RecyclerAdapterWithHF使用来添加头布局----------------
            case R.id.lv_liao_improve://ListView刷新加载(廖谷秋改进)
                startActivity(new Intent(RefreshMainActivity.this, ListViewActivity.class));
                break;
            case R.id.rc_liao_improve://RecyclerView刷新加载(廖谷秋改进)
                startActivity(new Intent(RefreshMainActivity.this, RecyRefreshActivity.class));
                break;
            case R.id.liao_im_helper: //廖谷秋改进+BaseRecyclerViewAdapterHelper
                startActivity(new Intent(RefreshMainActivity.this, LiaoImproveHelperActivity.class));
                break;
            //--------------------twink--------------
            case R.id.tw_layout: //普通布局刷新(twink)
                startActivity(new Intent(RefreshMainActivity.this, TwinkLayoutRefreshActivity.class));
                break;
            case R.id.tw_recy: //RecyclerView刷新加载(twink)
                startActivity(new Intent(RefreshMainActivity.this, TwinkRecycleActivity.class));
                break;
            //--------------------smart--------------
            case R.id.smart://RecyclerView刷新加载(smart)
                startActivity(new Intent(RefreshMainActivity.this, SmartRefreshHongActivity.class));
                break;
            case R.id.smart_recy: //samrt + 鸿洋封装的 baseAdapter
                startActivity(new Intent(RefreshMainActivity.this, SmartBaseHongActivity.class));
                break;
            case R.id.smart_recy_base: //smart+BaseRecyclerViewAdapterHelper
                startActivity(new Intent(RefreshMainActivity.this, SmartBaseRecyAdapterHelperActivity.class));
                break;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refresh_main);
        ButterKnife.bind(this);

    }


}
