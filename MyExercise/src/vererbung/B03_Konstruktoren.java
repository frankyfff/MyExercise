package vererbung;


class C1{
	/***
	 * default-Konstruktor, generiert vom Compiler:
	 * 
	 * C1(){
	 * 		super();
	 * }
	 * 
	 */
}

/**
 * 
 * kein default-Konstruktor generiert!
 *
 */
class C2{
	C2(int x){
		// super(); // com Compiler generiert
	}
}

class C3 {
	int x;
	/**
	 * default-Konstruktor, generiert vom Compiler:
	 * 
	 * C3() {
	 * 		super();
	 * 		this.x = 0;
	 * }
	 */
}

class C4 {
	int x = 22; 
	/**
	 * default-Konstruktor, generiert vom Compiler:
	 * 
	 * C3() {
	 * 		super();
	 * 		this.x = 22;
	 * }
	 */
}

class C5 {
	C5(){
		// super; // vom Compiler generiert
	}
	C5( int x ) {
		// super; // vom Compiler generiert
	}
}

class C6 {
	C6() {
		this(2);	// super() indirekt in dem 2. Konstruktor aufgerufen
	}
	C6(int x) {
		// super(); // vom Compiler generiert
	}
}

class C7 {
	int x;
	int y = 3;
	
	C7(){
		// super; // vom Compiler generiert
		this.x = 7;
		// this.y = 3 // vom Compiler generiert
	}
	
	C7(int y){
		// super(); // vom Compiler generiert
		// this.x = 0 // vom Compiler generiert
		this.y = y;
	}
	
	C7(String s){
		this (22); // alles nötige wird in dem this-Aufruf gemacht
	}
}


class ExamBase {
	public ExamBase(int x) {
		
	}
}

class ExamDerivedA extends ExamBase {} // kein passender Konstruktor in der Basisklasse 

class ExamDerivedB extends ExamBase {
	ExamDerivedB(){
		// kein passender Konstruktor in der Basisklasse 
	}
}

class ExamDerivedC extends ExamBase {
	ExamDerivedC(){
		super(); // kein passender Konstruktor in der Basisklasse 
	}
}

class ExamDerivedD extends ExamBase {
	ExamDerivedD(){
		super(22); 
	}
}

public class B03_Konstruktoren {
	public static void main(String[] args) {
	}
}
