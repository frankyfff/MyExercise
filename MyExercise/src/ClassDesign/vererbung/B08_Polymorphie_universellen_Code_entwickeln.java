package classdesign.vererbung;

//------------------------------------
//Figur als abstrakte Klasse ist auch als Basistyp möglich, auf den die Methode
//getGesamtflaeche2 programmiert werden kann.
//Wenn aber außer der deklarierten (abstrakten) Methoden (wie getFlaeche)
//in dem gemeinsamen Basistyp keine weiteren (nicht abstrakten) Inhalte nötig sind,
//ist ein Interface statt abstrakte Klasse günstiger.
//------------------------------------
//abstract class Figur {
//int x, y; // das wäre der Grund Figur als abstrakte Klasse zu definieren
//	abstract double getFlaeche();
//}


interface Figur {
	double getFlaeche();
}

//---------------------------------------

class Kreis implements Figur {
	
	private int radius;
	
	public Kreis(int radius) {
		this.radius = radius;
	}

	@Override
	public double getFlaeche() {
		return Math.PI * radius * radius;
	}
}
//---------------------------------------

class Rechteck implements Figur {

	private int breite, hohe;
	
	public Rechteck(int breite, int hohe) {
		this.breite = breite;
		this.hohe = hohe;
	}

	@Override
	public double getFlaeche() {
		return breite * hohe;
	}
	
}

//---------------------------------------

public class B08_Polymorphie_universellen_Code_entwickeln {

	public static void main(String[] args) {
		
		Figur[] figuren = {
				new Rechteck(2,3),
				new Kreis(3),
		};

		double gesamt = getGesamtflaeche1(figuren);
		System.out.println("Gesamtfläche = " + gesamt);
		
		gesamt = getGesamtflaeche2(figuren);
		System.out.println("Gesamtfläche = " + gesamt);
	}
	
	/*
	 * Universeller Code (ohne Polymorphie) 
	 */
	
	static double getGesamtflaeche1(Object[] figuren) {
		
		double result = 0;
		for (Object f : figuren) {
			if(f instanceof Rechteck) {
				Rechteck r = (Rechteck)f;
				result += r.getFlaeche();
			}else if (f instanceof Kreis) {
				Kreis k = (Kreis)f;
				result += k.getFlaeche();
			} else {
				throw new IllegalArgumentException("Figuren-Typ nicht untersützt: " + f.getClass());
			}
		}
		
		return result;
	}
	
	/*
	 * Universeller Code (soll von Polymorphie profitieren)
	 */
	
	static double getGesamtflaeche2(Figur[] figuren) {
		double result = 0;
		
		for (Figur f : figuren) {
			result += f.getFlaeche();
		}
		
		return result;
	}

}
