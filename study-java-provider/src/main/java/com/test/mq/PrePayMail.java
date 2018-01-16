package com.test.mq;

import java.math.BigDecimal;

/**
 * 订单邮寄信息表,表结构为prepay_mail.
 * Created by wanglianyi on 2017/4/28 0028.
 */
public class PrePayMail {
    private String orderSn;
    private String addressId;
    private String invoiceAddressId;
    private String mailCode;
    private String mailName;
    private String consigneeName;
    private String regionCode;
    private String regionName;
    private String address;
    private String zipCode;
    private String telephone;
    private String mobilephone;
    private String invoiceTitle;
    private String invoiceAddress;
    private BigDecimal mailFee;

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getInvoiceAddressId() {
        return invoiceAddressId;
    }

    public void setInvoiceAddressId(String invoiceAddressId) {
        this.invoiceAddressId = invoiceAddressId;
    }

    public String getMailCode() {
        return mailCode;
    }

    public void setMailCode(String mailCode) {
        this.mailCode = mailCode;
    }

    public String getMailName() {
        return mailName;
    }

    public void setMailName(String mailName) {
        this.mailName = mailName;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(String invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public BigDecimal getMailFee() {
        return mailFee;
    }

    public void setMailFee(BigDecimal mailFee) {
        this.mailFee = mailFee;
    }
}
