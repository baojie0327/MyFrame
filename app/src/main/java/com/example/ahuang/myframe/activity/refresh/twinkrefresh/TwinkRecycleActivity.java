package com.example.ahuang.myframe.activity.refresh.twinkrefresh;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.adapter.RecyHeadAdapter;
import com.example.ahuang.myframe.api.Constant;
import com.example.ahuang.myframe.bean.CollectionDetailBean;
import com.example.ahuang.myframe.util.HttpHelper;
import com.example.ahuang.myframe.util.LogUtil;
import com.google.gson.Gson;
import com.lcodecore.tkrefreshlayout.RefreshListenerAdapter;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.lcodecore.tkrefreshlayout.footer.BallPulseView;
import com.lcodecore.tkrefreshlayout.footer.LoadingView;
import com.lcodecore.tkrefreshlayout.header.SinaRefreshView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TwinkRecycleActivity extends AppCompatActivity {

    @BindView(R.id.recyclerview)
    RecyclerView mRecyclerview;
    @BindView(R.id.refresh)
    TwinklingRefreshLayout mRefresh;

    private TextView tv_user_name;
    private TextView tv_publish_num;
    private TextView tv_favor_num;
    private TextView tv_comment_num;

    private CollectionDetailBean mDetailBean;//存放数据的实体类
    private CollectionDetailBean.DataBean mDataBean;
    private List<CollectionDetailBean.DataBean.CollocationListBean> mCollocationList;
    private RecyHeadAdapter mAdapter;
    private TwinklingRefreshLayout mRefreshLayout;


    private View header;
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
                    setHeadData();
                    break;
                case 1:
                    mAdapter.setData(mCollocationList);
                    setHeadData();
                    mRefreshLayout.finishRefreshing();
                    mRefreshLayout.setEnableLoadmore(true);
                    break;
                case 2:
                    mAdapter.addData(mCollocationList);
                    if (mCollocationList.size() < 10) {
                        mRefreshLayout.setEnableLoadmore(false);
                    }else {
                        mRefreshLayout.setEnableLoadmore(true);
                    }
                    mRefreshLayout.finishLoadmore();
                    break;

            }
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twink_recycle);
        ButterKnife.bind(this);

        initView();
        initData();
        getData(1, 0);
        listen();
    }

    private void initView() {
        header = LayoutInflater.from(this).inflate(R.layout.head_collection_recycle_view_layout,
                (ViewGroup) findViewById(android.R.id.content), false);
        tv_user_name = (TextView) header.findViewById(R.id.user_name);
        tv_publish_num = (TextView) header.findViewById(R.id.tv_publish_num);
        tv_favor_num = (TextView) header.findViewById(R.id.favor_num);
        tv_comment_num = (TextView) header.findViewById(R.id.comment_num_top);

        GridLayoutManager layoutManager = new GridLayoutManager(TwinkRecycleActivity.this, 2);
        mRecyclerview.setLayoutManager(layoutManager);

        mRefresh.setMaxHeadHeight(80);
        SinaRefreshView headerView1 = new SinaRefreshView(this);
        headerView1.setArrowResource(R.drawable.arrow);
        headerView1.setTextColor(0xff745D5C);
//        TextHeaderView headerView = (TextHeaderView) View.inflate(this,R.layout.header_tv,null);
        mRefresh.setHeaderView(headerView1);

        LoadingView loadingView = new LoadingView(this);
        mRefresh.setBottomView(loadingView);
        TwinklingRefreshLayout.setDefaultFooter(BallPulseView.class.getName());
        mRefresh.setOverScrollBottomShow(false);
        mRefresh.setEnableOverScroll(false);
        mRefresh.setBottomHeight(100);
    }

    private void initData() {
      //  mCollocationList = new ArrayList<CollectionDetailBean.DataBean.CollocationListBean>();
        mAdapter = new RecyHeadAdapter(TwinkRecycleActivity.this);
        mAdapter.setHeaderView(header);
        mRecyclerview.setAdapter(mAdapter);
    }

    private void getData(final int position, final int type) {
        String request_url = Constant.COLLECTION_POSITION + position + Constant.COLLECTION_ID + "2739" + Constant.COLLECTION_VERSION +
                "1.1.4" + Constant.COLLECTION_TOKEN + "7b36988ae5519ddd8b5be1c99e3a0213";
        HttpHelper.getInstance(this).request(request_url, new HttpHelper.HttpCallBack() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                try {
                    mDetailBean = gson.fromJson(result, CollectionDetailBean.class);
                    mCollocationList = mDetailBean.getData().getCollocationList();
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

    private void setHeadData() {
        tv_user_name.setText(mDetailBean.getData().getName());
        tv_publish_num.setText("发布 " + mDetailBean.getData().getCountCollocation() + ""); //搭配个数
        tv_favor_num.setText("点赞 " + mDetailBean.getData().getThumbsupCount() + "");  //点赞数量
        tv_comment_num.setText("评论 " + mDetailBean.getData().getCountComment() + ""); //评论数量
        LogUtil.d("发布：" + mDetailBean.getData().getCountCollocation()
                + "--点赞" + mDetailBean.getData().getThumbsupCount());
    }

    private void listen() {
        mRefresh.setOnRefreshListener(new RefreshListenerAdapter() {
            @Override
            public void onLoadMore(TwinklingRefreshLayout refreshLayout) {
                mRefreshLayout = refreshLayout;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        position++;
                        getData(position, 2);
                        //  refreshLayout.finishLoadmore();
                    }
                }, 1000);
            }

            @Override
            public void onRefresh(TwinklingRefreshLayout refreshLayout) {
                mRefreshLayout = refreshLayout;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        position = 1;
                        getData(0, 1);
                        //  refreshLayout.finishRefreshing();
                    }
                }, 1000);
            }
        });
    }


}
