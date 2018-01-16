package com.test.examination.normal12.innerClass;

import java.util.Date;

/**
 * 内部类(4种)：
 *    1、静态内部类（static inner class）
 *    2、成员内部类（member inner class）
 *    3、局部内部类（local inner class）
 *    4、匿名内部类（anonymous inner class）
 * 关于匿名内部类：该类一定是继承了某个父类或者实现了某个接口
 */

public class AnonTest1 {
    
    public static void main(String[] args){
        System.out.println("-------------");
        AnonTest1 st=new AnonTest1();
        //new Date(){}--匿名内部类,可以编译通过
        String result=st.get(new Date(){
            //可以打开注释来试
            /*public String toLocaleString(){
                return "hello";
            }*/
        });
        System.out.println(result);
    }
    
    @SuppressWarnings("deprecation")
    public String get(Date date){
        return date.toLocaleString();
    }
}
