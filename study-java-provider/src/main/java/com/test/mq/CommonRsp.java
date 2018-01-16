package com.test.mq;


/**
 * 公共返回.
 * Created by wanglianyi on 2017/5/15 0015.
 */
public class CommonRsp<T> {
    /**
     * 错误代码.
     */
    private int code;

    /**
     * 错误描述.
     */
    private String msg;

    /**
     * 返回数据.
     */
    private T datas;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getDatas() {
        return datas;
    }

    public void setDatas(T datas) {
        this.datas = datas;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
