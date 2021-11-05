package com.geruman.strategies;

public class EchoStrategy implements SimpleStrategyInterface{

	@Override
	public String run(String input) {
		return input;
	}
	

}
