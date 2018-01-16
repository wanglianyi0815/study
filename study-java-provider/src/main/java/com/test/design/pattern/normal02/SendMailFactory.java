package com.test.design.pattern.normal02;

/**
 * 抽象工厂模式-->实现工厂2
 * Created by wanglianyi on 2017/1/26.
 */
public class SendMailFactory implements Provider{
    public Sender produce(){
        return new MailSender();
    }
}
