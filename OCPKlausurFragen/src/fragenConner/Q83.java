package fragenConner;

import java.util.ResourceBundle;

// Given the Greetings.properties file, containing:

/*
  HELLO_MSG = Hello, everyone!
  GOODBYE_MSG = Goodbye everyone!
 */

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;;

public class Q83 {

	public void loadResourceBundle() {
		Q83 resource = ResourceBundle.getBundle("Greetings", Locale.US);
		System.out.println(resource.getObject(1));
	}

	public static void main(String[] args) {
		// and given code fragment:

		new Q83().loadResourceBundle();

	}

	/*
	 * What is the result?
	 * 
	 * A. Compilation fails.
	 * 
	 * B. GOODBY_MSG
	 * 
	 * C. Hello, everyone!
	 * 
	 * D. Goodbye everyone!
	 * 
	 * E. HELLO_MSG
	 * 
	 * 
	 * 
	 * 
	 * Correct Answer: A
	 */

}
