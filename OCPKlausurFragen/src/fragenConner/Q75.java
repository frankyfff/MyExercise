package fragenConner;

import java.util.Arrays;
import java.util.List;

public class Q75 {

	public static void main(String[] args) {
		// Given code fragment:

		List<String> nums = Arrays.asList("EE", "SE");

		String ans = nums.parallelStream().reduce("Java ", (a, b) -> a.concat(b));
		System.out.println(ans);

	}

	/*
	 * What is the result? 
	 * 
	 * 
	 * A. 	Java EEJava EESE 
	 * B. 	Java EESE 
	 * C. 	The program prints either: Java EEJava SE or Java SEJava EE 
	 * D. 	Java EEJava SE 
	 * 
	 * 
	 * 
	 * 
	 * Correct Answer: D
	 */

}
