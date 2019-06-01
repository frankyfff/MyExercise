package innereklassen.nested;

import java.util.Comparator;

class MyStringUtils {
	/*
	 * stati für Klassen heißt 'normal'
	 */
	
	static class LengthComparator implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) {
			return s1.length() - s2.length();
		}

		@Override
		public String toString() {
			
			String back = "Ich bin ein String-Comparator, "
					+ "definiert mit einer statischen inneren Klasse."
					
					back+= "\n";
					back+= "Die äßere Klasse hat die Version " + version;
					back+= "\n";
					back+= "Die äußere Klasse hat die Version" + MyStringUtils.version;
			
					back += "\n";
					back += "Die Objekte der äußeren Klasse haben das Attribut hash"
					
			return back;
		}
		
		
	}
}



public class B02_statische_innere_Klassen {

	public static void main(String[] args) {

	}

}
