package fragenConner;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Q32 {

	public static void main(String[] args) {
		// Given code fragment

		List<Integer> codes = Arrays.asList(10, 20);
		UnaryOperator<Double> uo = s -> s + 10.0;
		codes.replaceAll(uo);
		codes.forEach(c -> System.out.println(c));
	}
	
	/**
	 * What is the result?
	 * 
	 * A. 	20.0
	 * 		30.0
	 * 
	 * B. 	10
	 * 		20
	 * 
	 * C. A compilation error occurs.
	 * 
	 * D. A NumberFormatException is thrown at run time.
	 * 
	 * Correct Answer: C
	 * 
	 */

}
