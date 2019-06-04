package fragenConner;

import java.util.stream.Stream;

public class Q80 {

	public static void main(String[] args) {
		// Given code fragment:
		
		Stream.of("Java", "Unix", "Linux")
		.filter(s -> s.contains("n"))
		.peek(s -> System.out.println("PEEK: " + s)
		// line n1
		//.findAny());
		//.findFirst());
	}

	/*
	 * Which two code fragments, when inserted at line n1 independently, result in
	 * the output PEEK: Unix ? 
	 * 
	 * A. 	.anyMatch(); 
	 * B. 	.allMatch(); 
	 * C. 	.findAny(); 
	 * D.	.noneMatch(); 
	 * E. 	.findFirst(); 
	 * 
	 * 
	 * 
	 * Correct Answer: CE
	 */

}
