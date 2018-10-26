package com.saptarshi.java.design.structural.decorator;

public class ChickenFiesta implements IPizza {

	@Override
	public String getDescription() {
		return "Chicken Fiesta Pizza";
	}

	@Override
	public int getCost() {
		return 450;
	}

}
