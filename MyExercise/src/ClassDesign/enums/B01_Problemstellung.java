package enums;

import java.util.Random;

public class B01_Problemstellung {
	
	public static final int ROT = 0;
	public static final int GELB = 1;
	public static final int GRUEN = 2;

	public static void main(String[] args) {
		/**
		 * Problem:
		 * 
		 * int als Typ der Ampelfarbe ist nicht die beste Wahl:
		 * zu viele int-Werte gibt es, die für eine Ampelfarbe keinen Sinn ergeben.
		 */
		
		int farbe = getFarbe();
		
		switch (farbe) {
		case ROT:
			System.out.println("Rot. Anhalten");	
			break;
		case GELB:
			System.out.println("Gelb. Gleich gehts los...");	
			break;
		case GRUEN:
			System.out.println("Grün. Los!");	
			break;

		default:
			throw new IllegalArgumentException("Farbe unbekannt:"+farbe);
		}

	} // end of main

	private static int getFarbe() {
		return new Random().nextInt(4); // Fehler hier!!! Werte: 0,1,2 oder 3
	}
	
	/*
	if(farbe == ROT) {
		System.out.println("Rot. Anhalten!");
	} else if(farbe==GELB) {
		System.out.println("Gelb. Gleich geht es los...");
	} else if(farbe==GRUEN ) {
		System.out.println("Grün. Los!");
	} else {
		throw new IllegalStateException("Farbe unbekannt: " + farbe);
	}
 */

}
