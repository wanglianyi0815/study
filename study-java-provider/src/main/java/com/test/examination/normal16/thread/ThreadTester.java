package com.test.examination.normal16.thread;

/**
 * world是立刻就输出出来还是等到hello后输出出来？
 * 关于synchronized关键字的作用
 * 1、在某个对象的所有synchronized方法中，在某一时刻，只能有一个唯一的线程去访问这些synchronized方法
 * 2、如果一个方法是synchronized方法，那么该synchronizd关键字表示给当前对象上锁（即this）,
 *    和synchronized(this)一样，见ThreadTester2
 * 3、如果一个synchronized的方法是静态的（static的），那么该synchronized关键字表示给当前对象所以对应的
 *    Class对象上锁。（每个类，不管生成多少对象，其对应的Class对象只有一个）
 * 4、
 */
public class ThreadTester {
    public static void main(String[] args){
        C c=new C();
        Thread t1=new T1(c);
        Thread t2=new T2(c);
        
        t1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}


class C{
    public synchronized void hello(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }
    
    public synchronized void world(){
        System.out.println("world");
    }
}

class T1 extends Thread{
    private C c;
    public T1(C c){
        this.c=c;
    }
    
    public void run(){
        c.hello();
    }
}

class T2 extends Thread{
    private C c;
    public T2(C c){
        this.c=c;
    }
    
    public void run(){
        c.world();
    }
}
