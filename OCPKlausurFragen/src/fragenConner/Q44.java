package fragenConner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

//Given code fragment:

class FileThread implements Runnable {
	String fName;

	public FileThread(String fName) {
		this.fName = fName;
	}

	public void run() {
		System.out.println(fName);
	}
}

public class Q44 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// and code given:
		ExecutorService executor = Executors.newCachedThreadPool();
		Stream<Path> listOfFiles = Files.walk(Paths.get("Java Projects"));
		
		listOfFiles.forEach(line -> {
			executor.execute(new FileThread(line.getFileName().toString())); // line n1
		});
		
		executor.shutdown();
		executor.awaitTermination(5, TimeUnit.DAYS); // line n2
	}
	
	/**
	 * The Java Projects directory exists and contains a list of files. 
	 * 
	 * What is the result?
	 * 
	 * A. The program throws a runtime exception at line n2.
	 * 
	 * B. The program prints files names concurrently.
	 * 
	 * C. The program prints files names sequentially.
	 * 
	 * D. A compilation error occurs at line n1.
	 * 
	 * 
	 * 
	 * Correct Answer: B
	 */

}
