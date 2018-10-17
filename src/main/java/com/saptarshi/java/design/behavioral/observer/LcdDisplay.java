package com.saptarshi.java.design.behavioral.observer;

public class LcdDisplay implements IDisplay, IObserver {

	private WeatherData data;

	@Override
	public void update(WeatherData data) {
		this.data = data;
		display();
	}

	@Override
	public void display() {
		System.out.println("LCD -> " + data.getSky() + ", " + data.getTemperature() + " degrees, " + data.getHumidity() + "% humidity");
	}

}
