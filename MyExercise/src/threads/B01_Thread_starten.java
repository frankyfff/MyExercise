package threads;

public class B01_Thread_starten {

	public static void main(String[] args) {
		
		Thread th = new Thread();
		th.start();
		System.out.println( "der rest von main" );

	}

}
