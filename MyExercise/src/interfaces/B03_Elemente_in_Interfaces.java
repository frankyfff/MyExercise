package interfaces;

/*
 * Alle Elemente in einem Interface sind immer public
 */

interface I1{
	
	/*
	 * abstrakte Methoden in einem Interface sind alle public und abstrakt
	 */
	void m1();	// public abstract
	abstract void m2(); // public
	public abstract void m3();
	
	/*
	 * default-Methoden sind public
	 */
	default void m4() {	// public
		System.out.println("in m4");
	}
	
	/*
	 * statische Konstanten (public, static und final)
	 */
	
	// int K;	//public static final	// Exam!!! Compilerfehler static und final
	
	int K0 = 0;	// public static final
	final int K1 = 1;	// public static
	static final int K2 = 3;	// public
	public static final int K3 = 3;
	
	/*
	 * statische Methoden (public static)
	 */
	static void StaticMethod() {
		System.out.println("statische Methode 1");
	}
	
	/*
	 * Innere Typen (public static)
	 */
	interface InnerI { //public
		
	}
	
	class InnerClass1 {	// public static
		
	}
	
	abstract class InnerClass2 {	// public static
		
	}
	
} // endof interface I1

public class B03_Elemente_in_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
