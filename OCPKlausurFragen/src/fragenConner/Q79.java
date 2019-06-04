package fragenConner;

//Given code fragment:

interface Interface1 {
	public default void sayHi() {
		System.out.println("Hi Interface-1");
	}
}

interface Interface2 {
	public default void sayHi() {
		System.out.println("Hi Interface-2");
	}
}

//Given code fragment:
public class Q79 implements Interface1, Interface2 {

	public static void main(String[] args) {
		Interface1 obj = new Q79();
		obj.sayHi();
	}

	public void sayHi() {
		System.out.println("Hi MyClass");
	}

	/*
	 * What is the result? 
	 * 
	 * A. 	Hi Interface - 2 
	 * 
	 * B. 	A compilation error occurs. 
	 * 
	 * C. 	Hi Interface - 1 
	 * 
	 * D. 	Hi MyClass 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Correct Answer: D
	 */

}
