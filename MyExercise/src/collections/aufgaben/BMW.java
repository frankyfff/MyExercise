package collections.aufgaben;

public class BMW extends Auto {

	public BMW(String modell, int baujahr) {
		super(modell, baujahr);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " BMW. Modell" + modell + ", Baujahr: " + baujahr;
	}
	
	

	
}
