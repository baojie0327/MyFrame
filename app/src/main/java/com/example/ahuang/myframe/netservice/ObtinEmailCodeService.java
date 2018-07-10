package com.example.ahuang.myframe.netservice;

import com.example.ahuang.myframe.bean.ObtinEmailCodeBean;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;

/**
 * Created by Hbj on 2017/8/14.
 */

public interface ObtinEmailCodeService {
  //  @FormUrlEncoded
    @POST("/b180/api/v1/captcha/email/")
    //1.Field
    Call<ObtinEmailCodeBean> getEmailCode(
            @Field("appVersion")  String appVersion,
            @Field("token") String token,
            @Field("email") String email,
            @Field("type") String type,
            @Field("codeType") String codeType);
    /****
    @Field注解将每一个请求参数都存放至请求体中，还可以添加encoded参数，该参数为boolean型，具体的用法为
    @Field(value = "book", encoded = true) String book
    encoded参数为true的话，key-value-pair将会被编码，即将中文和特殊字符进行编码转换  ***/

   // 2.FieldMap
   /* Call<ObtinEmailCodeBean> getEmailCode(
            @FieldMap Map<String,String> fields);*/

    //3 @Body 要去掉@FormUrlEncoded
  /*  Call<ObtinEmailCodeBean> getEmailCode(
            @Body ParaEailCode paraEailCode);*/

}
