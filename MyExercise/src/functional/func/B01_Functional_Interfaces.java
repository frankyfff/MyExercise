package functional.func;


/*
 * Funktionales Interfaces ist ein Interface mit nur einer abstrakten Methode
 */

interface IA{} // kein funkt. Interface

interface IB{ // funkt. Interface
	void m();
}

interface IC{ // kein fuknt. Interface
	void m1();
	void m2();
}

@FunctionalInterface
interface ID{
	
}

@FunctionalInterface
interface IE{
	void m();
}

@FunctionalInterface
interface IF{
	void m1();
	void m2();
}

@FunctionalInterface
interface IG{
	void m1();
	default void m2() {}
}

public class B01_Functional_Interfaces {
	public static void main(String[] args) {
		IB var1 = new IB () {
			public void m() {}
		};
		
		IB var2 = () -> {};
		
		IG var3 = () -> {};
	}
}
