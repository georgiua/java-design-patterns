package com.georgiua.patterns.abstractfactory;

public abstract class AbstractFactory {
	public abstract TypeA getTypeA(String className);
	public abstract TypeB getTypeB(String className);
}
