package com.saptarshi.java.design.behavioral.strategy;

public class PondSwimStrategy implements ISwimBehavior {

	@Override
	public void swim() {
		System.out.println("I am swimming in a Cold Pond");
	}

}
