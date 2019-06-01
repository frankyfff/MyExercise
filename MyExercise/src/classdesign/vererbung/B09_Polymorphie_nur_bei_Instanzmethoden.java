package classdesign.vererbung;

import java.io.FileNotFoundException;

public class B09_Polymorphie_nur_bei_Instanzmethoden {

	class Fahrzeug {
		
		static final int MIN_BAUJAHR = 1980;
		
		public static int getMinBaujahr() {
			return MIN_BAUJAHR;
		}
		
		int baujahr = 1986;
		
//		Fahrzeug() {
//			super();
//			this.baujahr;
//		}
		
		public int getBaujahr() {
			return baujahr;
		}
	}
	
	class Opel extends Fahrzeug {
		
		static final int MIN_BAUJAHR = 1920;
		
		public static int getMinBaujahr() {
			return MIN_BAUJAHR;
		}
		
		int baujahr = 2016;
		
//		Opel() {
//			super();
//			this.baujahr = 2016;
//		}
		
		public int getBauJahr() {
			return baujahr;
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("++ Zugriff auf Instanzvariablen (Attribute)");
		Opel o1 = new Opel();
		System.out.println(o1.baujahr);

		FileNotFoundException
		void m1() {
			}
		}
		enum test{a,vv,cc};

}
