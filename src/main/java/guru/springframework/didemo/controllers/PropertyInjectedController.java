/**
 * 
 */
package guru.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.didemo.services.GreetingService;

/**
 * This is an example of bad manual dependency injection. <br>
 * And not the way to do it. Just as example of how it would have been done 'manually'. <br>
 * 
 * Created by @author IzaakVanNiekerk
 *
 */
@Controller
public class PropertyInjectedController {

	@Autowired
	@Qualifier("greetingServiceImpl")
	public GreetingService greetingService;

	/**
	 * Because I changed the property name to the bean name, Spring was also able to convert <br>
	 * this instance to the correct bean. <br>
	 * Pretty nifty from Spring! <br>
	 * 
	 * So either this, or declare the correct bean / class name (as seen above in commented code). <br>
	 * But PROBABLY better to use the class name rather than the property name!
	 */
//	@Autowired
//	public GreetingService greetingServiceImpl;

	public String sayHello() {
		return greetingService.sayGreeting();
	}
	

}
