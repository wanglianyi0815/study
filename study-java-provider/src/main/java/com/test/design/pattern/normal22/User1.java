package com.test.design.pattern.normal22;

/**
 *
 * Created by wanglianyi on 2017/1/29.
 */
public class User1 extends User {
    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
