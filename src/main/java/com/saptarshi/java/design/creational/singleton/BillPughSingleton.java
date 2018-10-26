package com.saptarshi.java.design.creational.singleton;

public class BillPughSingleton implements ISingleton {

	private BillPughSingleton() {}

	private static class SingletonHelper {
		private static BillPughSingleton instance = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.instance;
	}

}
