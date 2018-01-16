package com.test.design.pattern.normal07;

/**
 * Source类是被装饰类.
 * Created by wanglianyi on 2017/1/28.
 */
public class Source implements Sourceable {
    public void method(){
        System.out.println("the original method!");
    }
}
