package com.example.ahuang.myframe.netservice;

import com.example.ahuang.myframe.bean.CollectionDetailBean;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Hbj on 2017/7/14.
 */

public interface CollectionService {
    @GET("/b82/api/v5/goods/findcollocationlist")

    //1.Query
   /* Call<CollectionDetailBean> getCollection(
            @Query("pageIndex") String pageIndex,
            @Query("pageSize") String pageSize,
            @Query("thememItemId") String thememItemId,
            @Query("appVersion") String appVersion,
            @Query("token") String token);     */


    //2.QueryMap
    Call<CollectionDetailBean> getCollection(
            @QueryMap Map<String,String> options);


}
