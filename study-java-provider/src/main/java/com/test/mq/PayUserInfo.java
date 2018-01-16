package com.test.mq;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 支付系统返回的用户信息
 * Created by wangyateng on 16/9/19.
 */
public class PayUserInfo {

    @JSONField(name="uid")
    private String  userId;

    @JSONField(name="nickname")
    private String nickName;

    @JSONField(name="userdetail")
    private String userDetail;

    @JSONField(name="userlogo")
    private String userLogo;

    @JSONField(name="usertype")
    private Integer userType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(String userDetail) {
        this.userDetail = userDetail;
    }

    public String getUserLogo() {
        return userLogo;
    }

    public void setUserLogo(String userLogo) {
        this.userLogo = userLogo;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}
