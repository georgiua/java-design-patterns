package com.georgiua.patterns.abstractfactory;

public class TypeAFactory extends AbstractFactory {

	public TypeA getTypeA(String className) {
		if(className == null) {
			return null;
		} else if(className.equals("ClassA")) {
			return new ClassATypeA();
		} else if(className.equals("ClassB")) {
			return new ClassBTypeA();
		}
		return null;
	}

	@Override
	public TypeB getTypeB(String className) {
		return null;
	}
}
