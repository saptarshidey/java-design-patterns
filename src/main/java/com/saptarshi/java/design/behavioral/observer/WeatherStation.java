package com.saptarshi.java.design.behavioral.observer;

import java.util.List;
import java.util.ArrayList;

public class WeatherStation implements IObservable {

	private WeatherData data;
	private List<IObserver> observers;

	public WeatherStation() {
		observers = new ArrayList<>();
	}

	public WeatherData getData() {
		return data;
	}

	public void setData(WeatherData data) {
		this.data = data;
		notifyObservers();
	}

	@Override
	public void addObserver(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		observers.forEach(observer -> observer.update(data));
	}

}
