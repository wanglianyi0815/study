package com.test.concurrent;

/**
 * 可能会持续循环下去，因为线程可能永远看不到ready的值.
 * 可能输出的值为0,因为重排序
 * Created by wanglianyi on 2017/4/25 0025.
 */
public class NoVisibility extends Thread {
    private static boolean ready;
    private static int number;
    private static class ReaderThread extends Thread{
        public void run(){
            while (!ready){
                System.out.println("1111");
                Thread.yield();
            }
            System.out.println(number);
        }

        public static void main(String[] args){
            new ReaderThread().start();
            number = 42;
            ready=true;
        }
    }
}
