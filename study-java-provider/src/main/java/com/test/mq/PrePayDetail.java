package com.test.mq;

import java.math.BigDecimal;

/**
 * 订单信息,表结构为prepay_detail.
 * Created by wanglianyi on 2017/4/28 0028.
 */
public class PrePayDetail {
    private String detailId;
    private String orderSn;
    //临时用，数据库表里没有，后期改造后删除
    private String goodsId;
    private String goodsName;
    private String goodsCode;
    private String goodsImage;
    private String firstLevelCode;
    private String specification;
    private BigDecimal price;
    private BigDecimal quantity;
    private BigDecimal amt;
    private String introduce;

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
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

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }

    public String getFirstLevelCode() {
        return firstLevelCode;
    }

    public void setFirstLevelCode(String firstLevelCode) {
        this.firstLevelCode = firstLevelCode;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
