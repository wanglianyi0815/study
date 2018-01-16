package com.test.mq;

/**
 * 支付参数对象
 * Created by wangyateng on 2016/10/19.
 */
public class PayParams {

    /**
     * 项目打包环境变量
     */
    private String packageEnv;

    /**
     * 用户购买的商品规格ID
     */
    private String goodsSpecId;

    /**
     * 是否是多商品订单，null或0为非多商品订单；1为多商品订单
     */
    private Integer isMultiGoodsOrder;

    public Integer getIsMultiGoodsOrder() {
        return isMultiGoodsOrder;
    }

    public void setIsMultiGoodsOrder(Integer isMultiGoodsOrder) {
        this.isMultiGoodsOrder = isMultiGoodsOrder;
    }


    public String getGoodsSpecId() {
        return goodsSpecId;
    }

    public void setGoodsSpecId(String goodsSpecId) {
        this.goodsSpecId = goodsSpecId;
    }

    public String getPackageEnv() {
        return packageEnv;
    }

    public void setPackageEnv(String packageEnv) {
        this.packageEnv = packageEnv;
    }
}
