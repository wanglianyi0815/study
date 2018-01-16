package com.test.examination.normal14.polymorphism;

import java.util.Random;

/**
 * 1、多态:父类或者接口类型的引用指向子类或者实现该接口类的对象
 * 2、多态就是一个运行时的行为，不是一个编译时的行为
 * 3、很多书中写java中通过方法重写与方法重载来实现多态？？？
 *    这种说法是错误的,重载根据参数的类型就可以在编译的时候知道调用哪个方法,方法重载不是面向对象的特征。
 */
public class PoliTest {
    
    public static Parent generate(){
        Random random=new Random();
        int num = random.nextInt(3);
        switch(num){
        case 0:
            return new Child();
        case 1:
            return new Child3();
        case 2:
            return new Child4();
        }
        return null;
    }
    public static void main(String[] args){
        Parent p=new Child();
        p.doSomething();
        
        System.out.println("------------");
        Parent2 p2=new Child2();
        p2.doSomething();
        
        System.out.println("------多态是运行时行为------");
        //编译时不能知道p3的返回对象
        Parent p3=generate();
        p3.doSomething();
    }
}

class Parent{
    public void doSomething(){
        System.out.println("parent");
    }
}

class Child extends Parent{
    public void doSomething(){
        System.out.println("child");
    }
}

class Child3 extends Parent{
    public void doSomething(){
        System.out.println("child3");
    }
}

class Child4 extends Parent{
    public void doSomething(){
        System.out.println("child4");
    }
}

interface Parent2{
    void doSomething();
}

class Child2 implements Parent2{
    public void doSomething(){
        System.out.println("dosomething ... ...");
    }
}
