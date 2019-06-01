package fragenConner;

// Given code fragment:

interface Rideable {
	Car getCar(String name);
}

class Car {
	private String name;

	public Car(String name) {
		this.name = name;
	}
}

public class Q26 {

	public static void main(String[] args) {
	
		/**
		 * 
		 * Which code fragment creates an instance of Car?
		 * 
		 * A. Car auto = Car ("MyCar")::new;
		 * 
		 * B. Car auto = Car::new;
		 * 	  Car vehicle = auto::getCar("MyCar");
		 * 
		 * C. Rideable rider = Car::new;
		 * 	  Car vehicle = rider.getCar("MyCar");
		 * 
		 * D. Car vehicle = Rideable::new::getCar("MyCar");
		 * 
		 * 
		 * Correct Answer: C
		 * 
		 */
	}

}
