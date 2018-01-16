package com.test.design.pattern.normal22;

/**
 *
 * Created by wanglianyi on 2017/1/29.
 */
public abstract class User {
    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
