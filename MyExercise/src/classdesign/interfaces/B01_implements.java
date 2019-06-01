package interfaces;

public class B01_implements {

	
	/*
	 * KlasseB extends KlasseA
	 * KlasseA implements InterfaceA
	 * InterfaceB extends InterfacesA
	 * 
	 */
	
	interface Lauffaehig {
		void laufen();
	}
	
	class Mensch implements Lauffaehig {

		@Override
		public void laufen() {}
		
	}
	public static void main(String[] args) {

	}

}
