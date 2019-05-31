package interfaces;

import java.util.Arrays;

class Tier implements Comparable<Tier> {

	private int alter;
	private String name;

	@Override
	public String toString() {
		return name + " (" + alter + ") ";
	}

	public Tier(String name, int alter) {
		this.alter = alter;
		this.name = name;
	}

	/*
	 * so ist z.B. die sort-Methode realisiert:
	 * 
	 * int result = t1.compareTo(t2); if(result > 0) { // t1 > t2 // t1 und t2
	 * vertauschen } else { // t1 kleiner oder gleich t2 // nicht vertauschen }
	 * 
	 * 
	 * z. B.:
	 * 
	 * t1 = new Tier("Tom", 5), t2 = new Tier("Jerry", 3)
	 *
	 * oder
	 * 
	 * t1 = new Tier("Jerry", 5), t2 = new Tier("Jerry", 3)
	 * 
	 * 
	 */



	@Override
	public int compareTo(Tier t2) {
		int result = alter - t2.alter; // compareTo der Klasse String

		if (result == 0) {
			result = alter - t2.alter;
		}

		return result;
	}

}

public class B04_Sortieren_und_vergleichen_von_Comparable {

	public static void main(String[] args) {
		
		 stringSortieren();
		//integerReferenzenSortieren();
		// tiereSortieren();
		
	}	//end of main

	private static void tiereSortieren() {
		Tier[] arr = {
				new Tier("Jerry", 20),
				new Tier("Tom", 5),
				new Tier("Jerry", 3),
				new Tier("Rex", 4),
				new Tier("Rex", 1)
		};
		
		/*
		 * Arrays.sort(Object[]) sortiert aufsteigend in der (hier für die Klasse Tier)
		 */
		
		Arrays.parallelSort(arr);
		
		for (Tier tier : arr) {
			System.out.println(tier);
		}
		
	}
	
	public static void integerReferenzenSortieren() {
		Integer[] arr = {
				33,
				44,
				-2,
				0,
		};
		
		/*
		 * Arrays.sort(Object) sortiert aufsteigend in der (hier für die Klasse Integer)
		 * natürlichen Reihenfolge.
		 */
		
		Arrays.parallelSort(arr);
		
		System.out.println(Arrays.toString(arr));	// [-2, 0, 33, 44]
	}
	
	/*
	 * 
	 */
	public static void stringSortieren() {
		String[] arr = {
				"dd",
				"aa",
				"mm",
				"hallo welt",
				"cc",
				"pp",
				
		};
		
		/*
		 * Arrays.sort(Object[]) sortiert aufsteigend in der (hier für die Klasse String)
		 * natürlichen Reihenfolge.
		 */
		
		Arrays.sort(arr);
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
	}
	

}
