package enums;

public class B04_enum_StandardAPI {

	public static void main(String[] args) {
		
		System.out.println("*** statische Methode values:");
		OS[] allValues = OS.values();
		
		for (OS os : allValues) {
			System.out.println(os);
		}
		
		System.out.println("** toString");
		OS var1 = OS.MAC;
		System.out.println(var1);
		
		System.out.println("** name:");
		System.out.println(var1.name());
		
		System.out.println("** int ordinal():");
		int ord = var1.ordinal();
		System.out.println("var1.ordinal() = "+ ord);
		
		System.out.println("** jede enum-Klasse realisiert Comparable");
		Comparable<OS> c1 = OS.UNIX;
		System.out.println("c1.compareTo(OS.WINDOWS): "+ c1.compareTo(OS.WINDOWS));
	} // end of main

}
