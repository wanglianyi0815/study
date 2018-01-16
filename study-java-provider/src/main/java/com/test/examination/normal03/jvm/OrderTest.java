package com.test.examination.normal03.jvm;

public class OrderTest {
   public static void main(String[] args){
       new Child();
   }
}

class Partent{
    static{
        System.out.println("partent static block");
    }
    public Partent(){
        System.out.println("partent construter block");
    }
}

class Child extends Partent{
    static{
        System.out.println("child static block");
    }
    /**
     * 子类第一行不写父类方法，默认调用super();
     */
    public Child(){
        System.out.println("child construter block");
    }
}