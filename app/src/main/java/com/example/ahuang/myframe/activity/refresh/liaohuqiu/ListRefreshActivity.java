package com.example.ahuang.myframe.activity.refresh.liaohuqiu;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;

import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.adapter.ListViewAdapter;
import com.example.ahuang.myframe.api.Constant;
import com.example.ahuang.myframe.bean.CollectionDetailBean;
import com.example.ahuang.myframe.util.HttpHelper;
import com.example.ahuang.myframe.util.LogUtil;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.srain.cube.util.LocalDisplay;
import in.srain.cube.views.loadmore.LoadMoreContainer;
import in.srain.cube.views.loadmore.LoadMoreHandler;
import in.srain.cube.views.loadmore.LoadMoreListViewContainer;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrHandler;

/**
 * ListView刷新加载，廖谷秋原生方法的加载，加载要单独引进一个控件
 *  compile 'in.srain.cube:cube-sdk:1.0.44@aar'
 */

public class ListRefreshActivity extends AppCompatActivity {


    @BindView(R.id.listView)
    ListView mListView;
    @BindView(R.id.listLoadMore)
    LoadMoreListViewContainer mListLoadMore;
    @BindView(R.id.refresh)
    PtrClassicFrameLayout mRefresh;
    //数据
    private CollectionDetailBean mDetailBean;//存放数据的实体类
    private CollectionDetailBean.DataBean mDataBean;
    private List<CollectionDetailBean.DataBean.CollocationListBean> mCollocationList;

    private ListViewAdapter mAdapter;
    private int position = 1;


    /**
     * 定义handler
     **/
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    mAdapter.setData(mCollocationList);
                    break;
                case 1:
                    mRefresh.refreshComplete();
                    mAdapter.setData(mCollocationList);

                    break;
                case 2:
                    //   mRefresh.refreshComplete();
                    mAdapter.addData(mCollocationList);
                    mListLoadMore.loadMoreFinish(false, true);
                    break;

            }
            super.handleMessage(msg);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_refresh);
        ButterKnife.bind(this);


        initView();
        initData();
        getData(1, 0);
        refreshListen();

    }

    private void initView() {
        // header place holder
        View headerMarginView = new View(this);
        headerMarginView.setLayoutParams(new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, LocalDisplay.dp2px(30)));
        mListView.addHeaderView(headerMarginView);

        mListLoadMore.setAutoLoadMore(true);//设置是否自动加载更多
        mListLoadMore.useDefaultHeader();

    }

    private void initData() {
        mCollocationList = new ArrayList<>();
        mAdapter = new ListViewAdapter(ListRefreshActivity.this, mCollocationList);
        mListView.setAdapter(mAdapter);
    }

    private void getData(final int position, final int type) {
        String request_url = Constant.COLLECTION_POSITION + position + Constant.COLLECTION_ID + "1365" + Constant.COLLECTION_VERSION +
                "1.1.4" + Constant.COLLECTION_TOKEN + "7b36988ae5519ddd8b5be1c99e3a0213";
        HttpHelper.getInstance(this).request(request_url, new HttpHelper.HttpCallBack() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                try {
                    mDetailBean = gson.fromJson(result, CollectionDetailBean.class);
                    mCollocationList = mDetailBean.getData().getCollocationList();
                    LogUtil.d("changdu==" + mCollocationList.size());
                    switch (type) {
                        case 0:
                            mHandler.sendEmptyMessage(0);
                            break;
                        case 1:
                            mHandler.sendEmptyMessage(1);
                            break;
                        case 2:
                            mHandler.sendEmptyMessage(2);
                            break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(String msg) {

            }

            @Override
            public void onError(String msg) {

            }
        });

    }

    private void refreshListen() {
        mRefresh.setLoadingMinTime(1000);
        mRefresh.setPtrHandler(new PtrHandler() {
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                frame.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        position = 1;
                        getData(position, 1);
                    }
                }, 100);

            }

            @Override
            public boolean checkCanDoRefresh(PtrFrameLayout frame, View content, View header) {
                return PtrDefaultHandler.checkContentCanBePulledDown(frame, mListView, header);
            }
        });

        mRefresh.postDelayed(new Runnable() {
            @Override
            public void run() {
                mRefresh.autoRefresh(false);
            }
        }, 150);

        mListLoadMore.setLoadMoreHandler(new LoadMoreHandler() {
            @Override
            public void onLoadMore(LoadMoreContainer loadMoreContainer) {
                mListLoadMore.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        position++;
                        getData(position, 2);
                    }
                }, 500);

            }
        });
    }


}
