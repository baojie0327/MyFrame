package com.example.ahuang.myframe.activity.refresh.liaohuqiu;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.adapter.base.CommonAdapter;
import com.example.ahuang.myframe.adapter.base.ViewHolder;
import com.example.ahuang.myframe.adapter.wrapper.HeaderAndFooterWrapper;
import com.example.ahuang.myframe.adapter.wrapper.LoadMoreWrapper;
import com.example.ahuang.myframe.api.Constant;
import com.example.ahuang.myframe.bean.CollectionDetailBean;
import com.example.ahuang.myframe.util.HttpHelper;
import com.example.ahuang.myframe.util.LogUtil;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;

/**
 * RecycleView 适配器的封装（crash），廖谷秋原生方法，想用封装的适配器，没成功
 */
public class RecyCommAdapterActivity extends AppCompatActivity {


    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;
    @BindView(R.id.refresh)
    PtrClassicFrameLayout mRefresh;

    private CollectionDetailBean mDetailBean;//存放数据的实体类
    private CollectionDetailBean.DataBean mDataBean;
    private List<CollectionDetailBean.DataBean.CollocationListBean> mCollocationList;
    private int page_index;

    private View header;
    private TextView tv_user_name;
    private TextView tv_publish_num;
    private TextView tv_favor_num;
    private TextView tv_comment_num;

    private CommonAdapter<CollectionDetailBean.DataBean.CollocationListBean> adapter;  //数据
    private HeaderAndFooterWrapper mHeaderAndFooterWrapper;  //添加HeaderView,FooterView
    private LoadMoreWrapper mLoadMoreWrapper;

    /**
     * 定义handler
     **/
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    initData();
                  //  adapter.showData();
                    setHeadData();
                    break;
                case 1:
                    setHeadData();
                    adapter.setData(mCollocationList);
                    mRefresh.refreshComplete();
                    break;
                case 2:
                    LogUtil.d("run here--");
                    LogUtil.d("mCollocationList=="+mCollocationList.size());
                    if (mCollocationList.size() < 10) {
                        mLoadMoreWrapper.isHasMore(false);
                      //  initData();
                       adapter.addData(mCollocationList);
                      //  adapter.showData();
                        adapter.notifyDataSetChanged();
                   //     mLoadMoreWrapper.notifyDataSetChanged();

                      //  mHandler.sendEmptyMessage(4);
                    } else {
                        mLoadMoreWrapper.isHasMore(true);
                     //   initData();
                        adapter.addData(mCollocationList);
//                        adapter.showData();
                        adapter.notifyDataSetChanged();
                       // mHandler.sendEmptyMessage(4);
                    //    mLoadMoreWrapper.notifyDataSetChanged();
                    }
                    break;
                case 4:
                  //  mLoadMoreWrapper.notifyDataSetChanged();
                    break;

            }
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recy_comm_adapter);
        ButterKnife.bind(this);

        initView();
    //    initData();
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

        GridLayoutManager layoutManager = new GridLayoutManager(RecyCommAdapterActivity.this, 2);
        mRecyclerView.setLayoutManager(layoutManager);

        mCollocationList = new ArrayList<CollectionDetailBean.DataBean.CollocationListBean>();

        mRefresh.setLastUpdateTimeRelateObject(this);  //显示刷新时间
        mRefresh.postDelayed(new Runnable() {
            @Override
            public void run() {
                mRefresh.autoRefresh(true);
            }
        }, 150);

    }

    private void initData() {

        //  mCollocationList = new ArrayList<CollectionDetailBean.DataBean.CollocationListBean>();
        // adapter = new CollDetailRecyAdapter(RecyCommAdapterActivity.this, mCollocationList);
        adapter = new CommonAdapter<CollectionDetailBean.DataBean.CollocationListBean>(this, R.layout.item_collection_detail_recycler_layout, mCollocationList) {

            @Override
            protected void convert(ViewHolder holder, CollectionDetailBean.DataBean.CollocationListBean bean, int position) {
                holder.setImageNet(R.id.assort_picture, bean.getPicture());
                holder.setText(R.id.assort_name, bean.getName());
                holder.setImageNet(R.id.img_avater, bean.getMemberPO().getAvatar());
                holder.setText(R.id.avater_name, bean.getUserName());
            }
        };
        initHeaderAndFooter();
       /* mLoadMoreWrapper = new LoadMoreWrapper(mHeaderAndFooterWrapper);
        mLoadMoreWrapper.setLoadMoreView(R.layout.default_loading);
        mLoadMoreWrapper.isHasMore(true);
       mLoadMoreWrapper.isShowMore(true);*/
      /*  mLoadMoreWrapper.setOnLoadMoreListener(new LoadMoreWrapper.OnLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        page_index++;
                        getData(page_index, 2);
                        mLoadMoreWrapper.notifyDataSetChanged();
                    }

                }, 1000);
            }
        });*/

        mRecyclerView.setAdapter(mHeaderAndFooterWrapper);


    }

    private void initHeaderAndFooter() {
        mHeaderAndFooterWrapper = new HeaderAndFooterWrapper(adapter);
        mHeaderAndFooterWrapper.addHeaderView(header);
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
        mRefresh.setPtrHandler(new PtrDefaultHandler() {
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                page_index = 1;
                getData(page_index, 1);
            }
        });
       /* mRefresh.setPtrHandler(new PtrDefaultHandler() {
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
        });*/
    }

}
