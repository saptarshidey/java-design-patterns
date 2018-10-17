package com.saptarshi.java.design.behavioral.observer;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		PhoneDisplay mobile = new PhoneDisplay();
		LcdDisplay tv = new LcdDisplay();

		WeatherStation station = new WeatherStation();
		station.addObserver(mobile);
		station.addObserver(tv);
		station.setData(new WeatherData("Sunny", 28, 63));

		station.removeObserver(mobile);
		station.setData(new WeatherData("Rainy", 25, 98));
	}

}
