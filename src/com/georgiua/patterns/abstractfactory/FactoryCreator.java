package com.georgiua.patterns.abstractfactory;

public class FactoryCreator {
	
	public AbstractFactory getFactory(String factoryName) {
		if(factoryName == null) {
			return null;
		} else if(factoryName.equals("TypeA")) {
			return new TypeAFactory();
		} else if(factoryName.equals("TypeB")) {
			return new TypeBFactory();
		}
		return null;
	}
}
