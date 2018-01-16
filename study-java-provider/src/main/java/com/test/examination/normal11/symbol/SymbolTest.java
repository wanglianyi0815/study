package com.test.examination.normal11.symbol;

import java.util.Date;


/**
 * &和&&的区别
 */
public class SymbolTest {
    /**
     * .
     */
    public static void main(String[] args){
        int a=3;//011
        int b=5;//101
        int c=a&b;//001,位与操作，只有此位两个值都为1，此位才为1
        System.out.println(c);
        
        System.out.println("-------------");
        a=1;
        b=2;
        //存在短路运算，b=3不会执行
        if((a==2)&&((b=3)==5)){
            System.out.println("execution ... ");
        }
        System.out.println(a);
        System.out.println(b);
        
        System.out.println("-------------");
        a=1;
        b=2;
        //不存在短路运算，b=3不会执行
        if((a==2)&((b=3)==5)){
            System.out.println("execution ... ");
        }
        System.out.println(a);
        System.out.println(b);
        
        
    }
    
    
}
