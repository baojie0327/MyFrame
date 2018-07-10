package com.example.ahuang.myframe.activity.rxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.api.Constant;
import com.example.ahuang.myframe.bean.CollectionDetailBean;
import com.example.ahuang.myframe.netservice.ApiService;
import com.example.ahuang.myframe.util.CommonMethod;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * RxJava和Retrofit结合使用
 *
 * @author Jackson
 */
public class RxRetrActivity extends AppCompatActivity {

    @BindView(R.id.basic_used)
    Button mBasicUsed;
    @BindView(R.id.tv_show)
    TextView mTvShow;

    @OnClick(R.id.basic_used)
    public void basicUsed() {

        //创建client
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor()  //拦截请求的Log信息
                        .setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();

        //创建Retrofit2的实例，并设置BaseUrl和Gson转换
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constant.base_url)
                .addConverterFactory(GsonConverterFactory.create()) //设置 Json 转换器
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())  //RxJava 适配器
                .client(client)
                .build();

        //创建请求服务
        ApiService apiService = retrofit.create(ApiService.class);

        //请求的参数
        Map<String, String> options = new HashMap<>();
        options.put("pageIndex", "1");
        options.put("pageSize", "10");
        options.put("thememItemId", "2739");
        options.put("appVersion", "1.1.4");
        options.put("token", "7b36988ae5519ddd8b5be1c99e3a0213");

        apiService.getCollection(options)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CollectionDetailBean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull CollectionDetailBean collectionDetailBean) {
                        if (collectionDetailBean.getState() == 0) {
                            mTvShow.setText(collectionDetailBean.getData().toString());
                        }

                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        CommonMethod.showToast(RxRetrActivity.this,e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        CommonMethod.showToast(RxRetrActivity.this,"获取数据完毕");
                    }
                });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_retr);
        ButterKnife.bind(this);
    }
}
