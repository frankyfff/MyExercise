package fragenConner._00_20;

import java.util.Arrays;
import java.util.List;

import fragenConner._41_60.Productt;

// Given code fragment:

class Product {
	int id;
	int price;

	public Product(int id, int price) {
		this.id = id;
		this.price = price;
	}

	public String toString() {
		return id + ":" + price;
	}
}

public class Q19 {

	public static void main(String[] args) {
		// and the code fragment:
		List<Productt> products = Arrays.asList(
				new Productt(1, 10),     
				new Productt (2, 30),     
				new Productt (2, 30)
		);
		Productt p = products.stream()
				.reduce(new Productt (4, 0), (p1,  p2) -> { p1.price += p2.price; return new Productt (p1.id, p1.price);}); 
		
				products.add(p); 
				
				products.stream().parallel()
					.reduce((p1, p2) -> p1.price > p2.price ? p1 : p2)
					.ifPresent(System.out::println);
	}
	
	/**
	 * What is the result?
	 * 
	 * A. 2 : 30
	 * 
	 * B. 4 : 0
	 * 
	 * C. 4 : 60
	 * 
	 * D. 4 : 60 2 : 30
	 * 	  3 : 20
	 * 	  1 : 10
	 * 
	 * E. The program prints nothing.
	 * 
	 * Correct Answer: C
	 */

}
