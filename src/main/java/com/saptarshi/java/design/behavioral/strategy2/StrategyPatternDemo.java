package com.saptarshi.java.design.behavioral.strategy2;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		Customer handsomeBoy = new Customer("Jack");
		handsomeBoy.getCart().add(new Item("Fruits", 100));
		handsomeBoy.getCart().add(new Item("Vegetables", 200));
		handsomeBoy.getCart().pay(new CreditCard());	// Pay using Credit Card

		Customer cuteGirl = new Customer("Jill");
		cuteGirl.getCart().add(new Item("Personal Care", 250));
		cuteGirl.getCart().add(new Item("Chocolates", 100));
		cuteGirl.getCart().pay(new Paypal());	// Pay using Paypal
	}

}
