package fragenConner._41_60;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Given code fragment:
class CallerThread implements Callable<String> {
	String str;

	public CallerThread(String s) {
		this.str = s;
	}

	public String call() throws Exception {
		return str.concat("Call");
	}
}

public class Q43 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// and code fragment:

		ExecutorService es = Executors.newFixedThreadPool(4); // line n1
		Future f1 = es.submit(new CallerThread("Call"));
		String str = f1.get().toString();
		System.out.println(str);

	}
	
	/**
	 * Which statement is true?
	 * 
	 * A. The program prints Call Call and terminates.
	 * 
	 * B. The program prints Call Call and does not terminate.
	 * 
	 * C. A compilation error occurs at line n1.
	 * 
	 * D. An ExecutionException is thrown at run time.
	 * 
	 * 
	 * Correct Answer: B
	 * 
	 * 
	 */

}
