package com.test.examination.normal06.finalize;

public class FinalTest1 {
    //如果有多个构造方法，就要保证每一个构造方法对该final类型的数据进行初始化
    private final int a;
    private String name;
    public FinalTest1(){
        a=3;
    }
    /**
     * 对于final类型的成员变量的初始化方式
     * 1、生命变量时直接赋值
     * 2、在构造方法中完成赋值
     */
    public FinalTest1(String name){
        //如果去掉此行代码，则不能编译通过
        a=2;
        this.name=name;
    }
    
    public static void main(String[] args){
        
    }
}
