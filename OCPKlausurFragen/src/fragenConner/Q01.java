package fragenConner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Q01 {

	public static void main(String[] args) throws IOException {
		Path file = Paths.get("C:/Users/mamiri/Desktop/courses.txt");

		
		
		Stream<String> fc = Files.lines(file); 
		
		
		Consumer<String> tmp = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		};
		
		fc.forEach(tmp);
		
		//fc.forEach (s -> System.out.println(s));
		
		// line n1

	}

	/*
	 * Assume the courses.txt is accessible. 
	 * 
	 * Which code fragment can be inserted at line n1 to enable the code 
	 * to print the content of the courses.txt file?
	 * 
	 * A. 	List<String> fc = Files.list(file); 
	 * 		fc.stream().forEach (s -> System.out.println(s)); 
	 * 
	 * B. 	Stream<String> fc = Files.readAllLines(file);
	 * 		fc.forEach (s -> System.out.println(s)); 
	 * 
	 * C. 	List<String> fc = readAllLines(file); 
	 * 		fc.stream().forEach (s -> System.out.println(s)); 
	 * 
	 * D.	Stream<String> fc = Files.lines(file); 
	 * 		fc.forEach (s -> System.out.println(s));
	 * 
	 * 
	 * 
	 * 
	 * Correct Answer: D
	 */

}
