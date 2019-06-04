package fragenConner._61_85;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Given code fragment:

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	// line n2;

}

public class Q81 {

	public static void main(String[] args) {
		// and given code fragment:

		List<Person> emps = new ArrayList<>();
		/*
		 * code that adds objects of the Person class to the emps list goes here
		 */
		Collections.sort(emps);
	}

	/*
	 * Which two modifications enable to sort the elements of the emps list? (Choose
	 * two.) 
	 * 
	 * A. 	Replace line n1 with class Person extends Comparator<Person> 
	 * 
	 * B. 	At line n2 insert 
	 * 			public int compareTo(Person p) { 
	 * 				return this.name.compareTo(p.name); 
	 * 			} 
	 * 
	 * C. 	Replace line n1 with 
	 * 			class Person implements Comparable<Person> 
	 * 
	 * D. 	At line n2 insert 
	 * 			public int compare(Person p1, Person p2){ 
	 * 				return p1.name.compareTo (p2.name); 
	 * 			} 
	 * 
	 * E. 	At line n2 insert: 
	 * 			public int compareTo(Person p, Person p2) { 
	 * 				return p1.name.compareTo (p2.name); 
	 * 			} 
	 * 
	 * F.	Replace line n1 with 
	 * 			class Person implements Comparator<Person>
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Correct Answer: BC 
	 */

}
