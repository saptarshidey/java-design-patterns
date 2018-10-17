package com.saptarshi.java.design.behavioral.observer;

public class WeatherData {

	private String sky;
	private int temperature;
	private int humidity;

	public WeatherData(String sky, int temperature, int humidity) {
		this.sky = sky;
		this.temperature = temperature;
		this.humidity = humidity;
	}

	public String getSky() {
		return sky;
	}

	public void setSky(String sky) {
		this.sky = sky;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

}
