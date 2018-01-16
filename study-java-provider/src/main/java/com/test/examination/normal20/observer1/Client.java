package com.test.examination.normal20.observer1;

public class Client {
	public static void main(String[] args) {
		IWatched watched = new Watched();
		
		IWatcher watcher1 = new Watcher();
		
		IWatcher watcher2 = new Watcher();
		
		IWatcher watcher3 = new Watcher();
		
		watched.addWatcher(watcher1);
		
		watched.addWatcher(watcher2);
		
		watched.addWatcher(watcher3);
		
		watched.chageStatus();
		
		System.out.println("--------------");
		
		watched.removeWatcher(watcher2);
		
		watched.chageStatus();
		
		System.out.println("---------------------");
		
		watched.removeAllWatcher();
		
		watched.chageStatus();
	}
}
