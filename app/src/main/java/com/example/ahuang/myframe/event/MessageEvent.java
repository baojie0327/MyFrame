package com.example.ahuang.myframe.event; /**
 * MessageEvent   2017-07-12
 * Copyright (c) 2017 SSRJ Co.Ltd. All right reserved.
 */

/**
 * 定义消息事件类型
 *
 * @author Borje
 * @version 1.0.0
 *          since 2017 07 12
 */
public class MessageEvent {

    private String message;

    public MessageEvent(String mess) {
        this.message = mess;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}