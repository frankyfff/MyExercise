package functional.method_references;

import playground.MyOS;

/*
 * Referenz auf eine Instanzmethode von einem unbestimmten (unbekannten, arbitrary)
 * Objekt vom bestimmten (particular) Typ.
 * 
 * ODER:
 * 
 * Referenz auf eine Instanzmethode vom 1. Parameter der zu 
 * realisierenden abstrakten Methode
 * 
 * 
 * - Diese Method-Reference ist nur dann möglich, wenn es mindestens einen Parameter
 *   (nicht primitiv) in der zu realisierenden abstrakten Methode gibt.
 *   
 * - Diese Method-Reference ist nur dann möglich, wenn die restlichen Parametertypen
 *   der zu realisierenden abstrakten Methode für die Liste der Parametertypen 
 *   der referenzierten  Methode passen.
 *   
 * - Method-Reference ist nur dann möglich, wenn die Realisierung der abstrakten Methode
 *   nur aus dem Aufruf der referenzierten Methode besteht.
 */

class MyNumber {
	private int value;
	
	public MyNumber(int value) {
		this.value = value;
	}
	
	MyNumber getMax(MyNumber n2) {
		return value > n2.value ? this : n2;
	}
	
	@Override
	public String toString() {
		return Integer.toString(value);
	}
}

interface MyNumberChooser {
	MyNumber choose(MyNumber n1, MyNumber n2);
}



public class B04_Referenz_auf_InstanzmethodeB {

	public static void main(String[] args) {
		MyNumberChooser ch1 = new MyNumberChooser() {

			@Override
			public MyNumber choose(MyNumber n1, MyNumber n2) {
				return n1.getMax(n2);
			}
			
		};
		
		MyNumberChooser ch2 = (n1, n2) -> n1.getMax(n2);
		// Referenz auf die Instanzmethode getMax eines 
		// unbestimmten Objektes (des 1. Parameter der Methode choose)
		// von dem bekannten Typ MyNumber
		
		MyNumberChooser ch3 = MyNumber::getMax;
		
		//verwenden
		MyNumber myNum1 = new MyNumber(-3);
		MyNumber myNum2 = new MyNumber(22);
		
		MyNumber result = ch3.choose(myNum1, myNum2);
		System.out.println("result: " + result);
	}

}
