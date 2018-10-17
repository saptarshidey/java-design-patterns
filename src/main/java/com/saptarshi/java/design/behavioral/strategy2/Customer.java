package com.saptarshi.java.design.behavioral.strategy2;

public class Customer {

	private String name;
	private ShoppingCart cart;

	public Customer(String name) {
		this.name = name;
		cart = new ShoppingCart();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ShoppingCart getCart() {
		return cart;
	}

}
