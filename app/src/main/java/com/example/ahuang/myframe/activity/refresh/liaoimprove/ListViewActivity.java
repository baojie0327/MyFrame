package com.example.ahuang.myframe.activity.refresh.liaoimprove;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.chanven.lib.cptr.PtrClassicFrameLayout;
import com.chanven.lib.cptr.PtrDefaultHandler;
import com.chanven.lib.cptr.PtrFrameLayout;
import com.chanven.lib.cptr.loadmore.OnLoadMoreListener;
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

/**
 * ListView的刷新加载，对廖谷秋刷新控件的改装，加了上拉加载
 * compile 'com.chanven.lib:cptr:1.1.0'
 */

public class ListViewActivity extends AppCompatActivity {


    @BindView(R.id.listView)
    ListView mListView;
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
                    if (!mRefresh.isLoadMoreEnable()) {
                        mRefresh.setLoadMoreEnable(true);
                    }

                    break;
                case 2:
                    //   mRefresh.refreshComplete();
                    mAdapter.addData(mCollocationList);
                    if (mCollocationList.size() == 0) {
                        mRefresh.loadMoreComplete(false);
                    } else {
                        mRefresh.loadMoreComplete(true);
                    }

                    break;

            }
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ButterKnife.bind(this);

        initData();
        getData(1, 0);
        refreshListen();
    }

    private void initData() {
        mCollocationList = new ArrayList<>();
        mAdapter = new ListViewAdapter(ListViewActivity.this, mCollocationList);
        mListView.setAdapter(mAdapter);

        mRefresh.postDelayed(new Runnable() {
            @Override
            public void run() {
                mRefresh.autoRefresh(true);
            }
        }, 150);
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
        mRefresh.setPtrHandler(new PtrDefaultHandler() {
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                position = 1;
                getData(position, 1);
            }
        });

        mRefresh.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void loadMore() {
                position++;
                getData(position, 2);
            }
        });
    }


}
