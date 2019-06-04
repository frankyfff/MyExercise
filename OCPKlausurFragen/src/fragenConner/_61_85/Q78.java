package fragenConner._61_85;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Given code fragment:

class Persoon {
	String name;
	int age;

	public Persoon(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

public class Q78 {

	public static void main(String[] args) {
		// and the code fragment:

		List<Persoon> sts = Arrays.asList(new Persoon("Jack", 30), new Persoon("Mike Hill", 21),
				new Persoon("Thomas Hill", 24));

		Stream<Persoon> resList = sts.stream().filter(s -> s.getAge() >= 25); // line n1
		long count = resList.filter(s -> s.getName().contains("Hill")).count();
		System.out.println(count);

	}

	/*
	 * A. 	0 
	 * B. 	A compilation error occurs at line n1. 
	 * C. 	An Exception is thrown at run time. 
	 * D. 	2 
	 * 
	 * 
	 * 
	 * Correct Answer: A
	 */

}
