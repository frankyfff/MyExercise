package threads;



class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("run");
	}
}

public class B02_MyThread {

	public static void main(String[] args) {
		
		Thread th = new MyThread();
		th.start();
		
		System.out.println("main");

	}

}
