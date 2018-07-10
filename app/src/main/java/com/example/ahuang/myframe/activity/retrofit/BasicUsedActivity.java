package com.example.ahuang.myframe.activity.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.adapter.CollDetailRecyAdapter;
import com.example.ahuang.myframe.api.Constant;
import com.example.ahuang.myframe.bean.CollectionDetailBean;
import com.example.ahuang.myframe.netservice.CollectionService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BasicUsedActivity extends AppCompatActivity {


    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    private CollDetailRecyAdapter mAdapter;

    private CollectionDetailBean mDetailBean;//存放数据的实体类
    private List<CollectionDetailBean.DataBean.CollocationListBean> mCollocationList;

    private String url = "https://ssrj.com/b82/api/v5/goods/findcollocationlist?pageIndex=0" +
            "&pageSize=10&thememItemId=2739&appVersion=1.1.4&token=7b36988ae5519ddd8b5be1c99e3a0213";
    private String base_url = "https://ssrj.com/b82/api/v5/goods/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_used);
        ButterKnife.bind(this);

        initView();
        getData();

    }


    private void initView() {
        GridLayoutManager layoutManager = new GridLayoutManager(BasicUsedActivity.this, 2);
        mRecyclerView.setLayoutManager(layoutManager);
    }

    private void getData() {



        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor()
                .setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();
        //创建Retrofit2的实例，并设置BaseUrl和Gson转换
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constant.base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        //创建请求服务，并为网络请求方法设置参数
        CollectionService collectionService = retrofit.create(CollectionService.class);

        //Query
       // final Call<CollectionDetailBean> call = collectionService.getCollection("1", "10", "2739", "1.1.4", "7b36988ae5519ddd8b5be1c99e3a0213");

        //QueryMap
        Map<String,String> options=new HashMap<>();
        options.put("pageIndex","1");
        options.put("pageSize","10");
        options.put("thememItemId","2739");
        options.put("appVersion","1.1.4");
        options.put("token","7b36988ae5519ddd8b5be1c99e3a0213");

        final Call<CollectionDetailBean> call=collectionService.getCollection(options);

        //异步请求
        call.enqueue(new Callback<CollectionDetailBean>() {
            @Override
            public void onResponse(Call<CollectionDetailBean> call, Response<CollectionDetailBean> response) {
                if (response.body().getState() == 0) {
                    mDetailBean = response.body();
                    mCollocationList = mDetailBean.getData().getCollocationList();
                    mAdapter = new CollDetailRecyAdapter(BasicUsedActivity.this, mCollocationList);
                    mRecyclerView.setAdapter(mAdapter);
                }
            }

            @Override
            public void onFailure(Call<CollectionDetailBean> call, Throwable t) {

            }
        });


        //同步
        /**  new Thread(new Runnable() {
        @Override public void run() {
        try {
        Response<CollectionDetailBean> response=  call.execute();;
        LogUtil.d("response=="+response.body().toString());
        } catch (IOException e) {
        e.printStackTrace();
        }

        }
        }).start();  **/

    }


}
