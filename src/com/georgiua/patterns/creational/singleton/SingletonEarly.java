package com.georgiua.patterns.creational.singleton;

public class SingletonEarly {
	
	// early instantiation
	private static SingletonEarly instance = new SingletonEarly();
	
	private SingletonEarly() {
		
	}
	
	public SingletonEarly instance() {
		return instance;
	}

}
