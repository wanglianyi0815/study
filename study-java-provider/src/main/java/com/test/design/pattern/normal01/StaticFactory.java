package com.test.design.pattern.normal01;

/**
 * 工厂模式-->静态工厂方法模式
 * 将上面的工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 * Created by Administrator on 2017/1/26.
 */
public class StaticFactory {
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }

    public static void main(String[] args){
        Sender sender=StaticFactory.produceMail();
        sender.send();
    }
}
