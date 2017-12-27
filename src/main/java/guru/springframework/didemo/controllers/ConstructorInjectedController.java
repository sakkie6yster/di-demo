/**
 * 
 */
package guru.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.didemo.services.GreetingService;

/**
 * @author ivanniekerk
 *
 */
@Controller
public class ConstructorInjectedController {

	private GreetingService greetingService;

	/**
	 * Don't need to annotate a constructor based dependency injection with @Autowired, but we do it for reading purposes. <br>
	 * Was using @Autowired only when there was only one implementation class for GreetingService interface. <br>
	 * But need to use @Qualifier as well, when there are multiple classes implementing that interface GreetingService. <br>
	 * 
	 * @param greetingService
	 */
	@Autowired
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting() + " (from ConstructorInjectedController)";
	}

	// Next class: Dependency Injection using Spring Framework!! :)

}
