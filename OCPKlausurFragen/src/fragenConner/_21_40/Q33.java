package fragenConner._21_40;

//Given code fragment:

class Customer {
	private String fName;
	private String lName;
	private static int count;

	public Customer(String first, String last) {
		fName = first;
		lName = last;
		++count;
	}

	static {
		count = 0;
	}

	public static int getCount() {
		return count;
	}
}

public class Q33 {

	public static void main(String[] args) {
		// Given code fragment

		Customer c1 = new Customer("Larry", "Smith");
		Customer c2 = new Customer("Pedro", "Gonzales");
		Customer c3 = new Customer("Penny", "Jones");
		Customer c4 = new Customer("Lars", "Svenson");
		c4 = null;
		c3 = c2;
		System.out.println(Customer.getCount());

	}
	
	/**
	 * 
	 * What is the result?
	 * 
	 * A. 0
	 * B. 2
	 * C. 3
	 * D. 4
	 * E. 5
	 * 
	 * Correct Answer: D
	 * 
	 */

}
