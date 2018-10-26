package com.saptarshi.java.design.creational.singleton;

public class LazyInitializationSingleton implements ISingleton {

	private static LazyInitializationSingleton instance;

	private LazyInitializationSingleton() {}

	public static LazyInitializationSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializationSingleton();
		}

		return instance;
	}

}
