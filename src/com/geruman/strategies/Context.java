package com.geruman.strategies;

public class Context {
	private SimpleStrategyInterface strategy;
	public Context(SimpleStrategyInterface simpleStrategy) {
		strategy = simpleStrategy;
	}
	public String executeStrategy(String string) {
		return strategy.run(string);
	}
}
