/**
 * 
 */
package guru.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.didemo.services.GreetingService;

/**
 * Because of @Controller annotation, Spring will detect this class as a Spring Bean <br>
 * and will wire it into Spring context. <br>
 *
 * Created by @author IzaakVanNiekerk @since 27 November 2017.
 */
@Controller
public class MyController {

	private GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String hello() {
		System.out.println("Hello !!!");
		
		return greetingService.sayGreeting();
	}
}
