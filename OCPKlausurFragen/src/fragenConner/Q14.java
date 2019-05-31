package fragenConner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Q14 {

	public static void main(String[] args) {
		// Given code fragment:
		
		Stream<Path> files = Files.walk(Paths.get(System.getProperty("user.home")));     
			files.forEach (fName -> {                    		//line n1         
				try {Path aPath = fName.toAbsolutePath();    	//line n2
						System.out.println(fName + ":" + 
						Files.readAttributes(aPath, Basic.File.Attributes.class)
						.creationTime());
					} catch(IOException ex) {             
						ex.printStackTrace();
					}
			);}
	}

	/**
	 * What is the result?
	 * 
	 * A. All files and directories under the home directory are listed along with their attributes. 
	 * B. A compilation error occurs at line n1. 
	 * C. The files in the home directory are listed along with their attributes. 
	 * D. A compilation error occurs at line n2.
	 * 
	 * 
	 * Correct Answer: A
	 */
}
