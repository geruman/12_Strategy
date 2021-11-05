package com.geruman.strategies;

public class PingPongStrategy implements SimpleStrategyInterface{

	@Override
	public String run(String input) {
		if("Ping".equalsIgnoreCase(input)) {
			return "Pong";
		}
		if("Pong".equalsIgnoreCase(input)) {
			return "Ping";
		}
		return null;
	}

}
