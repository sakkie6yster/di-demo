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
public class GetterInjectedController {

	private GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting() + " (from GetterInjectedController)";
	}

	/**
	 * Could use @Autowired ONLY when there was only one class implementing GreetingService. <br>
	 * But because there are several, we need to specify which one, by using the @Qualifier annotation. <br>
	 * Can also use '@Qualifier("getterGreetingService")' as part of the argument declaration. <br>
	 * 
	 * @param greetingService
	 */
	@Autowired
	@Qualifier("getterGreetingService")
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

}
