package com.example.ahuang.myframe.util;

import android.content.Context;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;

import com.example.ahuang.myframe.FashionApplication;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Created by lvliheng on 2017/4/5 at 16:29.
 */
public class HttpHelper {

    private static HttpHelper httpHelper;
    private Context context;

    private String token, app_version, userId;

    private SharedPreferencesUtil mSharedPreferencesUtil;//获取保存到本地的信息
    public final static int CONNECT_TIMEOUT =60;

    private String android_id;
    private Cache mCache;
    File cacheFile;

    public static HttpHelper getInstance() {
        if (httpHelper == null) {
            httpHelper = new HttpHelper(FashionApplication.getInstance());
        }
        return httpHelper;
    }

    public static HttpHelper getInstance(Context context) {
        if (httpHelper == null) {
            httpHelper = new HttpHelper(FashionApplication.getInstance());
        }
        return httpHelper;
    }

    public HttpHelper(Context context) {
        this.context = context;
        init();
    }

    private void init() {
        try {
            mSharedPreferencesUtil = SharedPreferencesUtil.getInstance(context);
            token = mSharedPreferencesUtil.getKey("token");
            app_version = CommonMethod.checkVersion(context);
            userId = mSharedPreferencesUtil.getKey("userId");
            android_id = Settings.Secure.getString(context.getContentResolver(),
                    Settings.Secure.ANDROID_ID);
            //缓存文件夹
            LogUtil.e("context : " + context);
            LogUtil.e("cacheDir : " + context.getExternalCacheDir());
            if (context.getExternalCacheDir() != null) {
                cacheFile = new File(context.getExternalCacheDir().getAbsolutePath(), "cachess");
                if (!cacheFile.exists()) {
                    try {
                        cacheFile.mkdir();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (cacheFile.exists()) {
                    LogUtil.d("file--" + cacheFile + "");
                }
                //缓存大小为10M
                int cacheSize = 10 * 1024 * 1024;
                //创建缓存对象
                mCache = new Cache(cacheFile, cacheSize);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void request(String url) {
        request(0, url, null, null);
    }

    public void request(String url, RequestBody requestBody) {
        request(1, url, requestBody, null);
    }

    public void request(String url, HttpCallBack callBack) {
        request(0, url, null, callBack);
    }

    public void request(String url, RequestBody requestBody, HttpCallBack callBack) {
        request(1, url, requestBody, callBack);
    }

    /**
     * 网络请求
     * @param type 类型 0: GET; 1: POST; 2: DELETE
     * @param url 请求地址
     * @param requestBody 请求参数
     * @param callBack 回调方法
     */
    public void request(int type, final String url, RequestBody requestBody, final HttpCallBack callBack) {
        try {
            if (context != null) {
                LogUtil.e("→→→ " + url + " ←←←");
            }
            if (url.equals("")) {
                return;
            }

            X509TrustManager xtm = new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }

                @Override
                public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    X509Certificate[] x509Certificates = new X509Certificate[0];
                    return x509Certificates;
                }
            };
            SSLContext sslContext = null;
            try {
                sslContext = SSLContext.getInstance("SSL");
                sslContext.init(null, new TrustManager[]{xtm}, new SecureRandom());
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } catch (KeyManagementException e) {
                e.printStackTrace();
            }
            HostnameVerifier DO_NOT_VERIFY = new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };

            //创建okHttpClient对象age
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    //      .addInterceptor(interceptor)
                    .cache(mCache)
                    .sslSocketFactory(sslContext.getSocketFactory())
                    .connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
                    .hostnameVerifier(DO_NOT_VERIFY)
                    .connectTimeout(60, TimeUnit.SECONDS)
                    .readTimeout(60, TimeUnit.SECONDS)
                    .writeTimeout(60, TimeUnit.SECONDS)
                    .build();

            //创建一个Request
            Request tempRequest = new Request.Builder()
                    .url(url)
                    .build();
            switch (type) {
                case 0:
                    tempRequest = new Request.Builder()
                            .url(url)
                            .build();
                    break;
                case 1:
                    if (requestBody != null) {
                        tempRequest = new Request.Builder()
                                .url(url)
                                .post(requestBody)
                                .build();
                    }
                    break;
                case 2:
                    if (requestBody != null) {
                        tempRequest = new Request.Builder()
                                .url(url)
                                .delete(requestBody)
                                .build();
                    }
                    break;
                default:
                    break;
            }
            final Request request = tempRequest;
            //new call
            Call call = okHttpClient.newCall(request);
            //请求加入调度
            call.enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    if(!TextUtils.isEmpty(e.getMessage())){
                        LogUtil.e(e.getMessage());
                    }
                    if (callBack != null) {
                        callBack.onFailure("网络异常");
                    }
                }

                @Override
                public void onResponse(Call call, okhttp3.Response response) throws IOException {
                    try {
                        String result = response.body().string();
                        if (context != null) {
                            LogUtil.e("↓↓↓ " + url + " ↓↓↓");
                            LogUtil.e(result);
                            LogUtil.d("network--" + response.networkResponse());
                            LogUtil.d("cache--" + response.cacheResponse());
                        }
                        JSONObject jsonObject = new JSONObject(result);
                        int state;
                        int status;
                        if (jsonObject.has("state")) {
                            state = jsonObject.getInt("state");
                        } else {
                            state = -1;
                        }
                        if (jsonObject.has("status")) {
                            status = jsonObject.getInt("status");
                        } else {
                            status = -1;
                        }

                        if (state == 0 || status == 0) {
                            if (callBack != null) {
                                callBack.onSuccess(result);
                            }
                        } else if (state == 2 || status == 2) {

                        } else {
                            //清缓存
                            LogUtil.d(Cache.key(HttpUrl.parse(url)));
                            String url_error= Cache.key(HttpUrl.parse(url));
                            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + context.getPackageName() + "/cache/cachess/"+url_error+".0");
                            File file1 = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + context.getPackageName() + "/cache/cachess/"+url_error+".1");
                            file.delete();
                            file1.delete();
                            if (callBack != null) {
                                int errorCode;
                                if (state != -1) {
                                    errorCode = state;
                                } else if (status != -1) {
                                    errorCode = status;
                                } else {
                                    errorCode = -1;
                                }
                                if (jsonObject.has("msg") && !jsonObject.getString("msg").equals("")) {
                                    callBack.onError(jsonObject.getString("msg"));

                                } else {
                                    callBack.onError("数据异常");

                                }
                            }
                        }
                        response.body().close();
                    } catch (Exception e) {
                        e.printStackTrace();
                        if (callBack != null) {
                            callBack.onError("数据异常");

                        }
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            if (callBack != null) {
                callBack.onError("数据异常");
            }
        }
    }

