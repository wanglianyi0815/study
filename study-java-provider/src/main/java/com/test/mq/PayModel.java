package com.test.mq;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 支付系统返回的 body
 * Created by wanglianyi on 16/9/19.
 */
public class PayModel {

    private String source;

    private Integer type;

    @JSONField(name="trade_no")
    private String tradeNo;

    @JSONField(name="total_fee")
    private BigDecimal totalFee;

    @JSONField(name="product_id")
    private String productId;

    @JSONField(name="product_name")
    private String productName;

    @JSONField(name="pay_time")
    private String payTime;

    @JSONField(name="transaction_id")
    private String transactionId;

    private String appid;

    private String code;

    private String msg;


    @JSONField(name="user_info")
    private PayUserInfo payUserInfo;

    @JSONField(name="pay_request")
    private PayRequestV3 payRequestV3;

    @JSONField(name="pay_result_data")
    private Map payResultData;



    public PayUserInfo getPayUserInfo() {
        return payUserInfo;
    }

    public void setPayUserInfo(PayUserInfo payUserInfo) {
        this.payUserInfo = payUserInfo;
    }

    public PayRequestV3 getPayRequestV3() {
        return payRequestV3;
    }

    public void setPayRequestV3(PayRequestV3 payRequestV3) {
        this.payRequestV3 = payRequestV3;
    }

    public Map getPayResultData() {
        return payResultData;
    }

    public void setPayResultData(Map payResultData) {
        this.payResultData = payResultData;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
