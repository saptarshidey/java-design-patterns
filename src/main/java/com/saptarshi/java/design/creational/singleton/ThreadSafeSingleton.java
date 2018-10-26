package com.saptarshi.java.design.creational.singleton;

public class ThreadSafeSingleton implements ISingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}

		return instance;
	}

	public static ThreadSafeSingleton getInstanceUsingDoubleCheckedLocking() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}

		return instance;
	}

}
