package enums;

import java.util.Arrays;
import java.util.Comparator;

class MyOS implements Comparable<MyOS> {

	static final MyOS UNIX = new MyOS("UNIX", 0);
	static final MyOS WINDOWS = new MyOS("WINDOWS", 1);
	static final MyOS MAC = new MyOS("MAC", 2);

	private String name;
	private int ord;
	
	private MyOS(String name, int ord) {
		this.name = name;
		this.ord = ord;
	}
	
	public int ordinal() {
		return ord;
	}
	
	@Override
	public String toString() {
		return name;
	}

	static MyOS[] values() {
		return new MyOS[] { UNIX, WINDOWS, MAC };
	}

	@Override
	public int compareTo(MyOS o) {
		int tmp;
		tmp = this.compareTo(o);
		return tmp;
	}


}

public class KleinerOSAufgabe {

	public static void main(String[] args) {

		// 1 Bitte enum-Klasse OS mit den Konstanten UNIX, WINDOWS, MAC erzeugen

		System.out.println("** 2");
		// 2. geben Sie bitte alle OS-Werte mit foreach-Schleife aus
		OS[] allValues = OS.values();
		for (OS os : allValues) {
			System.out.println(os);
		}

		// 3. Bitte eine neue (NICHT-enum) normale Klasse MyOS erzeugen,
		// die mit der folgenden foreach-Schleife dieselben asugaben erzeugt,
		// wie die Schleife für die enum-Klasse

		System.out.println("** 3");
		MyOS[] allValues2 = MyOS.values();
		for (MyOS os : allValues2) {
			System.out.println(os);
		}
		
		System.out.println("** 4");
		// Bitte für alle OS-Referenzen die ordinal-Werte ausgeben:
		OS[] allValues3 = OS.values();
		for (OS os : allValues3) {
			System.out.println(os.ordinal());
		}
		
		System.out.println("** 5");
		// 5. Ordinals bitte für die eigene Klass MyOS einführen und ähnlich
		// für alle MyOS-Referenzen ausgeben:
		MyOS[] allValues4 = MyOS.values();
		for (MyOS os : allValues4) {
			System.out.println(os.ordinal());
		}
		
		System.out.println("** 6");
		// Aufsteigen: [UNIX, WINDOWS, MAC]
		// Absteigend: [MAC, WINDOWS, UNIX]
		
		// 6. Bitte das Array mit allen OS-Referenzen absteigen sortierenn und ausgeben:
		OS[] allValues5 = OS.values();
		Arrays.sort(allValues5, Comparator.reverseOrder());
		for (OS os : allValues5) {
			System.out.println(os);
		}
		
		// 7. Bitte das Array mit allen MyOS-Referenzen absteigen sortieren und ausgeben
		
	
		
	}

}
