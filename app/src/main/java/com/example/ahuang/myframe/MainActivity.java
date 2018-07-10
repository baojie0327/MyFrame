package com.example.ahuang.myframe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.ahuang.myframe.activity.dagger.DaggerMainActivity;
import com.example.ahuang.myframe.activity.eventbus.FirstEventActivity;
import com.example.ahuang.myframe.activity.feature.NewFeatureActivity;
import com.example.ahuang.myframe.activity.other.OtherMainActivity;
import com.example.ahuang.myframe.activity.other.VlayoutActivity;
import com.example.ahuang.myframe.activity.refresh.RefreshMainActivity;
import com.example.ahuang.myframe.activity.retrofit.RetrofitMainActivity;
import com.example.ahuang.myframe.activity.rxjava.RxMainActivity;
import com.example.ahuang.myframe.adapter.MainRecyAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycleView)
    RecyclerView mRecycleView;

    private List<String> list;  //数据来源
    private MainRecyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
        initData();
    }


    private void initView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        mRecycleView.setLayoutManager(layoutManager);
    }

    private void initData() {
        list = new ArrayList<>();
        list.add("刷新加载");
        list.add("EventBus");
        list.add("RxJava");
        list.add("Retrofit");
        list.add("Dagger2");
        list.add("Android 新特性");
        list.add("其他");
        list.add("Vlayout");
        mAdapter = new MainRecyAdapter(MainActivity.this, list);
        mRecycleView.setAdapter(mAdapter);

        mAdapter.setOnItemClickLitener(new MainRecyAdapter.OnItemClickLitener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position) {
                    case 0: //刷新
                        startActivity(new Intent(MainActivity.this, RefreshMainActivity.class));
                        break;
                    case 1: //EventBus
                        startActivity(new Intent(MainActivity.this, FirstEventActivity.class));
                        break;
                    case 2: // RxJava
                        startActivity(new Intent(MainActivity.this, RxMainActivity.class));
                        break;
                    case 3:  // Retrofit
                        startActivity(new Intent(MainActivity.this, RetrofitMainActivity.class));
                        break;
                    case 4:  //Dagger2
                        startActivity(new Intent(MainActivity.this, DaggerMainActivity.class));
                        break;
                    case 5:  //Android新特性
                        startActivity(new Intent(MainActivity.this, NewFeatureActivity.class));
                        break;
                    case 6:  //其他
                        startActivity(new Intent(MainActivity.this, OtherMainActivity.class));
                        break;
                    case 7:  //vlayout
                        startActivity(new Intent(MainActivity.this, VlayoutActivity.class));
                        break;

                }
            }
        });
    }


}