    public interface HttpCallBack {
        void onSuccess(String result);

        void onFailure(String msg);

        void onError(String msg);
    }



    private String getJsonData(String error_code, String error_desc, String error_url) {
        String date = CommonMethod.getCurrentTime("yyyy-MM-dd HH时");
        JSONObject jsonObject = new JSONObject();
        try {
            if (userId != null) {
                jsonObject.put("userId", userId);
            } else {
                jsonObject.put("userId", "");
            }
            if (app_version != null) {
                jsonObject.put("appVersion", app_version);
            } else {
                jsonObject.put("appVersion", "");
            }
            if (android_id != null) {
                jsonObject.put("idfa", android_id);
            } else {
                jsonObject.put("idfa", "");
            }
            if (error_code != null) {
                jsonObject.put("error_code", error_code);
            } else {
                jsonObject.put("error_code", "");
            }
            if (date != null) {
                jsonObject.put("date", date);
            } else {
                jsonObject.put("date", "");
            }
            if (error_desc != null) {
                jsonObject.put("error_desc", error_desc);
            } else {
                jsonObject.put("error_desc", "");
            }
            if (token != null) {
                jsonObject.put("token", token);
            } else {
                jsonObject.put("token", "");
            }
            if (error_url != null) {
                jsonObject.put("url", error_url);
            } else {
                jsonObject.put("url", "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        LogUtil.e("jsonObject : " + jsonObject);
        return jsonObject.toString();
    }
    public Cache provideCache() {
        mCache=new Cache(context.getCacheDir(), 10240*1024);
        return mCache;
    }
}