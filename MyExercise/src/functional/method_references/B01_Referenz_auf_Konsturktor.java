package functional.method_references;

import java.util.function.Function;
import java.util.function.Supplier;

public class B01_Referenz_auf_Konsturktor {

	/*
	 * - Method-Reference ist eine kompakte Realisierung von einem funktionalen Interface
	 * - Method-Reference ist nur dann möglich, wenn die Liste der Parametertypen
	 *   der zu realisierenden abstrakten Methode an die Liste der Parametertypen der referenzierten
	 *   Methode passt.
	 * - Method-Reference ist nur dann möglich, wenn die Realisierung der abstrakten Methode
	 *   nur aus dem Aufruf der referenzierten Methode besteht.
	 * 
	 */
	public static void main(String[] args) {
		b1();
		b2();
		b3();
	}

	private static void b3() {
		
		// innere Klasse
		class MyString{
			public MyString(Integer x) {
				System.out.println("innere Klasse " + x);
			}
		}
		
		Function<Integer, MyString> f1 = new Function<Integer, MyString>() {

			@Override
			public MyString apply(Integer t) {
				return new MyString(t);
			}
		};
		
		Function<Integer, MyString> f2 = t -> new MyString(t);
		
		Function<Integer, MyString> f3 = MyString::new;
		
		//verwenden
		MyString s = f3.apply(22);
	}

	private static void b2() {
		Function<Integer, String> f1 = new Function<Integer, String>() {

			@Override
			public String apply(Integer t) {
				return new String(t.toString());
			}
		};
		
		Function<Integer, String> f2 = (t) -> new String(t.toString());
		
		// keine Referenz auf den String-Konsturktor möglich
		
	}

	private static void b1() {
		
		//Supplier mit einer anonymen Klasse
		Supplier<Exception> s1 = new Supplier<Exception>() {

			@Override
			public Exception get() {
				return new Exception();
			}
		};
		
		//Supplier mit einer Lamda
		Supplier<Exception> s2 = () -> new Exception();
		
		// Supplier mit einer Referenz auf den Knostruktor der Klasse Exception
		Supplier<Exception> s3 = Exception::new;
		
		// verwenden vom Supplier
		Exception e = s3.get();
		System.out.println("e = " + e);
	}

}
