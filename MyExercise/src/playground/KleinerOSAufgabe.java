package playground;

public class KleinerOSAufgabe {

	
	public static void main(String[] args) {
		
		//1
		OS myOS = new KleinerOSAufgabe();
		
		
		
		
		//2
		for (OS tmp : OS.values()) {
			System.out.println(tmp);
		}
		
		//3
		
		MyOS myOS2 = new MyOS();
		myOS2.ausgabe();

	}

}
