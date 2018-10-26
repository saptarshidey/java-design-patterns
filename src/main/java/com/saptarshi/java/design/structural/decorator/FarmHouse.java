package com.saptarshi.java.design.structural.decorator;

public class FarmHouse implements IPizza {

	@Override
	public String getDescription() {
		return "Farm House Pizza";
	}

	@Override
	public int getCost() {
		return 200;
	}

}
