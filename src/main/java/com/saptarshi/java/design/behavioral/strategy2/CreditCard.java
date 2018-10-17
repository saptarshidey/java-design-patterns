package com.saptarshi.java.design.behavioral.strategy2;

public class CreditCard implements IPaymentStrategy {

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Credit card");
	}

}
