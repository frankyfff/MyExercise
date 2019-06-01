package classdesign.wrapper;

class MyInteger {
	private final int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int intValue() {
		return value;
	}
	
	//
}

public class B01_Autoboxing_Autounboxing {

	public static void main(String[] args) {
		// MyInteger mi1 = 22; geht nicht
		
		Integer i1 = -22; 	//Autoboxing
		Integer i2 = Integer.valueOf(-22);	// manuelles (explizites) Boxing
		
		int x1 = i1;		// Autounboxing
		int x2 = i2.intValue();		//manuelles (explizites) Unboxing
		
		i1++;	//Inkrementieren mit Autoboxing/Autounboxing
		i1 = Integer.valueOf(i1.intValue() + 1); // Inkrementieren mit manuellen Boxing/Unboxing

		//Achtung! Exam
		
		class X {
			Integer y;
			Integer z;	// null
			
			public X(int y) {
				this.y = y + z;		// this.y = Integer.valueOf ( y+ z.intValue());
			}
		}
		
		System.out.println(new X(3).y); 	// NullPointerException
		
	}

}
