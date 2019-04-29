package func;

import java.util.function.Predicate;

public class B02_Predicate {

	public static void main(String[] args) {
//	Predicate<String> p1 = new Predicate<String>() {
//		public boolean test(String s) {
//			return true;
//		}
//	};
	
	
	Predicate<String> xxxxx = s -> s != "n";
	
	
	boolean erg = xxxxx.test("N");
	System.out.println(erg);

	}

}
