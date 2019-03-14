package enums;


class FarbeAlsKlasse {
	public static final FarbeAlsKlasse ROT = new FarbeAlsKlasse();
	public static final FarbeAlsKlasse GELB = new FarbeAlsKlasse();
	public static final FarbeAlsKlasse GRUEN = new FarbeAlsKlasse();
	
	public static FarbeAlsKlasse[] values(){
		return new FarbeAlsKlasse[] {
			ROT, GELB, GRUEN
		};
	}
	
	private FarbeAlsKlasse() {}
}

public class B02_Loesung_mit_Klasse {

	public static void main(String[] args) {
		
		FarbeAlsKlasse farbe = getFarbe();
		
		// mit der FarbeAlsKlasse ist keine switch-Anweisung möglich 
		if(farbe == FarbeAlsKlasse.ROT) {
			System.out.println("Rot. Anhalten");
		} else if (farbe == FarbeAlsKlasse.GELB) {
			System.out.println("Gelb. Gleich gehts es los...");
		} else if(farbe == FarbeAlsKlasse.GRUEN) {
			System.out.println("Grün. Los!");
		} else {
			throw new IllegalArgumentException("Farbe unbekannt: " + farbe);
		}

	} // end of main

	static FarbeAlsKlasse getFarbe() {
		return FarbeAlsKlasse.GRUEN;
	}

}
