package com.test.design.pattern.normal22;

/**
 *
 * Created by wanglianyi on 2017/1/29.
 */
public class User2 extends User{
    public User2(Mediator mediator){
        super(mediator);
    }

    public void work() {
        System.out.println("user2 exe!");
    }
}
