package com.georgiua.patterns.abstractfactory;

public class TypeBFactory extends AbstractFactory {

	public TypeB getTypeB(String className) {
		if(className == null) {
			return null;
		} else if(className.equals("ClassA")) {
			return new ClassATypeB();
		} else if(className.equals("ClassB")) {
			return new ClassBTypeB();
		}
		return null;
	}

	@Override
	public TypeA getTypeA(String className) {
		return null;
	}
}
