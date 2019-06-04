package fragenConner._61_85;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Given code fragment:
class Prooduct {
	String name;
	Integer price;

	public Prooduct(String name, Integer price) {
		this.name = name;
		this.price = price;
	}

	public void printVal() {
		System.out.println(name + " Price:" + price + " ");
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}

public class Q76 {

	public static void main(String[] args) {
		// and the given code fragment:

		List<Prooduct> li = Arrays.asList(new Prooduct("TV", 1000), new Prooduct("Refrigerator", 2000));
		Consumer<Prooduct> raise = e -> e.setPrice(e.getPrice() + 100);
		li.forEach(raise);
		li.stream().forEach(Prooduct::printVal);
	}

	/*
	 * What is the result? 
	 * 
	 * A. 	TV Price :1100 Refrigerator Price :2100 
	 * B. 	A compilation error occurs. 
	 * C. 	TV Price :1000 Refrigerator Price :2000 
	 * D. 	The program prints nothing. 
	 * 
	 * 
	 * 
	 * Correct Answer: A
	 */

}
