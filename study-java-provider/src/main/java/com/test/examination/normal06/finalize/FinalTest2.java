package com.test.examination.normal06.finalize;

public class FinalTest2 {
    //对于一个static修饰的final来说，必须在声明的时候赋值
    private static final int a=1;
    private String name;
    public FinalTest2(){
        //a=3;
    }
    public FinalTest2(String name){
        //a=2;
        this.name=name;
    }
    
    public static void main(String[] args){
        
    }
}
