package fragenConner;

import java.util.Set;
import java.util.TreeSet;

//Given code fragment:
class Vehicle {
	int vno;
	String name;

	public Vehicle(int vno, String name) {
		this.vno = vno;
		this.name = name;
	}

	public String toString() {
		return vno + ":" + name;
	}
}

public class Q15 {

	public static void main(String[] args) {
		// Given code fragment:
		Set<Vehicle>  vehicles = new TreeSet <> (); 
		vehicles.add(new Vehicle (10123, "Ford")); 
		vehicles.add(new Vehicle (10124, "BMW")); 
		System.out.println(vehicles);

	}
	
	/**
	 * 
	 * What is the result?
	 * 
	 * A. 10123 Ford 10124 BMW
	 * B. 10124 BMW
	 *    10123 Ford
	 * C. A compilation error occurs.
	 * D. A ClassCastExceptionis thrown at run time.
	 * 
	 * 
	 * Correct Answer: D
	 */

}
