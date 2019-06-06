package fragenConner._00_20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given code fragments:

class Emp {
	String fName;
	String lName;

	public Emp(String fn, String ln) {
		fName = fn;
		lName = ln;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}
}

public class Q13 {

	public static void main(String[] args) {
		// and the code fragment:
		
		List<Emp> emp = Arrays.asList (     
				new Emp("John", "Smith"),     
				new Emp("Peter", "Sam"),     
				new Emp("Thomas", "Wale")); 
		emp.stream()
		
			//line n1
		.sorted(Comparator.comparing(Emp::getfName).reserved().thenComparing(Emp::getlName))
		//.sorted(Comparator.comparing(Emp::getfName).thenComparing(Emp::getlName))
		//.map(Emp::getfName).sorted(Comparator.reserveOrder())
		//.map(Emp::getfName).sorted(Comparator.reserveOrder().map(Emp::getlName).reserved
		.collect(Collectors.toList());
	}
	
	/**
	 * 
	 * Which code fragment, 
	 * when inserted at line n1, 
	 * sorts the employees list in descending order of fNameand then ascending order of lName?
	 * 
	 * A. .sorted(Comparator.comparing(Emp::getfName).reserved().thenComparing(Emp::getlName))
	 * B. .sorted(Comparator.comparing(Emp::getfName).thenComparing(Emp::getlName))
	 * C. .map(Emp::getfName).sorted(Comparator.reserveOrder())
	 * D. .map(Emp::getfName).sorted(Comparator.reserveOrder().map(Emp::getlName).reserved
	 * 
	 * 
	 * Correct Answer: B
	 * 
	 */

}
