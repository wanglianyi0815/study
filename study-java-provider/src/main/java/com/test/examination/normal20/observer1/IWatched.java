package com.test.examination.normal20.observer1;

/**
 * 观察这模式:观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态上发生变化时，会通知所有观察者对象，让他们能够自动更新自己
 * 观察者模式的组成：抽象主题角色，抽象观察这角色
 * 抽象主题角色：把所有对观察者对象的引用保存在一个集合中，每个主题角色都可以有任意数量的观察者.抽象主题提供一个借口，可以增加和删除观察者角色。一般用一个抽象类或接口来实现.
 */
public interface IWatched {
	public void addWatcher(IWatcher watcher);
	public void removeWatcher(IWatcher watcher);
	public void removeAllWatcher();
	public void chageStatus();
}
