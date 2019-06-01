package functional.lambdas;


/*
 * -Lamda-Funktion ist eine kompakte Realisierung von einem funktionalen Interface.
 * 
 * -Nicht in der Prüfung: was macht der Compiler aus einer Lamda:
 * https://www.logicbig.com/tutorials/core-java-tutorial/java-8-enhancements/java-lambda-functional-aspect.html
 */


public class B01_Regeln {
	public static void main(String[] args) {
		
		
		// mit der anonymen Klasse:
		Runnable r1 = new Runnable () {
			
			@Override
			public void run() {
				System.out.println("r1/run");
			}
		};
		
		r1.run();
		
		// mit der Lambda:
		Runnable r2 = () -> { 
			System.out.println("r2/run");
		};
		r2.run();
		
		//mit der Lambda noch kompakter:
		Runnable r3 = () -> System.out.println("r3/run");
		r3.run();
		
		/*
		 * Nicht in der Prüfung: was ist Lambda wirklich?
		 */
		
		Runnable r5 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Anonyme Klasse. getClass(): " + getClass());
			}
		};
		
		r5.run();
		
//		Runnable r6 = () -> {
//			System.out.println("Lamda. getClass() gibt es in diesem Kontext nicht" + getClass());
//		};
//		r6.run();
	}

}
