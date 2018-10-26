package com.saptarshi.java.design.structural.decorator;

public class CheezeBurst implements ToppingsDecorator {

	private IPizza pizza;

	public CheezeBurst(IPizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " with " + "Cheeze Burst Topping";
	}

	@Override
	public int getCost() {
		return pizza.getCost() + 100;
	}

}
