package interfaces;

interface Range {
	int getMin();

	int getMax();

	/*
	 * default-Methode in einem Interface darf realisiert werden (darf den Rumpf
	 * haben)
	 */
	default int getRange() {
		return getMax() - getMin();
	}
}

/*
 * 
 */
class MyIntRange implements Range {

	@Override
	public int getMin() {
		return 5;
	}

	@Override
	public int getMax() {
		return -3;
	}
	
}

interface Values {
	default int getRange() {
		return -3;
	}
}


/*
 * Eine Klasse, die zwei Interfaces mit der getRange implementiert.
 * -Diese Klasse muss die getRange selbst realisieren, denn sonst
 *  die Definition mehrdeutig ist.
 */

class Ints implements Range, Values {

	@Override
	public int getRange() {
		return Range.super.getRange();	// eine Mögliche Realisierung: die default-Methode aus
										// dem Basisinterface 'Range' verwenden
//		return Values.super.getRange(); // eine Mögliche Realisierung: die default-Methode aus
										// dem Basisinterface 'Values' verwenden
//	
	}

	@Override
	public int getMin() {
		// TODO Auto-generated method stub
		return -100;
	}

	@Override
	public int getMax() {
		// TODO Auto-generated method stub
		return 22;
	}
	
 	
	
}
public class B02_default {

	public static void main(String[] args) {
		MyIntRange r1 = new MyIntRange();
		System.out.println("r1: " + r1.getRange());

	}

}
