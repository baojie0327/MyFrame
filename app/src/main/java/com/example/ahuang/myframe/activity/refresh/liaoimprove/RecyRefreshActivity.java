package com.example.ahuang.myframe.activity.refresh.liaoimprove;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.chanven.lib.cptr.PtrClassicFrameLayout;
import com.chanven.lib.cptr.PtrDefaultHandler;
import com.chanven.lib.cptr.PtrFrameLayout;
import com.chanven.lib.cptr.header.MaterialHeader;
import com.chanven.lib.cptr.loadmore.OnLoadMoreListener;
import com.chanven.lib.cptr.recyclerview.RecyclerAdapterWithHF;
import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.adapter.CollDetailRecyAdapter;
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

/**
 * RecycleView添加 HeaderView FooterView，刷新，加载，改进的廖谷秋方法
 * compile 'com.chanven.lib:cptr:1.1.0'
 */

public class RecyRefreshActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;
    @BindView(R.id.refresh)
    PtrClassicFrameLayout mRefresh;


    private CollDetailRecyAdapter adapter;
    private RecyclerAdapterWithHF mAdapter;

    private CollectionDetailBean mDetailBean;//存放数据的实体类
    private CollectionDetailBean.DataBean mDataBean;
    private List<CollectionDetailBean.DataBean.CollocationListBean> mCollocationList;
    private int position;

    private View header;
    private TextView tv_user_name;
    private TextView tv_publish_num;
    private TextView tv_favor_num;
    private TextView tv_comment_num;

    /**
     * 定义handler
     **/
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    setHeadData();
                    adapter.setData(mCollocationList);
                    adapter.setOnItemClickLitener(new CollDetailRecyAdapter.OnItemClickLitener() {
                        @Override
                        public void onItemClick(View view, int position) {
                            Toast.makeText(RecyRefreshActivity.this, "click--" + position, Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onItemLongClick(View view, int position) {

                        }
                    });
                    break;
                case 1:
                    setHeadData();
                    mRefresh.refreshComplete();
                    adapter.setData(mCollocationList);
                    mAdapter.notifyDataSetChanged();
                    if (!mRefresh.isLoadMoreEnable()) {
                        mRefresh.setLoadMoreEnable(true);
                    }

                    break;
                case 2:
                    //   mRefresh.refreshComplete();
                    adapter.addData(mCollocationList);
                    mAdapter.notifyDataSetChanged();
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
        setContentView(R.layout.activity_recy_refresh);
        ButterKnife.bind(this);

        initView();
        initData();
        getData(0, 0);
        refreshListen();
    }

    private void initView() {

        //头布局
        header = LayoutInflater.from(this).inflate(R.layout.head_collection_recycle_view_layout, null);
        tv_user_name = (TextView) header.findViewById(R.id.user_name);
        tv_publish_num = (TextView) header.findViewById(R.id.tv_publish_num);
        tv_favor_num = (TextView) header.findViewById(R.id.favor_num);
        tv_comment_num = (TextView) header.findViewById(R.id.comment_num_top);

        GridLayoutManager layoutManager = new GridLayoutManager(RecyRefreshActivity.this, 2);
        mRecyclerView.setLayoutManager(layoutManager);

        layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                int viewType = mAdapter.getItemViewType(position);
                //   LogUtil.d(viewType + "ppp");
                if (viewType == RecyclerAdapterWithHF.TYPE_FOOTER) {
                    return 2;
                } else if (viewType == RecyclerAdapterWithHF.TYPE_HEADER) {
                    return 2;
                } else {
                    return 1;
                }
                //  return viewType == RecyclerAdapterWithHF.TYPE_FOOTER  ? 2 : 1;
            }
        });

        // header
        final MaterialHeader header1 = new MaterialHeader(RecyRefreshActivity.this);
        int[] colors = getResources().getIntArray(R.array.google_colors);
        header1.setColorSchemeColors(colors);
        header1.setLayoutParams(new PtrFrameLayout.LayoutParams(-1, -2));
        header1.setPadding(0, LocalDisplay.dp2px(15), 0, LocalDisplay.dp2px(10));
        header1.setPtrFrameLayout(mRefresh);

        mRefresh.setLoadingMinTime(100);
        mRefresh.setDurationToCloseHeader(150);
        mRefresh.setHeaderView(header1);
        mRefresh.addPtrUIHandler(header1);

        mRefresh.setPinContent(true);



    }

    private void initData() {

        mCollocationList = new ArrayList<CollectionDetailBean.DataBean.CollocationListBean>();
        adapter = new CollDetailRecyAdapter(RecyRefreshActivity.this, mCollocationList);
        mAdapter = new RecyclerAdapterWithHF(adapter);
        mAdapter.addHeader(header);
        mRecyclerView.setAdapter(mAdapter);
        mRefresh.setLastUpdateTimeRelateObject(this);  //显示刷新时间
        mRefresh.postDelayed(new Runnable() {
            @Override
            public void run() {
                mRefresh.autoRefresh(true);
            }
        }, 150);



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
