package com.saptarshi.java.design.behavioral.strategy2;

public class Paypal implements IPaymentStrategy {

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal");
	}

}
