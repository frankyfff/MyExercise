package vererbung;


class Container {
	static final int MIN_VALUE = -100;
	static final int MAX_VALUE;
	
	static {
		MAX_VALUE = 33;
		System.out.println("Container / static init");
	}
}

class Liste extends Container {
	
}

public class B07_nochmal_static_init {

	public static void main(String[] args) {
		new Liste();

	}

}
