package functional.lambdas;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class B02_Syntax {

	public static void main(String[] args) {
		Consumer<Integer> c1 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
			}
			
		};
		
		Supplier<Integer> s1 = new Supplier<Integer>() {

			@Override
			public Integer get() {
				return 0;
			}
			
		};
		
		BiConsumer<Integer, String> bc1 = new BiConsumer<Integer, String>() {

			@Override
			public void accept(Integer t, String u) {
			}
			
		};
		
		/*
		 * Parameterliste (auch Klammer)
		 */
		Consumer<Integer> c2 = (Integer t) -> {};
		Consumer<Integer> c3 = (t) -> {};
		Consumer<Integer> c4 = t -> {}; // ohne Klammer nur wenn es genau 1 Parameter gibt.
		
		
		Supplier<Integer> s2 = () -> 0;
		//Supplier<Integer> s3 = -> 0;			// geht nicht ?!
		
		BiConsumer<Integer, String> bc2 = (Integer t, String u) -> {};
		BiConsumer<Integer, String> bc3 = (t,u) -> {};
		//BiConsumer<Integer, String> bc4 = t,u -> {};	// heht nicht?!
		
		
		/*
		 * Methodenrumpf (auch Klammer)
		 */
		
		Supplier<Double> s4 = () -> {return 22.0;};
		
		Supplier<Double> s5 = () -> 22.0;		// ohne geschweiften Klammer geht es nur,
												// wenn die ganze Realisierung aus einem einzigen Ausdruck besteht
		
		//Supplier<Double> s55 = () -> return 22.0;
		
		Supplier<Double> s6 = () -> {
			double back = 3;
			back++;
			return back;
		};
		
//		Supplier<Double> s7 = () -> 
//			double back = 3;
//			back++;
//			return back;		// geht nicht ohne Klammer, zuviel Ausdrucke
		
		/*
		 * Kleiner Test
		 */
		
		Consumer<String> c6 = s -> {
			int x = 33;
		};
		
	//	Consumer<String> c7 s -> int x = 33;	// Initialiserung ist keine Expression in Java  
		
		Consumer<String> c8 = s -> {
			System.out.println(s);
		};
		
		Consumer<String> c9 = s -> System.out.println(s);
		
	}

}
