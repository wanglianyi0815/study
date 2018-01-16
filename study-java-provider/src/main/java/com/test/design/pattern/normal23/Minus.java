package com.test.design.pattern.normal23;

/**
 *
 * Created by wanglianyi on 2017/1/29.
 */
public class Minus implements Expression{
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}
