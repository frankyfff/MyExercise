package fragenConner;

//Given code fragment:

class UserException extends Exception {
}

class AgeOutOfLimitException extends UserException {
}

public class Q55 {

	public void doRegister(String name, int age) throws UserException, AgeOutOfLimitException {
		if (name.length() < 6) {
			throw new UserException();
		} else if (age >= 60) {
			throw new AgeOutOfLimitException();
		} else {
			System.out.println("User is registered.");
		}
	}
	
	public static void main(String[] args) throws UserException {
		// and code fragment:
		Q55 t = new Q55();
		t.doRegister("Mathew", 60);
	}
	
	/*
	 * What is the result?
	 * 
	 * A.	User is registered.
	 * B.	An AgeOutOfLimitExceptionis thrown.
	 * C.	A UserExceptionis thrown.
	 * D.	A compilation error occurs in the main method.
	 * 
	 * 
	 * 
	 * Correct Answer: B
	 */

}


