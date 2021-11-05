package com.geruman;

import com.geruman.strategies.Context;
import com.geruman.strategies.EchoStrategy;
import com.geruman.strategies.MethodTemplateEchoStrategy;
import com.geruman.strategies.MethodTemplateGeneralKenobiStrategy;
import com.geruman.strategies.PingPongStrategy;
import com.geruman.strategies.RemoveVowelsStrategy;

public class StrategiesDemoMain {

	public static void main(String[] args) {
		log("Esta estrategia devuelve un echo del string recibido");
		Context context = new Context(new EchoStrategy());
		logResult(context,"Esto es un echo");
		log("Esta devuelve ping cuando recibe pong y pong cuando recibe ping");
		context = new Context(new PingPongStrategy());
		logResult(context,"ping");
		logResult(context,"Pong");
		log("Esta estrategia quita las vocales");
		context = new Context(new RemoveVowelsStrategy());
		logResult(context, "murcielago");
		log("Esta es una implementación de una estrategia con 'template method'");
		context = new Context(new MethodTemplateEchoStrategy());
		logResult(context,"Echooo2");
		log("Esta es una implementacion con template metod que devuelve 'General kenobi' contra un string que diga 'hello there...'");
		context = new Context(new MethodTemplateGeneralKenobiStrategy());
		logResult(context,"Hello there...");
		
		
	}
	private static void logResult(Context context, String string) {
		System.out.println(context.executeStrategy(string));
	}
	private static void log(String string) {
		System.out.println(string);
	}
}
