package com.test.examination.normal15.singleton;
/**
 * 请写一个单态模式
 */
public class SingletonTest2 {
    //设计一个静态变量
    private static SingletonTest2 singleton;
    //把对象的构造方法设计成私有的
    private SingletonTest2(){
        
    }
    
    private static SingletonTest2 getInstance(){
        synchronized (singleton) {
            if(null==singleton){
                singleton=new SingletonTest2();
            }
        }
        return singleton;
    }
}
