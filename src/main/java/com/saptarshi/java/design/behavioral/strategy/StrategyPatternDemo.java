package com.saptarshi.java.design.behavioral.strategy;

import java.util.Arrays;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		Duck[] ducks = {
			new Duck(new QuackQuackStrategy(), new PondSwimStrategy(), new LongFlyStrategy()),		// wild duck
			new Duck(new QuackQuackStrategy(), new PondSwimStrategy(), new ShortFlyStrategy()),		// city duck
			new Duck(new DumbStrategy(), new TubSwimStrategy(), new CantFlyStrategy())				// rubber duck
		}; 

		Arrays.stream(ducks).forEach(
			duck -> {
				duck.quack();
				duck.swim();
				duck.fly();
			}
		);
	}

}
