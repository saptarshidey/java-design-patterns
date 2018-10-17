package com.saptarshi.java.design.behavioral.strategy;

public class CantFlyStrategy implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}
