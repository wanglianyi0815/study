package com.test.examination.normal15.singleton;

/**
 * 请写一个单态模式
 */
public class SingletonTest {
    //设计一个静态变量
    private static SingletonTest singleton = new SingletonTest();
    //把对象的构造方法设计成私有的
    private SingletonTest(){
        
    }
    
    public static SingletonTest getInstance(){
        return singleton;
    }
}
