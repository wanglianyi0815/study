package com.test.examination.normal16.thread;

/**
 * 生成者消费者问题(改进在sample2)
 * 题目:请编写一个多线程程序，实现两个县城，其中一个县城完成对某个对象的int成员变量的增加操作，即每次加1，
 *      另一个线程完成对该对象的成员变量的减操作，即每次减1,同时要保证该变量的值不会小于0，不会大于1，该
 *      变量的初始值为0.
 *      01010101
 * 关于wait，notify，notifyAll,以及sleep方法之间的关系（重点）
 *     1、如果一个线程调用了某个对象的wait方法，那么该线程首先必须要拥有该对象的锁（去掉syncnoized会报错）
 *     2、如果一个线程调用了某个对象的wait方法，那么该线程就会释放该对象的锁
 *     3、在java对象中，由两种池，一种是锁池，一种是等待池。
 *     4、如果一个线程调用了某个对象的wait方法，那么该线程进入该对象的等待池中（释放锁），如果未来某一时刻，
 *        另外一个线程调用了相同的对象的notify或者notifyAll方法，那么在该等待池中的等待线
 */

public class Sample2 {
    int number=0;
    
    public static void main(String[] args){
        Sample2 Sample2=new Sample2();
        IncreaseThread2 in=new IncreaseThread2(Sample2);
        in.setName("增加线程1");
        DecreaseThread2 de=new DecreaseThread2(Sample2);
        de.setName("减少线程1");
        IncreaseThread2 in1=new IncreaseThread2(Sample2);
        in1.setName("增加线程2");
        DecreaseThread2 de1=new DecreaseThread2(Sample2);
        de1.setName("减少线程2");

        in.start();
        de.start();
        
        in1.start();
        de1.start();
    }
    
    public synchronized void increase(int i){
        while(number!=0){
            try {
                System.out.println("["+Thread.currentThread().getName()+"]i="+i+"进入等待状态");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number++;
        System.out.println("["+Thread.currentThread().getName()+"]i="+i+",number="+number);
        //notify(),可能会通知本线程继续获得锁
        notifyAll();
    }
    
    public synchronized void decrease(int i){
        while(number==0){
            try {
                System.out.println("["+Thread.currentThread().getName()+"]i="+i+"进入等待状态");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number--;
        System.out.println("["+Thread.currentThread().getName()+"]i="+i+",number="+number);
        notifyAll();
    }
}



class IncreaseThread2 extends Thread{
    private Sample2 Sample2;
    
    public IncreaseThread2(Sample2 Sample2){
        this.Sample2=Sample2;
    }

    public void run() {
        for(int i=0;i<20;i++){
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            Sample2.increase(i);
        }
    }
}

class DecreaseThread2 extends Thread{
    private Sample2 Sample2;
    
    public DecreaseThread2(Sample2 Sample2){
        this.Sample2=Sample2;
    }

    public void run() {
        for(int i=0;i<20;i++){
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            Sample2.decrease(i);
        }
    }
}