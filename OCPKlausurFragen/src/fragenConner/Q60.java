package fragenConner;

public class Q60 {

	public static void main(String[] args) {
		// Given code fragment:

		for (Course a : Course.values()) {
			System.out.println(a + " Fees " + a.getCost() + " ");
		}

	}

	// Which is the valid definition of the Course enum? A.

//	enum Course {
//		JAVA(100), J2ME(150);
//		private int cost;
//
//		public Course(int c) {
//			this.cost = c;
//		}
//
//		int getCost() {
//			return cost;
//		}
//	}

	// Which is the valid definition of the Courseenum? B.

//	enum Course {
//		JAVA(100), J2ME(150);
//		private static int cost;
//
//		private Course(int c) {
//			this.cost = c;
//		}
//
//		int getCost() {
//			return cost;
//		}
//	}

	// Which is the valid definition of the Courseenum? C.

//	final enum Course {
//		JAVA(100), J2ME(150);
//		private int cost;
//
//		public Course(int c) {
//			this.cost = c;
//		}
//
//		int getCost() {
//			return cost;
//		}
//
//		void setCost(int c) {
//			this.cost = c;
//		}
//	}

	// Which is the valid definition of the Courseenum? D.

//	enum Course {
//		JAVA(100), J2ME(150);
//		private int cost;
//
//		Course(int c) {
//			this.cost = c;
//		}
//
//		int getCost() {
//			return cost;
//		}
//	}
	
	
	
	
	
//	Correct Answer: D
}
