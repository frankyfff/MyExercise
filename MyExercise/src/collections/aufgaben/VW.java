package collections.aufgaben;

public class VW extends Auto {

	public VW(String modell, int baujahr) {
		super(modell, baujahr);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " VW. Modell: " + super.modell+ " , Bauhjar: " + super.baujahr;
	}
	

	

}
