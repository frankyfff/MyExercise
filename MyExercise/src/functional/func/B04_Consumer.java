package functional.func;

import java.util.function.Consumer;

public class B04_Consumer {

	public static void main(String[] args) {
		Consumer<String> c1 = new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println( s.toUpperCase() );
			}
		};
		
		Consumer<String> c2 = (String s) -> {
			System.out.println( s.toUpperCase() );
		};
		
		/**
		 * auf consumer programmieren!
		 */
		c2.accept("Werde groﬂ!");
		
		
	}

}
