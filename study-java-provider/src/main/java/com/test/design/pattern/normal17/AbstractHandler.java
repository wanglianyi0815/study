package com.test.design.pattern.normal17;

/**
 * Created by wanglianyi on 2017/1/29.
 */
public class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
