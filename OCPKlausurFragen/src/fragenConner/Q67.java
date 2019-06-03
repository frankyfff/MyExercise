package fragenConner;

import java.io.Console;

public class Q67 {
	
	public static void main(String[] args) {

		Console console = System.console();

		char[] pass = console.readPassword("Enter password"); // line n1
		String password = new String(pass); // line n2;
	}
	
	/*
	 * What is the result?
	 * 
	 * A.	A compilation error occurs at line n1.
	 * B.	A compilation error occurs at line n2.
	 * C.	The code reads the password without echoing characters on the console.
	 * D.	A compilation error occurs because the IOExceptionisn’t declared to be thrown or caught?
	 * 
	 * 
	 * 
	 * Correct Answer: A
	 * 
	 */
	
	
}
