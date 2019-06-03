package fragenConner;

import java.util.Arrays;
import java.util.List;

//Given code fragment:

public class Q49 {

	public static void main(String[] args) {
		// Given code fragment:

		List<Integer> list1 = Arrays.asList(10, 20);
		List<Integer> list2 = Arrays.asList(15, 30);
		
		// line n1
		
		/**
		 * Which code fragment, when inserted at line n1, prints 10 20 15 30?
		 * 
		 * A.	Stream.of(list1, list2).flatMap(list -> list.stream()).forEach(s -> System.out.print(s + " "));
		 * 
		 * B.	Stream.of(list1, list2).flatMap(list -> list.intStream()).forEach(s -> System.out.print(s + " "));
		 * 
		 * C.	list1.stream().flatMap(list2.stream().flatMap(e1 -> e1.stream()).forEach(s -> System.out.println(s + " "));
		 * 
		 * D.	Stream.of(list1, list2).flatMapToInt(list -> list.stream()).forEach(s -> System.out.print(s + " "));
		 * 
		 * 
		 * 
		 * Correct Answer: A
		 * 
		 */

	}

}
