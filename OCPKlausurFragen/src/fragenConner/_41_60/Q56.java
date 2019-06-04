package fragenConner._41_60;

//Given code fragment:

class Productt {
	
	String pname;

	public Productt(String pname) {
		this.pname = pname;
	}
	
}

public class Q56 {
	
	//and the code fragment:
	public static void main(String[] args) {
		Productt p1 = new Productt("PowerCharger");
		Productt p2 = p1;
		System.out.println(p1.equals(p2));
		Productt p3 = new Productt("PowerCharger");
		System.out.println(p1.equals(p3));
	}
	
	/*
	 * What is the result?
	 * 
	 * A.	true 
	 * 		true
	 * 
	 * B.	false 
	 * 		true
	 * 
	 * C.	false 
	 * 		false
	 * 
	 * D.	true
	 * 		false
	 * 
	 * 
	 * Correct Answer: D
	 * 
	 */
}
