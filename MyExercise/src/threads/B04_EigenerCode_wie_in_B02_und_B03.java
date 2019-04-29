package threads;

public class B04_EigenerCode_wie_in_B02_und_B03 extends Thread {
	@Override
	public void start() {
		System.out.println(" ich habe die Methode Run überschrieben");
	}

	public static void main(String[] args) {
		
		
		
		
		//Runnable target = () -> System.out.println("Maus");
		
		Runnable target = () -> System.out.println("Maus");
		
		
//		new Thread(target) {
//			@Override
//			public void run() {
//				//super.run();
//				//System.out.println("Katze");
//			};
//		}.start();
		Thread th = new B04_EigenerCode_wie_in_B02_und_B03();
		th.start();
		
		
	}

}
