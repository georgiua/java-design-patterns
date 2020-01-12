package com.georgiua.patterns.creational.factory;

public class ClassFactory {

	public ClassInterface getClass(String classType) {
		if(classType == null) {
			return null;
		} else if(classType.equals("ClassA")) {
			return new ClassA();
		} else if(classType.equals("ClassB")) {
			return new ClassB();
		}
		return null;
	}
}
