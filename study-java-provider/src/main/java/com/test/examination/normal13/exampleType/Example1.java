package com.test.examination.normal13.exampleType;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 关于范型的继承
 * ArrayList<Object> 实现了 List<Object>
 * ArrayList<String> 没有继承List<Object>
 * List<?>永远等价于List<? extends Object>
 */

public class Example1 {
    public void method1(List<Object> list){
        
    }
    
    public void method2(){
        method1(new ArrayList<Object>());
        //此行代码不能编译通过
        //method1(new ArrayList<String>());
        //此行代码不能编译通过
        //method1(new LinkedList<Integer>());
    }
    
    public void method3(List<? extends Object> list){
        
    }
    
    public void method4(){
        method3(new ArrayList<Object>());
        //此处可以编译通过
        method3(new ArrayList<String>());
        method3(new LinkedList<Integer>());
        method3(new LinkedList<String>());
    }
    
    public void method5(List<?> list){
        
    }
    
    public void method6(){
        method5(new ArrayList<Object>());
        //此处可以编译通过
        method5(new ArrayList<String>());
        method5(new LinkedList<Integer>());
        method5(new LinkedList<String>());
    }
}
