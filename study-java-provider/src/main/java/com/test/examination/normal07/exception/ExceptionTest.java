package com.test.examination.normal07.exception;

public class ExceptionTest {
    public static void main(String[] args){
        try{
            String s=null;
            /**
             * System.exit不去执行finally
             */
            //return;
            System.exit(0);
        }catch(Exception e){
            System.out.println("excetpion");
        }finally{
            System.out.println("finally");
        }
    }
}
