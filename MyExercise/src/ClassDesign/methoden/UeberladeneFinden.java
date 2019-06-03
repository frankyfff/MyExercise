package classdesign.methoden;


	


public class UeberladeneFinden {
	
	
	static void m() {System.out.println("no args");}
	static void m(int x) {System.out.println("int");}
	static void m(Integer x) {System.out.println("Integer");}
	static void m(Long x) {System.out.println("Long");}
	static void m(Number x) {System.out.println("Number");}
	static void m(Object x) {System.out.println("Object");}
	static void m(double x) {System.out.println("double");}
	static void m(int... x) {System.out.println("int...");}
	
	public static void main(String[] args) {
		Integer x=2;
		m(x);
	}
	
	/*
	 * Suche nach der gemeinten Methode:
	 * 
	 * 1. Typ der Parameter exakt gleich dem Typ der Argumente  
	 * 
	 * 2. Widening (bei primitiven Argumenten)
	 * 		byte -> short -> int -> long -> float -> double
	 * 		Achtung! kein Autoboxing nach dem Widening!
	 *  
	 * 3. Bei primitiven Argumenten: Autoboxing
	 * 4. Basistyp-Parameter (auch nach dem Autoboxing vom primitiven Argument aus Punkt 3.)
	 * 
	 * 5. Autounboxing bei Wrapper-Klassen-Argumenten
	 * 		mit Widening des ungeboxten primitiven Argument
	 * 
	 * 6. varargs-Methode
	 * 
	 */

}
