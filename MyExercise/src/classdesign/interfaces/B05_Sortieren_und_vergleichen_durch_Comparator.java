package interfaces;

import java.util.Arrays;
import java.util.Comparator;

class StringComparatorReverse implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}
}

class StringComparatorLength implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}


public class B05_Sortieren_und_vergleichen_durch_Comparator {
	public static void main(String[] args) {
		stringSortieren();
	}

	static void stringSortieren() {
		String[] arr = {
				"dd",
				"cccc",
				"aa",
				"cc",
		};
		
		System.out.println("** Natürlich aufsteigend mit sort(Object[]): ");
		Arrays.sort(arr);	// Vergleicht zwei String mithilfe der Methode
							// compareTo von einem der beiden Strings
		
		System.out.println( Arrays.toString(arr));
		
		System.out.println("** Absteigend mit sort( Object[], Comparator): ");
		
		Comparator<String> cmp = new StringComparatorReverse();
		
		Arrays.sort(arr, cmp);	// Vergleicht zwei Strings mithilfe der Methode
								// compare von dem übergebenen Comparator
		System.out.println(Arrays.toString(arr));
		
		System.out.println("** Aufsteigend nach Länge mit sort(Object[], comparator): ");
		
		Arrays.sort(arr, new StringComparatorLength());
		
		System.out.println(Arrays.toString(arr));
	}
}
