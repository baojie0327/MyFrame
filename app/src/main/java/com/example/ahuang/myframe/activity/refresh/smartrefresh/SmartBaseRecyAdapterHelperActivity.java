package com.example.ahuang.myframe.activity.refresh.smartrefresh;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.adapter.SmartHelperAdapter;
import com.example.ahuang.myframe.api.Constant;
import com.example.ahuang.myframe.bean.CollectionDetailBean;
import com.example.ahuang.myframe.util.CommonMethod;
import com.example.ahuang.myframe.util.DynamicTimeFormat;
import com.example.ahuang.myframe.util.HttpHelper;
import com.example.ahuang.myframe.util.LogUtil;
import com.google.gson.Gson;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * smart 刷新 BaseRecyAdapterHelper
 */
public class SmartBaseRecyAdapterHelperActivity extends AppCompatActivity {

    @BindView(R.id.recycleView)
    RecyclerView mRecycleView;
    @BindView(R.id.smartRefresh)
    SmartRefreshLayout mSmartRefresh;

    private ClassicsHeader mClassicsHeader;
    private ClassicsFooter mClassicsFooter;

    private CollectionDetailBean mDetailBean;//存放数据的实体类
    private CollectionDetailBean.DataBean mDataBean;
    private List<CollectionDetailBean.DataBean.CollocationListBean> mCollocationList;
    private int page_index = 1;

    private SmartHelperAdapter mSmartHelperAdapter;

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
                           /* mSmartHelperAdapter=new SmartHelperAdapter(R.layout.item_collection_detail_recycler_layout,mCollocationList);
                            mRecycleView.setAdapter(mSmartHelperAdapter);*/
                            setHeadData();
                            mSmartHelperAdapter.setNewData(mCollocationList);
                            mRecycleView.addOnItemTouchListener(new OnItemClickListener() {
                                @Override
                                public void onSimpleItemClick(BaseQuickAdapter adapter, View view, int position) {
                                    CommonMethod.showToast(SmartBaseRecyAdapterHelperActivity.this,"click--"+position);
                                }
                            });
                           /* mSmartHelperAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
                                @Override
                                public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                                    switch (view.getId()){
                                        case R.id.assort_picture:
                                            CommonMethod.showToast(SmartBaseRecyAdapterHelperActivity.this,"picture--"+position);
                                            break;
                                        case R.id.assort_name:
                                            CommonMethod.showToast(SmartBaseRecyAdapterHelperActivity.this,"name--"+position);
                                            break;
                                    }
                                }
                            });*/
                            mSmartHelperAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
                                @Override
                                public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                                    switch (view.getId()){
                                        case R.id.assort_picture:
                                            CommonMethod.showToast(SmartBaseRecyAdapterHelperActivity.this,"picture--"+position);
                                            break;
                                        case R.id.assort_name:
                                            CommonMethod.showToast(SmartBaseRecyAdapterHelperActivity.this,"name--"+position);
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            mSmartHelperAdapter.setNewData(mCollocationList);
                            setHeadData();
                            mSmartRefresh.finishRefresh();
                            mSmartRefresh.setLoadmoreFinished(false);
                            break;
                        case 2:
                            mSmartHelperAdapter.addData(mCollocationList);
                            mSmartRefresh.finishLoadmore();
                            if (mCollocationList.size()<10){
                                mSmartRefresh.setLoadmoreFinished(true);
                            }
                            break;
                    }
                    super.handleMessage(msg);
                }
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart_base_recy_adapter_helper);
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

        tv_user_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommonMethod.showToast(SmartBaseRecyAdapterHelperActivity.this,"name");
            }
        });


        GridLayoutManager layoutManager = new GridLayoutManager(SmartBaseRecyAdapterHelperActivity.this, 2);
        mRecycleView.setLayoutManager(layoutManager);

        mCollocationList = new ArrayList<CollectionDetailBean.DataBean.CollocationListBean>();
        int deta = new Random().nextInt(7 * 24 * 60 * 60 * 1000);
        mClassicsHeader = (ClassicsHeader) mSmartRefresh.getRefreshHeader();
        mClassicsHeader.setLastUpdateTime(new Date(System.currentTimeMillis() - deta));
        mClassicsHeader.setTimeFormat(new SimpleDateFormat("更新于 MM-dd HH:mm", Locale.CHINA));
        mClassicsHeader.setTimeFormat(new DynamicTimeFormat("更新于 %s"));

        mClassicsFooter=(ClassicsFooter) mSmartRefresh.getRefreshFooter();
        mClassicsFooter.setVisibility(View.VISIBLE);
    }



    private void initData() {

        //  mCollocationList = new ArrayList<CollectionDetailBean.DataBean.CollocationListBean>();
        // adapter = new CollDetailRecyAdapter(RecyCommAdapterActivity.this, mCollocationList);
        mSmartHelperAdapter=new SmartHelperAdapter(R.layout.item_collection_detail_recycler_layout,mCollocationList);
        /*mHeaderAndFooterRecyclerViewAdapter=new HeaderAndFooterRecyclerViewAdapter(mAdapter);
        mRecycleView.setAdapter(mHeaderAndFooterRecyclerViewAdapter);
        RecyclerViewUtils.setHeaderView(mRecycleView,header);*/

        mRecycleView.setAdapter(mSmartHelperAdapter);
        mSmartHelperAdapter.addHeaderView(header);

    }



    private void getData(final int page_index, final int type) {
        String request_url = Constant.COLLECTION_POSITION + page_index + Constant.COLLECTION_ID + "2739" + Constant.COLLECTION_VERSION +
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

        mSmartRefresh.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                page_index = 1;
                getData(page_index, 1);
            }
        });

        mSmartRefresh.setOnLoadmoreListener(new OnLoadmoreListener() {
            @Override
            public void onLoadmore(RefreshLayout refreshlayout) {
                page_index++;
                getData(page_index, 2);
            }
        });

    }





}
