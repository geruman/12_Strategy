package com.geruman.strategies;

public abstract class AbstractMethodTemplateStrategy implements SimpleStrategyInterface{

	@Override
	public final String run(String input) {
		if(input == null)
			return null;
		return templateMethod(input);
	}
	public abstract String templateMethod(String input);

}
