package functional.func;

import java.util.function.Predicate;

public class B02_Predicate {
	
	public static void main(String[] args) {
		Predicate<String> p1 = new Predicate<String>() {

			@Override
			public boolean test(String s) {
				return s != null;
			}
			
		};
		
		Predicate<String> p2 = s ->  s != null;
		
		/**
		 * Auf Predicate programmieren
		 */
		
		boolean ergebnis = p1.test("Hallo");
		System.out.println("ergebnis: "+ ergebnis);
	}
}
