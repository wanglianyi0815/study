package com.test.concurrent;

/**
 *  现在有T1、T2、T3三个线程，你怎样保证T2在T1执行完后执行，T3在T2执行完后执行？
 * Created by wanglianyi on 2017/12/25 0025.
 */
public class TestJoin {
    public static void main(String[] args) throws InterruptedException{
        T1 t1=new T1();
        T2 t2=new T2();
        T3 t3=new T3();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}

class T1 extends Thread{
    public void run(){
        System.out.println("T1");
    }
}

class T2 extends Thread{
    public void run(){
        System.out.println("T2");
    }
}


class T3 extends Thread{
    public void run(){
        System.out.println("T3");
    }
}
