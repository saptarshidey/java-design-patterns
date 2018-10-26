package com.saptarshi.java.design.structural.decorator;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		IPizza pizza = new FreshTomato(new CheezeBurst(new ChickenFiesta()));
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());
	}

}
