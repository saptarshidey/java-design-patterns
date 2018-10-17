package com.saptarshi.java.design.behavioral.strategy2;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {

	private List<Item> items;

	public ShoppingCart() {
		items = new ArrayList<>();
	}

	public void add(Item that) {
		items.add(that);
	}

	public void remove(Item that) {
		items.remove(that);
	}

	public void pay(IPaymentStrategy paymentMethod) {
		int amount = items.stream().mapToInt(Item::getPrice).sum();
		paymentMethod.pay(amount);
	}

}
