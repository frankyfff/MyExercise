package classdesign.methoden;

import java.util.ArrayList;

/*
 * Varargs (ein Parameter mit ...)
 * 
 * -In einer Methode darf es nur einen Varargs-Parameter geben
 * -Der Varargs-Parameter muss der letzte Parameter in der Parameterliste sein
 * 
 */

public class Varargs {
	
	void m1(int[][] a) {}
//	void m2(int...is ... a) {}
//	void m3(int...[] a) {}
	void m4(int[]... a) {}
	
//	static int sum(int a, int b) { return a+b;}
//	
//	static int sum(int[] arr) {
//		int sum = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		
//		return sum;
//	}
	
	static int sum(int... arr) {
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,3};
		int erg = sum(arr);
		
		erg = sum(new int[]{3,4});
		System.out.println("erg = " + erg); //7
		
		erg = sum( 3, 4 ); // Vorteil von varargs: einfacher Aufruf
		System.out.println("erg = " + erg); //7
		
		sum( );	//array mit length = 0
		sum( 1 );
		sum( 1,2 );
		sum( 1,2,3 );
		sum( 1,2,3,4 );
		sum( 1,2,3,4,5 );
		
		System.out.printf("%s %s %n", 1, "Hallo");
		System.out.format("%s %s %s %s", new ArrayList<>(), 2.3, 5, 6);
		
	}
}
