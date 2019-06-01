package functional.func;

import java.util.function.Function;

public class B05_Funtion {

	public static void main(String[] args) {
		
		Function<String, Integer> f1 = new Function<String, Integer>() {

			@Override
			public Integer apply(String s) {
				return Integer.parseInt(s);
			}
		};
		
		
		Function<String, Integer> f2 = (String s) -> {
			return Integer.parseInt(s);
		};
		
		/**
		 * Auf Function programmieren
		 */
		
		Integer x = f2.apply("-33");
		System.out.println(x);
	}

}
