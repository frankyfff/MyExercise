package functional.func;

import java.util.function.Supplier;

public class B03_Supplier {

	public static void main(String[] args) {

		Supplier<String> s1 = new Supplier<String>() {

			@Override
			public String get() {
				
				return "Java ist toll";
			}
		};
		
		Supplier<String> s2 = () -> {return "Java ist toll";};
		
		/**
		 * Auf Supplier programmieren:
		 * 
		 */
		
		String str = s2.get();
		
		System.out.println("str: "+str);
		
	}

}
