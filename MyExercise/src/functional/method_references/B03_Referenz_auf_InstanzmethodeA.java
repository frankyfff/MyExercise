package functional.method_references;

import java.util.function.Supplier;

/*
 * Referenz auf eine Instanzmethode von einem bestimmten Objekt	(particular Object)
 * 
 * Regeln s. im Bsp. 01
 */

public class B03_Referenz_auf_InstanzmethodeA {
	public static void main(String[] args) {
		
		String str = "Mittwoch"; // particular Object
		
		Supplier<String> s1 = new Supplier<String>() {

			@Override
			public String get() {
				return str.toUpperCase();
			}
		};
		
		Supplier<String> s2 = () -> str.toUpperCase();
		
		// Referenz auf eine Instanzmethode toUpperCase
		// von dem bestimmten Objekt (Object hinter str-Referenz)
		Supplier<String> s3 = str::toUpperCase;
		
		// verwenden
		String newStr = s3.get();
		System.out.println("String aus dem Supplier: " + newStr);
		
	}
}
