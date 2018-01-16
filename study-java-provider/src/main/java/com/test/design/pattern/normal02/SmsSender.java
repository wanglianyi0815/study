package com.test.design.pattern.normal02;

/**
 * 工厂模式-->sender的实现者.
 * Created by wanglianyi on 2017/1/26.
 */
public class SmsSender implements Sender {
    public void send(){
        System.out.println("this is sms sender");
    }
}
