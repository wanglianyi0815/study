package com.test.design.pattern.normal21;

/**
 *
 * Created by wanglianyi on 2017/1/29.
 */
public class MyVisitor implements Visitor {

    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}
