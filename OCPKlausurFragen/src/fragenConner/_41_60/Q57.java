package fragenConner._41_60;

//Given code fragments:

class DataConverter {
	public void copyFlatFilesToTables() {}
	public void close() throws Exception {
		throw new RuntimeException();	// line n1
	}
}

public class Q57 {

	public static void main(String[] args) throws Exception {
		// and the code fragment:
		
		try( DataConverter dc = new DataConverter() ) {// line n2
			dc.copyFlatFilesToTables();
		}
	}
	
	/*
	 * What is the result?
	 * 
	 * A.	A compilation error occurs at line n2.
	 * B.	A compilation error occurs because the try block doesn’t have a catch or finally block.
	 * C.	A compilation error occurs at line n1.
	 * D.	The program compiles successfully.
	 * 
	 * 
	 * Correct Answer: B
	 */

}
