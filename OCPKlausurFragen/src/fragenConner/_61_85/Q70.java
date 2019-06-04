package fragenConner._61_85;

class Producctt {
	public double applyDiscount(double price) {
		assert (price > 0); // line n1
		return price * 0.50;
	}
}

public class Q70 {

	public static void main(String[] args) {
		// Given code fragment
		
		Producctt p = new Producctt();
		double newPrice = p.applyDiscount(Double.parseDouble(args[0]));
		System.out.println("New Price: " + newPrice);

	}

	// and the command
	// java Product 0
	
	/*
	 * What is the result?
	 * 
	 * A.	An AssertionError is thrown.
	 * B.	A compilation error occurs at line n1.
	 * C.	New Price: 0.0
	 * D.	A NumberFormatExceptionis thrown at run time.
	 * 
	 * 
	 * Correct Answer: C
	 */
	
}
