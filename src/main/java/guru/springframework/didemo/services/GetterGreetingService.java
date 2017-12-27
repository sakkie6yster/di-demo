/**
 * 
 */
package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * @author ivanniekerk
 *
 */
@Service
public class GetterGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello - I am injected by the getter";
	}

}
