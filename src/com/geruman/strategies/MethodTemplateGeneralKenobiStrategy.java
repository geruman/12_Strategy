package com.geruman.strategies;

public class MethodTemplateGeneralKenobiStrategy extends AbstractMethodTemplateStrategy {

	@Override
	public String templateMethod(String input) {
		if("Hello there...".equalsIgnoreCase(input)) {
			return "General kenobi";
		}
		return null;
	}

}
