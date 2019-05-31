package vererbung;

/*
 * nichtstatische init-Blöcke werden in jeden Konstruktor (intellegent) kopiert
 */

class OS {
	{
		System.out.println("1");
	}
	
	OS(){
		/*
		super();
		{
			System.out.println("1");
		}
		{
			System.out.println("2");
		}
		 
		 */
	}
	OS(int x){
		/*
		super();
		{
			System.out.println("1");
		}
		{
			System.out.println("2");
		}
		 
		 */
	}
	{
		System.out.println("2");
	}
	OS(String name){
		this();
	}
}  

public class B05_Init_Block {

	public static void main(String[] args) {
		System.out.println("main. 1. OS-Objekt");
		new OS();
		System.out.println("noch ein OS-Objekt");
		new OS();
		System.out.println("und noch ein OS-Objekt");
		new OS(22);
		System.out.println("und noch ein OS-Objekt mit OS(String)");
		new OS("W");

	}

}
