package interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class B07_Suchen_mit_binarySearch_und_Comparator {

	public static void main(String[] args) {
		
		Integer[] arr = {
				70,
				new Integer(22),
				Integer.valueOf(-3),
				Integer.parseInt("12")
		};
		
		//[70, 22, -3, 12]
		System.out.println("** nicht sortiert: ");
		System.out.println(Arrays.toString(arr));
		
		Comparator<Integer> cmp = Comparator.reverseOrder();
		Arrays.sort(arr, cmp);
		
		//[70, 22, 12, -3]
		System.out.println("** absteigend sortiert: ");
		System.out.println(Arrays.toString(arr));
		
		// falsch:
		int pos = Arrays.binarySearch(arr, -3);	// geht von der natürlichen aufsteigenden Sortierung aus
		System.out.println("falsch! pos von -3: " + pos);	// -1 (Array ist absteigend sortiert)
		
		// richtig:
		pos = Arrays.binarySearch(arr, -3, cmp);	// geht von der Sortierung aus, die entstanden ist,
													// beim Vergleichen der Elemente mit dem Comparator
		System.out.println("richtig pos von -3: " + pos); // 3

	}

}
