package com.saptarshi.java.design.behavioral.strategy;

public class TubSwimStrategy implements ISwimBehavior {

	@Override
	public void swim() {
		System.out.println("I am swimming in a Hot Tub");
	}

}
