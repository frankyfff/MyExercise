package fragenConner;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Q64 {

	public static void main(String[] args) {
		// Given code fragment:
		
		List<Integer> li = Arrays.asList(10, 20, 30);
		Function<Integer, Integer> fn = f1 -> f1 + f1;
		Consumer<Integer> conVal = s -> System.out.print("Val." + s + " ");
		li.stream().map(fn).forEach(conVal);

	}
	
	/*
	 * What is the result?
	 * 
	 * A.	Val:20 Val:40 Val:60
	 * B.	Val:10 Val:20 Val:30
	 * C.	A compilation error occurs.
	 * D.	Val: Val: Val:
	 * 
	 * 
	 * Correct Answer: A
	 */
	

}
