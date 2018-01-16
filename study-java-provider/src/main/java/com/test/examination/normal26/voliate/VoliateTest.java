package com.test.examination.normal26.voliate;

import java.util.concurrent.CountDownLatch;

/**
 * 测试voliate关键字
 * 用在多线程，同步变量。
 * 线程为了提高效率，将成员变量(如A)某拷贝了一份（如B），线程中对A的访问其实访问的是B。
 * 只在某些动作时才进行A和B的同步。
 * 因此存在A和B不一致的情况。volatile就是用来避免这种情况的。
 * volatile告诉jvm， 它所修饰的变量不保留拷贝，直接访问主内存中的（也就是上面说的A) ，但是不能用其来进行多线程同步控制
 * Created by wanglianyi on 2017/1/25.
 */
public class VoliateTest {
    public static int count = 0;

    public static void inc() {
        //这里延迟5毫秒，使得结果明显
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
        //synchronized打开则为1000
        //synchronized(Counter.class) {
        count++;
        //}
    }

    public static void main(String[] args) throws InterruptedException {
        //一个同步辅助类，在完成一组正在其他线程中执行的操作之前，它允许一个或多个线程一直等待
        final CountDownLatch latch = new CountDownLatch(1000);
        //同时启动1000个线程，去进行i++计算，看看实际结果
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    VoliateTest.inc();
                    latch.countDown();
                }
            }).start();
        }
        latch.await();
        //这里每次运行的值都有可能不同,可能为1000
        System.out.println("运行结果:Counter.count=" + VoliateTest.count);
    }
}
