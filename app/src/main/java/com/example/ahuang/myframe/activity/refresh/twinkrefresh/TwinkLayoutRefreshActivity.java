package com.example.ahuang.myframe.activity.refresh.twinkrefresh;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.api.Constant;
import com.example.ahuang.myframe.bean.CollectionDetailBean;
import com.example.ahuang.myframe.util.HttpHelper;
import com.example.ahuang.myframe.util.LogUtil;
import com.google.gson.Gson;
import com.lcodecore.tkrefreshlayout.RefreshListenerAdapter;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.lcodecore.tkrefreshlayout.footer.LoadingView;
import com.lcodecore.tkrefreshlayout.header.SinaRefreshView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 普通布局的刷新
 */

public class TwinkLayoutRefreshActivity extends AppCompatActivity {

    @BindView(R.id.img_back)
    ImageView mImgBack;
    @BindView(R.id.user_name)
    TextView mUserName;
    @BindView(R.id.tv_publish_num)
    TextView mTvPublishNum;
    @BindView(R.id.favor_num)
    TextView mFavorNum;
    @BindView(R.id.comment_num_top)
    TextView mCommentNumTop;
    @BindView(R.id.rl_background)
    RelativeLayout mRlBackground;
    @BindView(R.id.refresh)
    TwinklingRefreshLayout mRefresh;

    private String url = "https://ssrj.com/b82/api/v5/goods/findcollocationlist?pageIndex=1&pageSize=10&thememItemId=2739&appVersion=1.1.6&token=7b36988ae5519ddd8b5be1c99e3a0213";
    private CollectionDetailBean mCollectionDetailBean;
    private int type;  //0--初始化 1--刷新 2--加载
    private TwinklingRefreshLayout mRefreshLayout;

     /**
          * 定义handler
          **/
         private Handler mHandler = new Handler() {
             @Override
             public void handleMessage(Message msg) {
                 switch (msg.what) {
                     case 0:
                         setData();
                         break;
                     case 1:
                         setData();
                         mRefreshLayout.finishRefreshing();
                         break;
                     case 2:

                         break;

                 }
                 super.handleMessage(msg);
             }
         };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twink_layout_refresh);
        ButterKnife.bind(this);

        initView();
        getData(0, 0);
        listen();
    }

    private void initView() {
        mRefresh.setOverScrollRefreshShow(true);
        mRefresh.setMaxHeadHeight(100);
        SinaRefreshView headerView = new SinaRefreshView(this);
        headerView.setArrowResource(R.drawable.arrow);
        headerView.setTextColor(0xff745D5C);
//        TextHeaderView headerView = (TextHeaderView) View.inflate(this,R.layout.header_tv,null);
        mRefresh.setHeaderView(headerView);

        LoadingView loadingView = new LoadingView(this);
        mRefresh.setBottomView(loadingView);
//        mRefresh.setOverScrollBottomShow(true);
//        mRefresh.setEnableOverScroll(false);
    }


    private void getData(final int position, final int type) {
        String request_url = Constant.COLLECTION_POSITION + position + Constant.COLLECTION_ID + "2739" + Constant.COLLECTION_VERSION +
                "1.1.6" + Constant.COLLECTION_TOKEN + "7b36988ae5519ddd8b5be1c99e3a0213";
        HttpHelper.getInstance(this).request(request_url, new HttpHelper.HttpCallBack() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                try {
                    mCollectionDetailBean = gson.fromJson(result, CollectionDetailBean.class);
                    switch (type){
                        case 0:
                            mHandler.sendEmptyMessage(0);
                            break;
                        case 1:
                            mHandler.sendEmptyMessage(1);
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

    private void setData(){
        mUserName.setText(mCollectionDetailBean.getData().getName());
        mTvPublishNum.setText("发布 "+mCollectionDetailBean.getData().getCountCollocation());
        mFavorNum.setText("点赞 "+mCollectionDetailBean.getData().getThumbsupCount());
        mCommentNumTop.setText("评论 "+mCollectionDetailBean.getData().getCountComment());
        LogUtil.d("发布："+mCollectionDetailBean.getData().getCountCollocation()
                +"--点赞"+mCollectionDetailBean.getData().getThumbsupCount());
    }


    private void listen(){
        mRefresh.setOnRefreshListener(new RefreshListenerAdapter() {
            @Override
            public void onLoadMore(final TwinklingRefreshLayout refreshLayout) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        refreshLayout.finishLoadmore();
                    }
                }, 1000);
            }

            @Override
            public void onRefresh(TwinklingRefreshLayout refreshLayout) {
                mRefreshLayout = refreshLayout;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        type=1;
                        getData(0,1);
                        //  refreshLayout.finishRefreshing();
                    }
                }, 1000);
            }
        });
    }
}
