/**
 * 
 */
package guru.springframework.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.didemo.services.GreetingServiceImpl;

/**
 * Indicating that Constructor based DI (Dependency Injection) is best practice. <br>
 * Constructor based definitely preferred. <br>
 * External program injects the dependencies into our program. <br>
 * 
 * 
 * Created by @author IzaakVanNiekerk on @since 2017-11-27
 */
public class ConstructorInjectedControllerTest {

	private ConstructorInjectedController constructorInjectedController;

	@Before
	public void setUp() throws Exception {
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() throws Exception {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
	}

}
