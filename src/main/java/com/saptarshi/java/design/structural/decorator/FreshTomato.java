package com.saptarshi.java.design.structural.decorator;

public class FreshTomato implements ToppingsDecorator {

	private IPizza pizza;

	public FreshTomato(IPizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " with " + "Fresh Tomato Topping";
	}

	@Override
	public int getCost() {
		return pizza.getCost() + 50;
	}

}
