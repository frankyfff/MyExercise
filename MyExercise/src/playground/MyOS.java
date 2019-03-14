package playground;

public class MyOS {
	
	OS[] allValues = OS.values();

	void ausgabe() {
		for (OS os : allValues) {
			System.out.println(os);
		}
	}
}
