package com.example.ahuang.myframe.bean; /**
 * ParaEailCode  2017-08-16
 * Copyright (c) 2017 SSRJ Co.Ltd. All right reserved.
 */

/**
 * class description here
 *
 * @author Borje
 * @version 1.0.0
 *          since 2017 08 16
 */
public class ParaEailCode {
    public String appVersion;
    public String token;
    public String email;
    public String type;
    public String codeType;

    public ParaEailCode(String appVersion, String token, String email, String type, String codeType) {
        this.appVersion = appVersion;
        this.token = token;
        this.email = email;
        this.type = type;
        this.codeType = codeType;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }
}