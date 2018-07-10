package com.example.ahuang.myframe.activity.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.api.Constant;
import com.example.ahuang.myframe.bean.ObtinEmailCodeBean;
import com.example.ahuang.myframe.netservice.ObtinEmailCodeService;
import com.example.ahuang.myframe.util.CommonMethod;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BasicUsePostActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.tv_result)
    TextView mTvResult;
    @BindView(R.id.btn_request)
    Button mBtnRequest;
    private ObtinEmailCodeBean mObtinEmailCodeBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_use_post);
        ButterKnife.bind(this);
        mBtnRequest.setOnClickListener(this);

    }

    /**
     * 获取验证码
     */
    private void getEmailCode() {
        //设置OkhttpClient，打印Log信息
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
        ObtinEmailCodeService obtinEmailCodeService = retrofit.create(ObtinEmailCodeService.class);

        //==========================================================================
        //  1.Filed
        final Call<ObtinEmailCodeBean> call = obtinEmailCodeService.getEmailCode("1.1.4", "b808d066c623bb109711494239ef62ba"
                , "512395540@qq.com", "android", "0");
        //==============================================================================
        //2 FieldMap
       /* Map<String,String> fields=new HashMap<>();
        fields.put("appVersion","1.1.4");
        fields.put("token","b808d066c623bb109711494239ef62ba");
        fields.put("email","512395540@qq.com");
        fields.put("type","android");
        fields.put("codeType","0");
        final Call<ObtinEmailCodeBean> call=obtinEmailCodeService.getEmailCode(fields);*/

        //==============================================================================
        //@Body
//        ParaEailCode mParaEmailCode = new ParaEailCode("1.1.4","b808d066c623bb109711494239ef62ba","512395540@qq.com"
//        ,"android","0");
       /* mParaEmailCode.setAppVersion("1.1.4");
        mParaEmailCode.setEmail("512395540@qq.com");
        mParaEmailCode.setToken("b808d066c623bb109711494239ef62ba");
        mParaEmailCode.setCodeType("0");
        mParaEmailCode.setType("android");*/
       /* final Call<ObtinEmailCodeBean> call=obtinEmailCodeService.getEmailCode(new ParaEailCode("1.1.4","b808d066c623bb109711494239ef62ba","512395540@qq.com"
                ,"android","0"));*/
        call.enqueue(new Callback<ObtinEmailCodeBean>() {
            @Override
            public void onResponse(Call<ObtinEmailCodeBean> call, Response<ObtinEmailCodeBean> response) {
                mObtinEmailCodeBean = response.body();
                if (response.body().getState() == 0) {
                    CommonMethod.showToast(BasicUsePostActivity.this, "获取验证码成功");
                } else {
                    CommonMethod.showToast(BasicUsePostActivity.this, mObtinEmailCodeBean.getMsg());
                }
            }

            @Override
            public void onFailure(Call<ObtinEmailCodeBean> call, Throwable t) {

            }
        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_request:  //请求网络
                getEmailCode();
                break;
        }
    }
}
