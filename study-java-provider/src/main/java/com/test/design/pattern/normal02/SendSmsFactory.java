package com.test.design.pattern.normal02;

/**
 * 抽象工厂模式-->sms工厂
 * Created by wanglianyi on 2017/1/26.
 */
public class SendSmsFactory implements Provider {

    public Sender produce(){
        return new SmsSender();
    }
}
