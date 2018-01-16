package com.test.examination.normal09.exception;

import java.io.IOException;

public class ExceptionTest {
    /**
     * ArithmeticException继承RuntimeException,不需要捕获和抛出异常
     */
    public void doSomething() throws NullPointerException{
        System.out.println("doSomething...");
    }
    
    public void doSomething2() throws IOException{
        System.out.println("doSomething...");
    }
    
    /**
     * java 中异常分为两类
     * 1、checked exception：解决方法：
     *    (1)继续抛出，消极做法，直到抛到jvm
     *    (2)try... catch...
     * 2、unchecked exception(也叫runtime exception):
     */
    public static void main(String[] args){
        ExceptionTest et=new ExceptionTest();
        et.doSomething();
        //et.doSomething2();
    }
}
