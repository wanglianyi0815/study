package com.test.design.pattern.normal02;

/**
 * 工厂模式里的邮件发送实现.
 * Created by wanglianyi on 2017/1/26.
 */
public class MailSender implements Sender {
    public void send(){
        System.out.println("this is mailsender");
    }
}
