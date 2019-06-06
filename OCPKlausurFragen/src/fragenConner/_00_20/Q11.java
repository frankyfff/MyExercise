package fragenConner._00_20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

//Given code fragments:

class Student {

	String course, name, city;

	public Student(String name, String course, String city) {
		this.course = course;
		this.name = name;
		this.city = city;
	}

	public String toString() {
		return course + ":" + name + ":" + city;
	}
}

public class Q11 {

	public static void main(String[] args) {
		// and the code fragment:
		
		List<Student> stds = Arrays.asList(     
				new Student ("Jessy", "Java ME", "Chicago"),     
				new Student ("Helen", "Java EE", "Houston"),     
				new Student ("Mark", "Java ME", "Chicago")); 
		
		stds.stream()
			.collect(Collector.groupingBy(Student::getCourse))
			.forEach((src, res) -> System.out.println(scr));

	}
	
	/**
	 * 
	 * What is the result?
	 * 
	 * A.[Java EE: Helen:Houston]
	 *   [Java ME: Jessy:Chicago, Java ME: Mark:Chicago]
	 * 
	 * B.Java EE
	 * 	 Java ME
	 * 
	 * C.[Java ME: Jessy:Chicago, Java ME: Mark:Chicago]
	 *   [Java EE: Helen:Houston]
	 *   
	 * D. A compilation error occurs.
	 * 
	 * 
	 * Correct Answer: B
	 * 
	 * 
	 */

}
