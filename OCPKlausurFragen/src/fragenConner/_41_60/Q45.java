package fragenConner._41_60;

//Given code fragment:

class CheckClass {
	public static int checkValue(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class Q45 {

	public static void main(String[] args) {

		// and the code fragment:

		String[] strArray = new String[] { "Tiger", "Rat", "Cat", "Lion" };
		
		// line n1
		
		for (String s : strArray) {
			System.out.print(s + " ");
		}

	}
	
	/**
	 * Which code fragment should be inserted at line n1 to enable the code to print Rat Cat Lion Tiger?
	 * 
	 * A. Arrays.sort(strArray, CheckClass::checkValue);
	 * 
	 * B. Arrays.sort(strArray, (CheckClass::new)::checkValue);
	 * 
	 * C. Arrays.sort(strArray, (CheckClass::new).checkValue);
	 * 
	 * D. Arrays.sort(strArray, CheckClass::new::checkValue);
	 * 
	 * 
	 * 
	 * Correct Answer: A
	 */

}
