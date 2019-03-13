package vererbung;



/**
 * 
 * statische init-Blöcke werden nur einmal beim Laden der Klasse tusgeführz
 *
 */
class Tier {
	static {
		System.out.println("Tier / static init 1");
	}
	static {
		System.out.println("Tier / static init 2");
	}
}






public class B04_static_Init_Blocks {

	public static void main(String[] args) {
		System.out.println("main: Gleich wird die Klasse Tier geladen");
		new Tier();
		System.out.println("weitere Tier-Objekte");
		new Tier();
		new Tier();
		new Tier();
		new Tier();
	}

}
