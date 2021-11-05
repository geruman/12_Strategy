package com.geruman.strategies;

public class RemoveVowelsStrategy implements SimpleStrategyInterface {

	@Override
	public String run(String input) {
		if(input==null) {
			return null;
		}
		input = input.replaceAll("a", "");
		input = input.replaceAll("e", "");
		input = input.replaceAll("i", "");
		input = input.replaceAll("o", "");
		input = input.replaceAll("u", "");
		input = input.replaceAll("A", "");
		input = input.replaceAll("E", "");
		input = input.replaceAll("I", "");
		input = input.replaceAll("O", "");
		input = input.replaceAll("U", "");
		input = input.replaceAll("á", "");
		input = input.replaceAll("é", "");
		input = input.replaceAll("í", "");
		input = input.replaceAll("ó", "");
		input = input.replaceAll("ú", "");
		input = input.replaceAll("Á", "");
		input = input.replaceAll("É", "");
		input = input.replaceAll("Í", "");
		input = input.replaceAll("Ó", "");
		input = input.replaceAll("Ú", "");
		return input;
		
	}

}
