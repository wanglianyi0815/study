package com.test.examination.normal03.jvm;

public class StaticTest {
    //第一步
    private static StaticTest st=new StaticTest();
    //第三步，没有赋值，跳过
    public static int count1;
    //第四步
    public static int count2=0;
    //第二步
    public StaticTest(){
        count1++;
        count2++;
    }
    public static StaticTest getInstance(){
        return st;
    }
    public static void main(String[] args){
        StaticTest.getInstance();
        System.out.println(StaticTest.count1);//1
        System.out.println(StaticTest.count2);//0
    }
}
