package com.test.design.pattern.normal21;

/**
 *
 * Created by wanglianyi on 2017/1/29.
 */
public interface Subject {
    void accept(Visitor visitor);
    String getSubject();
}
