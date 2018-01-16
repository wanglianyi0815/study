package com.test.mq;

import java.math.BigDecimal;
import java.util.List;

/**
 * 支付系统返回的请求数据，第三版本
 * Created by wangyateng on 16/9/19.
 */
public class PayRequestV3 {

    private String  source;

    private String appId;

    private String goodsId;

    private String goodsName;

    private BigDecimal totalAmount;

    private String returnUrl;

    private Integer purchaserId;

    private String  notifyUrl;

    private String channel;

    private PayParams params;

    private PayParams backParam;

    private List<PrePayDetail> details;

    private PrePayMail mailInfo;

    public List<PrePayDetail> getDetails() {
        return details;
    }

    public void setDetails(List<PrePayDetail> details) {
        this.details = details;
    }

    public PrePayMail getMailInfo() {
        return mailInfo;
    }

    public void setMailInfo(PrePayMail mailInfo) {
        this.mailInfo = mailInfo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public Integer getPurchaserId() {
        return purchaserId;
    }

    public void setPurchaserId(Integer purchaserId) {
        this.purchaserId = purchaserId;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public PayParams getBackParam() {
        return backParam;
    }

    public void setBackParam(PayParams backParam) {
        this.backParam = backParam;
    }

    public PayParams getParams() {
        return params;
    }

    public void setParams(PayParams params) {
        this.params = params;
        this.backParam=params;
    }
}
