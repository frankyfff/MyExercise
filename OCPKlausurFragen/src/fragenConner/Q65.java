package fragenConner;

import java.util.Optional;

public class Q65 {

	// Given code fragment:

	public static Optional<String> getCountry(String loc) {

		Optional<String> couName = Optional.empty();
		if ("Paris".equals(loc))
			couName = Optional.of("France");
		else if ("Mumbai".equals(loc))
			couName = Optional.of("India");
		return couName;
	}

	public static void main(String[] args) {

		// and given code fragmen:

		Optional<String> city1 = getCountry("Paris");
		Optional<String> city2 = getCountry("Las Vegas");

		System.out.println(city1.orElse("Not Found"));

		if (city2.isPresent())
			city2.ifPresent(x -> System.out.println(x));
		else
			System.out.println(city2.orElse("Not Found"));

	}
	
	/*
	 * What is the result?
	 * 
	 * A.	France
	 * 		Optional[NotFound]
	 * 
	 * B.	Optional [France]
	 * 		Optional [NotFound]
	 * 
	 * C.	Optional[France] Not Found
	 * 
	 * D.	France
	 * 		Not Found
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Correct Answer: D
	 */

}
