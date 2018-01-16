package com.test.design.pattern.normal18;

/**
 *
 * Created by wanglianyi on 2017/1/29.
 */
public class MyCommand implements Command {
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void exe() {
        receiver.action();
    }
}
