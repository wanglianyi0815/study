package com.test.design.pattern.normal22;

/**
 *
 * Created by wanglianyi on 2017/1/29.
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
