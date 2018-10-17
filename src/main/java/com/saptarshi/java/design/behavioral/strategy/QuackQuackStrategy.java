package com.saptarshi.java.design.behavioral.strategy;

public class QuackQuackStrategy implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack Quack");
	}

}
