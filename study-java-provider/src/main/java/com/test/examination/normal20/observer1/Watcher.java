package com.test.examination.normal20.observer1;

/**
 * 具体观察者角色：该角色实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态相协调。如果需要，具体观察者角色可以保存一个指向具体主题角色的引用。通常用一个子类实现
 */
public class Watcher implements IWatcher{

	@Override
	public void update() {
		System.out.println("watcher updated");
	}
	
}
