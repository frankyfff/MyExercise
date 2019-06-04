package fragenConner._61_85;

//Given code fragment:

class Engine {
	
	double fuelLevel;

	Engine(int fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
	
	public void start() {
		// line n1;
		System.out.println("Started");
	}
	
	public void stop() {
		System.out.println("Stopped");
	}
}

public class Q63 {

	public static void main(String[] args) {
		// your desing requires that:
		
		/*
		 * fuelLevel of Engine must be greater than zero when the start()method is invoked. 
		 * The code must terminate if fuelLevelof Engineis less than or equal to zero.
		 */
		
		/*
		 * Which code fragment should be added at line n1 to express this invariant condition?
		 * 
		 * A.	assert (fuelLevel) : "Terminating..."
		 * 
		 * B.	assert (fuelLevel > 0) : System.out.println ("Impossible fuel");
		 * 
		 * C.	assert fuelLevel < 0: System.exit(0);
		 * 
		 * D.	assert fuelLevel > 0: "Impossible fuel";
		 * 
		 * 
		 * Correct Answer: C
		 */

	}

}
