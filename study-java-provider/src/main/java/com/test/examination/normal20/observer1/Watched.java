package com.test.examination.normal20.observer1;

import java.util.ArrayList;
import java.util.List;

/**
 *具体主题角色：在具体主题内部状态改变时，给所有登记过的观察者发出通知。具体主题角色通常用一个子类实现。
 */
public class Watched implements IWatched{

	private List<IWatcher> list=new ArrayList<IWatcher>();
	@Override
	public void addWatcher(IWatcher watcher) {
		list.add(watcher);
	}

	@Override
	public void removeWatcher(IWatcher watcher) {
		list.remove(watcher);
	}

	@Override
	public void removeAllWatcher() {
		list.clear();
	}

	@Override
	public void chageStatus() {
		System.out.println("status changed");
		for(IWatcher watcher:list){
			//通知所有的观察者，让他们自动更新
			watcher.update();
		}
	}
}
