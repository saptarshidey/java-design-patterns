package com.saptarshi.java.design.behavioral.strategy;

public class Duck {

	private IQuackBehavior quackBehavior;
	private ISwimBehavior swimBehavior;
	private IFlyBehavior flyBehavior;

	public Duck(IQuackBehavior qb, ISwimBehavior sb, IFlyBehavior fb) {
		quackBehavior = qb;
		swimBehavior = sb;
		flyBehavior = fb;
	}

	public void quack() {
		quackBehavior.quack();
	}

	public void swim() {
		swimBehavior.swim();
	}

	public void fly() {
		flyBehavior.fly();
	}

}
