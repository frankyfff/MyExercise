package fragenConner._41_60;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Given code fragment:

class TechName {
	String techName;

	TechName(String techName) {
		this.techName = techName;
	}
}

public class Q46 {

	public static void main(String[] args) {
		// and given code fragment:

		List<TechName> tech = Arrays.asList(new TechName("Java-"), new TechName("Oracle DB-"), new TechName("J2EE-"));
		Stream<TechName> stre = tech.stream();		// line n1s

	}
	
	/**
	 * Which should be inserted at line n1 to print Java-Oracle DB-J2EE-?
	 * 
	 * A. stre.forEach(System.out::print);
	 * B. stre.map(a-> a.techName).forEach(System.out::print);
	 * C. stre.map(a-> a).forEachOrdered(System.out::print);
	 * D. stre.forEachOrdered(System.out::print);
	 * 
	 * 
	 * Correct Answer: B
	 */

}
