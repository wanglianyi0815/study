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
 *        另外一个县城调用了相同的对象的notify或者notifyAll方法，那么在该等待池中的等待线程就会起来进入该
 *        对象的锁池中，去等待获得该对象的锁，如果获得锁成功后，那么该线程将继续沿着wait方法之后的路径去执行。
 *     5、notify是随机找一个线程去锁池中获取锁，notifyAll是通知所有的线程去争夺锁
 *     6、Thread.sleep(long time),如果一个线程调用了sleep方法睡眠，那么在睡眠的同时，它不会失去对象的锁的
 *        拥有权。wait(long time)，在经过time后或者其他线程notify后会重新启动
 */
public class Sample {
    int number=0;
    
    public static void main(String[] args){
        Sample sample=new Sample();
        IncreaseThread in=new IncreaseThread(sample);
        DecreaseThread de=new DecreaseThread(sample);
        
        IncreaseThread in1=new IncreaseThread(sample);
        DecreaseThread de1=new DecreaseThread(sample);
        
        
        in.start();
        de.start();
        
        in1.start();
        de1.start();
    }
    
    //去掉syncnoized会报错
    public synchronized void increase(){
        if(number!=0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number++;
        System.out.println(number);
        notify();
    }
    
    public synchronized void decrease(){
        if(number==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number--;
        System.out.println(number);
        notify();
    }
}

class IncreaseThread extends Thread{
    private Sample sample;
    
    public IncreaseThread(Sample sample){
        this.sample=sample;
    }

    public void run() {
        for(int i=0;i<20;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sample.increase();
        }
    }
}

class DecreaseThread extends Thread{
    private Sample sample;
    
    public DecreaseThread(Sample sample){
        this.sample=sample;
    }

    public void run() {
        for(int i=0;i<20;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sample.decrease();
        }
    }
}