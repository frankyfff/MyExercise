package fragenConner._61_85;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q69 {
	
	public static void main(String[] args) {
		// Given code fragment

		Stream<List<String>> strs = Stream.of(

				Arrays.asList("text1", "text2"), Arrays.asList("text2", "text2"));

		Stream<String> bs2 = strs.filter(b -> b.contains("text1")).flatMap(rs -> rs.stream());
		bs2.forEach(b -> System.out.print(b));

	}
	
	/*
	 * What is the result?
	 * 
	 * 
	 * A.	text1text2
	 * B.	text1text2text2text3
	 * C.	text1
	 * D.	[text1, text2]
	 * 
	 * 
	 * Correct Answer: A
	 */
}
