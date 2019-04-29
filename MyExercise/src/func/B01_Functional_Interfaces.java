package func;

public class B01_Functional_Interfaces {

	public static void main(String[] args) {

		// A1 a1 = new implements A1 super() {}
		A1 a1 = new A1 ("test") {
			public void m1() {

			}

			public void m2() {

			}

		};

	}

	class B extends A1 {
		
		public B(String s) {
			super(s);
			// TODO Auto-generated constructor stub
		}

		public void m1() {

		}

		public void m2() {

		}
	}
}

abstract class A1 {

	public A1(String s){
		
		System.out.println("abstrakte klasse");
	}
	
	public abstract void m1();

	public abstract void m2();
}