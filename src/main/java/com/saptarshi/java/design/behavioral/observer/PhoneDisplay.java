package com.saptarshi.java.design.behavioral.observer;

public class PhoneDisplay implements IDisplay, IObserver {

	private WeatherData data;

	@Override
	public void update(WeatherData data) {
		this.data = data;
		display();
	}

	@Override
	public void display() {
		System.out.println("Phone -> " + data.getSky() + ", " + data.getTemperature() + " degrees");
	}

}
