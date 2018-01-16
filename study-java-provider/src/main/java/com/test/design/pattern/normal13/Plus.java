package com.test.design.pattern.normal13;

/**
 * Created by wanglianyi on 2017/1/29.
 */
public class Plus extends AbstractCalculator implements ICalculator{
    public int calculate(String exp){
        int arrayInt[]=split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}
