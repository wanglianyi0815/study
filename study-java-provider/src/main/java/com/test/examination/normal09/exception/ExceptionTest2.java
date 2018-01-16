package com.test.examination.normal09.exception;

import java.io.IOException;

public class ExceptionTest2 {
    
    public void doSomething() throws IOException{
        System.out.println("doSomething .. .");
        
    }

    public static void main(String[] args){
        ExceptionTest2 et=new ExceptionTest2();
        try{
            et.doSomething();
        }catch(Exception ex){
            
        }
        /**
         * 不可能跳到如下代码块，所以会报编译异常
         */
        //catch(IOException ex){
        //}
    }
}
