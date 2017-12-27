/**
 * 
 */
package guru.springframework.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.didemo.services.GreetingServiceImpl;

/**
 * @author ivanniekerk
 *
 */
public class GetterInjectedControllerTest {

	private GetterInjectedController getterInjectedController;

	@Before
	public void setUp() throws Exception {
		this.getterInjectedController = new GetterInjectedController();
		this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() throws Exception {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
	}

}
