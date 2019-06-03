package fragenConner;

import java.text.NumberFormat;
import java.util.Locale;

/* Given table
----------------------------------------------------
|	Locale	|	Currency Symbol	|	Currency Code  |
|	US		|	$				|	USD			   |
----------------------------------------------------
*/

public class Q68 {

	public static void main(String[] args) {
		// and the code fragment:
		
		double d = 15;
		Locale l = new Locale("en", "US");
		NumberFormat formatter = NumberFormat.getCurrencyInstance(l);
		System.out.println(formatter.format(d));
		

	}
	/*
	 * What is the result?
	 * 
	 * A.	$15.00
	 * B.	15 $ 
	 * C. 	USD 15.00
	 * D. 	USD $15
	 * 
	 * 
	 * Correct Answer: A
	 */
	

}
