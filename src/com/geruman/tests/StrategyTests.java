package com.geruman.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.geruman.strategies.Context;
import com.geruman.strategies.EchoStrategy;
import com.geruman.strategies.MethodTemplateEchoStrategy;
import com.geruman.strategies.MethodTemplateGeneralKenobiStrategy;
import com.geruman.strategies.PingPongStrategy;
import com.geruman.strategies.RemoveVowelsStrategy;

class StrategyTests {

	@Test
	void testEchoStrategy() {
		EchoStrategy echo = new EchoStrategy();
		assertEquals("Echo",echo.run("Echo"));
		assertEquals(null,echo.run(null));
	}
	@Test 
	void testPingPongStrategy() {
		PingPongStrategy pingPong = new PingPongStrategy();
		assertEquals("Pong",pingPong.run("Ping"));
		assertEquals("Ping",pingPong.run("Pong"));
		assertEquals(null, pingPong.run(null));
	}
	@Test
	void testRemoveVowelsStrategy() {
		RemoveVowelsStrategy removeVowels = new RemoveVowelsStrategy();
		assertEquals("hll",removeVowels.run("hello"));
		assertEquals("kpw",removeVowels.run("kpw"));
		assertEquals(null,removeVowels.run(null));
	}
	@Test
	void testMethodTemplateStrategyOne() {
		MethodTemplateEchoStrategy methodTemplate = new MethodTemplateEchoStrategy();
		assertEquals("This is part of the method template strategies", methodTemplate.run("This is part of the method template strategies"));
		assertEquals(null,methodTemplate.run(null));
	}
	@Test 
	void testMethodTemplateStrategyTwo() {
		MethodTemplateGeneralKenobiStrategy methodTemplate = new MethodTemplateGeneralKenobiStrategy();
		assertEquals(null,methodTemplate.run("Some random text"));
		assertEquals("General kenobi",methodTemplate.run("Hello there..."));
	}
	@Test 
	void testStrategiesInContext() {
		Context context = new Context(new RemoveVowelsStrategy());
		assertEquals("prt",context.executeStrategy("poroto"));
		context = new Context(new EchoStrategy());
		assertEquals("Echooo",context.executeStrategy("Echooo"));
		context = new Context(new PingPongStrategy());
		assertEquals("Ping",context.executeStrategy("pong"));
		context = new Context(new MethodTemplateEchoStrategy());
		assertEquals("Also Echo",context.executeStrategy("Also Echo"));
		context = new Context(new MethodTemplateGeneralKenobiStrategy());
		assertEquals("General kenobi",context.executeStrategy("Hello there..."));
		assertEquals(null,context.executeStrategy("This is no greet"));
		
		
	}
}
