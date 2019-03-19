package interfaces;

import java.util.Arrays;

class Auto implements Comparable<Auto> {

	private int baujahr;

	public Auto(int baujahr) {
		this.baujahr = baujahr;
	}

	@Override
	public int compareTo(Auto a2) {
		return baujahr - a2.baujahr;
	}
}

public class B06_Suchen_mit_binarySearch {
	
	public static void main(String[] args) {
		 binarySearchMitPrimitiven();
		// binarySearchMitStringReferenzen();
		// binarySearchMitAutoReferenzen();
	}

	public static void binarySearchMitPrimitiven() {
		
		int[] intArr = {
				5, -3, 70, -20, 9
		};
		
	//	0	1	2	3	4
	// [5, -3, 70, -20, 9]
		System.out.println("** nicht sortiert");
		System.out.println( Arrays.toString(intArr));
		
		int pos = Arrays.binarySearch(intArr, 9);
		System.out.println("Position on 9: " + pos); // -3 (Array ist nicht sortiert)
	
		Arrays.sort(intArr);
		
		//    0   1  2  3  4
		// [-20, -3, 5, 9, 70]
		// 1. Schritt: 5 < 9 -> rechts weiter suchen
		//           | 
		// 2. Schritt: [9, 70]
		//           | Treffer!
		
		System.out.println("** sortiert: ");
		System.out.println( Arrays.toString(intArr));
		
		pos = Arrays.binarySearch(intArr, 9);
		System.out.println("Position on 9: " + pos); 	// 3
		
		System.out.println("--------------");
		
		pos = Arrays.binarySearch(intArr, 0); 	
		System.out.println("Position von 0: " + pos); //	-3
		
		pos = Arrays.binarySearch(intArr, -100); 	
		System.out.println("Position von 0: " + pos); //	-1
		
	}

	public static void binarySearchMitAutoPrimitiven() {
		
		Auto[] arr = {
				new Auto(1900),	//0
				new Auto(2003),	//1
				new Auto(1984),	//2
		};
		
		int pos = Arrays.binarySearch(arr, new Auto(1984));
		System.out.println("pos: " + pos);	//-2 (nicht sortiert)
		
		Arrays.sort(arr);
		
//		new Auto(1900),	 // 0
//		new Auto(1984),	 // 1
//		new Auto(2003),	 // 2
		pos = Arrays.binarySearch(arr, new Auto(1984));
		System.out.println("pos: " + pos);	// 1
		
	}
	
	public static void binarySearchMitStringReferenzen() {
		
		String[] strArr = {
				"abc", "ab", "de"
		};
		
		System.out.println("nicht sortiert: " + Arrays.toString(strArr));
		
		//[abc, ab, de]
		int pos = Arrays.binarySearch(strArr, "abc");
		System.out.println("pos für abc: " + pos);	// -3 (array nicht sortiert)
		
		Arrays.sort(strArr);
		System.out.println("sortiert: "+ Arrays.toString(strArr));
		
		// [ab, abc, de]
		pos = Arrays.binarySearch(strArr, "abc");
		System.out.println("pos für abc: " + pos);	// 1
	}
	
	public static void binarySearchMitAutoReferenzen() {
		
	}
	
	
}
