package fragenConner._00_20;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Q16 {

	public static void main(String[] args) {
		// Given that course.txt is accessible and contains:
		
		//Course::Java
		
		// and ginven the code fragment:
		
		int i;
		char c;
		
		try(FileInputStream fis = new FileInputStream ("course.txt");         
			InputStreamReader isr = new InputStreamReader(fis);) {         
				while (isr.ready())   {   //line n1             
					isr.skip(2);             
					i = isr.read ();             
					c = (char) i;
					System.out.print(c);
				}
			} catch(Exception e)   {
				e.printStackTrace();
			}
	}
	
	/**
	 * 
	 * What is the result?
	 * 
	 * A. ur :: va
	 * B. ueJa
	 * C. The program prints nothing.
	 * D. A compilation error occurs at line n1.
	 * 
	 * 
	 * Correct Answer: B
	 * 
	 */
}


