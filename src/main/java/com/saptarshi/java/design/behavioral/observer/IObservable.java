package com.saptarshi.java.design.behavioral.observer;

public interface IObservable {

	public void addObserver(IObserver observer);
	public void removeObserver(IObserver observer);
	public void notifyObservers();

}
