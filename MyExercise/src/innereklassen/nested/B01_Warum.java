package innereklassen.nested;

/*
 * 
 * - Innere Klasse Seite hat eine logische Beziehung zu dem Typ Buch
 * - Innerhalb der Klasse Buch sind alle Elemente sichtbar
 * - Methoden einer nichtstatischen inneren Klasse (hier: Seite) haben den Zufriff
 *   auf das Objekt vom äußeren Typ (hier: Buch-Objekt)
 * - Innere Klassen reduzieren die Anzahl der Toplevel-Typen
 * - mit anonymen Klassen wird nur das Wesentliche programmiert: die Methode(n), die an eine
 *   weitere Komponente übergeben werden sollte (noch besser: Lambdas)
 * - ...
 * 
 */

class Buch {
	private String titel;
	
	class Seite {
		public String toString() {
			return "Eine Seite aus dem Buch " + titel;
		}
	}
}


public class B01_Warum {
	public static void main(String[] args) {
		
	}
}
