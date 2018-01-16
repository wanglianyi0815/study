package com.test.examination.normal16.thread;

/**
 * api中解释： 暂停当前正在执行的线程对象，并执行其他线程。
 * 注意：这里的其他也包含当前线程，所以会出现以下结果。
 * Created by wanglianyi on 2017/4/25 0025.
 */
public class TestThreadYield extends Thread{
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            new TestThreadYield().start();
        }
    }

    public void run() {
        System.out.print("1");
        yield();
        System.out.print("2");
    }

}
