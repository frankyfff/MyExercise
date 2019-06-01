package functional.method_references;

import java.util.function.Supplier;

public class B02_Referenz_auf_statische_Methode {

	public static void main(String[] args) {
		b1();
	}

	private static void b1() {
		// Math.random();
		
		Supplier<Double> s1 = new Supplier<Double>() {

			@Override
			public Double get() {
				return Math.random();
			}
		};
		
		Supplier<Double> s2 = () -> Math.random();
		
		/*
		 * Referenz auf die statische Methode random der Klasse Math
		 */
		
		Supplier<Double> s3 = Math::random;
		System.out.println("randon number: " + s3.get());
	}

}
