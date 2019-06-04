package fragenConner._00_20;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import fragenConner._41_60.Book;

// Given code fragments:

class Book implements Comparator<Book> {
	String name;
	double price;

	public Book() {
	}

	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public int compare(Book b1, Book b2) {
		return b1.name.compareTo(b2.name);
	}

	public String toString() {
		return name + ":" + price;
	}
}

public class Q20 {

	public static void main(String[] args) {
		
		//and the code fragment:
		
		List<Book>books = Arrays.asList(
				new Book ("Beginning with Java", 2), 
				new Book ("AGuide to Java Tour", 3)
		);
		
		Collections.sort(books, new Book());System.out.print(books);

	}
	
	/**
	 * What is the result?
	 * 
	 * A. [A Guide to Java Tour:3.0, Beginning with Java:2.0]
	 * B. [Beginning with Java:2, A Guide to Java Tour:3]
	 * C. A compilation error occurs because the Book class does not override the abstract method compareTo().
	 * D. An Exceptionis thrown at run time.
	 * 
	 * Correct Answer: A
	 */

}
