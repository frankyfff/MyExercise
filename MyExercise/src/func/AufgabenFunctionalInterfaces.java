package func;

import java.util.function.Predicate;

public class AufgabenFunctionalInterfaces {

	public static void main(String[] args) throws Exception {
		
		
		/*
		 * 2. checkString soll einen String überprüfen.
		 *    Wenn der übergebene String die Prüfung nicht besteht, wirft die Methode
		 *    eine IllegalArgumentException.
		 *    Die Logik der Überprüfung bekommt die Methode mit einem Predicate übergeben.
		 */
		
		
		String s = "aaa";
		
		Predicate<String> testlog = new Predicate<String>() {
			public boolean test (String s) {
				return s.length() > 3; 
			}
		};
//		Predicate<String> testLogik = str -> str.length() > 3; 
	
		
		Error err = new Error();
		checkString(s, testlog,  err);

	}


	private static void checkString(String s, Predicate<String> testLogik, Error e) throws Exception{
		if (!testLogik.test(s)) {
			throw e;
		}
	}
	
	
	
	
	
	
	
//	// 1.
//	private static void checkString(String s) {
//		if(s == null) {
//			throw new IllegalArgumentException();
//		}
//		
//	}

}
