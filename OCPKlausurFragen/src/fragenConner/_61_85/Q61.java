package fragenConner._61_85;

//Given code fragment:

class Resource implements AutoCloseable {

	public void close() throws Exception {
		System.out.println("Close-");
	}
	
	public void open(){
		System.out.println("Open-");
	}
}

public class Q61 {

	
	public static void main(String[] args) {
		// and given code fragment:
		Resource res1 = new Resource();
		
		try {
			res1.open();
			res1.close();
		} catch (Exception e) {
			System.out.println("Exception - 1");
		}
		
		try (res1 = new Resource()) {	// line n1
			res1.open();
		} catch (Exception e) {
			System.out.println("Exception - 2");
		}

	}
	
	/*
	 * What is the result?
	 * 
	 * 
	 * A. 	Open-Close–Exception –1 
	 * 		Open–Close–
	 * 
	 * B. 	Open–Close–Open–Close–
	 * 
	 * C.	A compilation error occurs at line n1.
	 * 
	 * D.	Open–Close–Open–
	 * 
	 * 
	 * 
	 * Correct Answer: C 
	 */

}
