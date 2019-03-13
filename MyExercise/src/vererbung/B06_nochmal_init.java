package vererbung;

import java.util.Random;

class PositiveRandomInteger {
	private int value;
	
	//init-Block:
	{
		value = new Random().nextInt(Integer.MAX_VALUE);
		System.out.println("generiert: " + value);
	}
	
	PositiveRandomInteger() {}
	
	PositiveRandomInteger(String name) {}
	
	public int getValue() {
		return value;
	}
	
}



public class B06_nochmal_init {

	public static void main(String[] args) {
	
		System.out.println( new PositiveRandomInteger().getValue() );
		System.out.println( new PositiveRandomInteger("v2").getValue() );
		
	}

}
