package com.example.ahuang.myframe.netservice;

import com.example.ahuang.myframe.bean.CollectionDetailBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Retrofit 网络请求的Service
 * Created by Jackson on 2017/9/6.
 */

public interface ApiService {
    @GET("/b82/api/v5/goods/findcollocationlist")
    Observable<CollectionDetailBean> getCollection(
            @QueryMap Map<String,String> options);
}
