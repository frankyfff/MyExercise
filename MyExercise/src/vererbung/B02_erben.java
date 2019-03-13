package vererbung;

class Auto {
	static final int MIN_BAUJAHR = 1886;
	
	public static int getMinBaujahr() {
		return  MIN_BAUJAHR;
	}
	
	// Private Elemente werden in den abgeleiteten Klassen nicht sichtbar
	// und damit (nach Oracle) nicht vererbt
	private int baujahr;
	
	// Konsturktoren werden nicht vererbt
	public Auto() {
		baujahr = MIN_BAUJAHR;
	}
	
	public String toString() {
		return "Auto aus "+ baujahr;
	}
}

class PKW extends Auto {
	
}

public class B02_erben {
	public static void main(String[] args) {
		System.out.println( PKW.MIN_BAUJAHR );
		System.out.println( PKW.getMinBaujahr());
		System.out.println( new PKW() );
	}
}
