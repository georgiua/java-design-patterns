package com.georgiua.patterns.creational.singleton;

public class SingletonLazy {
	
	private static SingletonLazy instance = null;
	
	private SingletonLazy() {
		
	}
	
	public SingletonLazy instance() {
		if(instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}

}