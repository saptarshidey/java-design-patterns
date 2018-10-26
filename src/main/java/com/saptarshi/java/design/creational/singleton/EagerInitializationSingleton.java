package com.saptarshi.java.design.creational.singleton;

public class EagerInitializationSingleton implements ISingleton {

	private static EagerInitializationSingleton instance = new EagerInitializationSingleton();

	private EagerInitializationSingleton() {}

	public static EagerInitializationSingleton getInstance() {
		return instance;
	}

}
