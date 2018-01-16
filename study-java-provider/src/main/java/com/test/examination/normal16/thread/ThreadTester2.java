package com.test.examination.normal16.thread;

public class ThreadTester2 {
    public static void main(String[] args){
        CC c=new CC();
        Thread t1=new TT1(c);
        Thread t2=new TT2(c);
        
        t1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}

class CC{
    public void hello(){
        synchronized(this){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("hello");
    }
    
    public  void world(){
        synchronized(this){
            System.out.println("world");
        }
    }
}

class TT1 extends Thread{
    private CC c;
    public TT1(CC c){
        this.c=c;
    }
    
    public void run(){
        c.hello();
    }
}

class TT2 extends Thread{
    private CC c;
    public TT2(CC c){
        this.c=c;
    }
    
    public void run(){
        c.world();
    }
}