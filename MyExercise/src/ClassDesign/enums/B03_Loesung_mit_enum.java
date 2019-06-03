package enums;


enum Farbe {
	ROT, GELB, GRUEN
}

public class B03_Loesung_mit_enum {

	public static void main(String[] args) {
		
		Farbe farbe = getFarbe();
		
		// mit enum-Farbe ist auch switch möglich
		if (farbe == Farbe.ROT) {
			System.out.println("Rot. Anhalten!");
		} else if (farbe == Farbe.GELB) {
			System.out.println("Gelb. Gleich geht es los...");
		} else if (farbe == Farbe.GRUEN) {
			System.out.println("Grün. Los!");
		} else {
			throw new IllegalStateException("Farbe unbekannt: " + farbe);
		}
		
		// auch switch:
		switch (farbe) {
		case ROT:
			System.out.println("Rot. Anhalten!");
			break;
		case GELB:
			System.out.println("Gelb. Gleich geht es los...");
			break;
		case GRUEN:
			System.out.println("Grün. Los!");
			break;
		default:
			throw new IllegalStateException("Farbe unbekannt: " + farbe);
	}
		

	}

	private static Farbe getFarbe() {
		// return new Farbe(); // Compilerfehler
		return Farbe.ROT;
	}

}
