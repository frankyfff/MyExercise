package fragenConner;

import java.util.Arrays;
import java.util.List;

public class Q21 {

	public static void main(String[] args) {
		// Given the code fragment:
		List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
		System.out.println(

		// line n1

		);

	}
	
	/**
	 * 
	 * Which code fragment, when inserted at line n1, 
	 * enables the code to print the count of string elements whose length is greater than three?
	 * 
	 * A. listVal.stream().filter(x -> x.length()>3).count()
	 * B. listVal.stream().map(x -> x.length()>3).count()
	 * C. listVal.stream().peek(x -> x.length()>3).count().get()
	 * D. listVal.stream().filter(x -> x.length()>3).mapToInt(x -> x).count()
	 * 
	 * 
	 * Correct Answer: A
	 */

}
