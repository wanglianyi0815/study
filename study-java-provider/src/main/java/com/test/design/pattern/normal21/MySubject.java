package com.test.design.pattern.normal21;

/**
 *
 * Created by wanglianyi on 2017/1/29.
 */
public class MySubject implements Subject {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getSubject() {
        return "love";
    }
}
