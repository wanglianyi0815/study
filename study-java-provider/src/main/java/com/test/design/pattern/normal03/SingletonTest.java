package com.test.design.pattern.normal03;

/**
 * 单例模式.
 * Created by wanglianyi on 2017/1/26.
 */
public class SingletonTest {
    private static SingletonTest instance = null;
    private SingletonTest() {
    }
    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new SingletonTest();
        }
    }
    public static SingletonTest getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}
