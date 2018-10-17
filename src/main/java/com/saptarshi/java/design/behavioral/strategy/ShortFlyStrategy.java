package com.saptarshi.java.design.behavioral.strategy;

public class ShortFlyStrategy implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("I am flying low");
	}

}
