/**
 * 
 */
package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author ivanniekerk
 *
 */
@Service
@Primary
@Profile("en")
public class PrimaryGreetingService implements GreetingService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see guru.springframework.didemo.services.GreetingService#sayGreeting()
	 */
	@Override
	public String sayGreeting() {
		return "Hello - Primary Greeting service";
	}

}
