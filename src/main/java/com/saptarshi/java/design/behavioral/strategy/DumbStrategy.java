package com.saptarshi.java.design.behavioral.strategy;

public class DumbStrategy implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("I can't quack");
	}

}
