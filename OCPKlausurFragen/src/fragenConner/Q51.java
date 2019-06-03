package fragenConner;

//Given code fragment:

//Book.java:

class Book {
	private String read(String bname) {
		return "Read" + bname;
	}
}

//EBook.java:

class EBook extends Book {
	class String read (String url) {  
		return "View" + url;   
	}
}

public class Q51 {
		public static void main(String[] args) {
			// Given code fragment:

			Book b1 = new Book();
			b1.read("Java Programing");
			Book b2 = new EBook();
			b2.read("http://ebook.com/ebook");
		}
		
		/**
		 * What is the result?
		 * 
		 * A.	Read Java Programming View http:/ ebook.com/ebook
		 * B.	Read Java ProgrammingRead http:/ ebook.com/ebook
		 * C.	The EBook.javafile fails to compile.
		 * D.	The Test.javafile fails to compile.
		 * 
		 * 
		 * Correct Answer: D
		 */
}
