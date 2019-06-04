package fragenConner._61_85;

import java.util.Arrays;
import java.util.List;

public class Q62 {

	public static void main(String[] args) {
		// Given code fragment:
		
		List<String> cs = Arrays.asList("Java", "Java EE", "Java ME");
		// line n1
		System.out.println(b);

	}
	
	/*
	 * Which code fragment, when inserted at line n1, ensures false is printed?
	 * 
	 * A.	boolean b = cs.stream().findAny().get().equals("Java");
	 * B.	boolean b = cs.stream().anyMatch (w -> w.equals ("Java"));
	 * C.	boolean b = cs.stream().findFirst() .get() .equals("Java");
	 * D.	boolean b = cs.stream().allMatch(w -> w.equals("Java"));
	 * 
	 * 
	 * 
	 * Correct Answer: D
	 */

}
