package com.example.ahuang.myframe.bean; /**
 * ObtinEmailCodeBean  2017-08-14
 * Copyright (c) 2017 SSRJ Co.Ltd. All right reserved.
 */

/**
 * class description here
 * @author Borje
 * @version 1.0.0
 * since 2017 08 14
 */
public class ObtinEmailCodeBean {

    /**
     * msg : 您的邮箱地址已注册，无法绑定
     * state : 1
     * token :
     * appVersion : 1.1.4
     */

    private String msg;
    private int state;
    private String token;
    private String appVersion;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
}