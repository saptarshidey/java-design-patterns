package com.saptarshi.java.design.behavioral.strategy;

public class LongFlyStrategy implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("I am flying high");
	}

}
