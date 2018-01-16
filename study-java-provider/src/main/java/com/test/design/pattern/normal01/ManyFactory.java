package com.test.design.pattern.normal01;

/**
 * 工厂模式-->多个工厂方法模式
 * 是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象。
 * Created by wanglianyi. on 2017/1/26.
 */
public class ManyFactory {
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }

    public static void main(String[] args){
        ManyFactory factory=new ManyFactory();
        Sender sender=factory.produceMail();
        sender.send();
    }
}
