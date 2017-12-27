/**
 * 
 */
package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * This is an example of bad manual dependency injection. <br>
 * And not the way to do it. Just as example of how it would have been done 'manually'. <br>
 * 
 * @Service is a service but not implementing the component. <br>
 * 
 *          Created by @author IzaakVanNiekerk
 *
 */
@Service
public class GreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURUS = "Hello Gurus!!!! - Original";

	@Override
	public String sayGreeting() {
		return HELLO_GURUS;
	}

}
