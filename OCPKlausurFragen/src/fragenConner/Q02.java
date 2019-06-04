package fragenConner;

import java.io.File;
import java.io.IOException;

public class Q02 {

	public void recDelete(String dirName) throws IOException {

		File[] listOfFiles = new File(dirName).listFiles();

		if (listOfFiles != null && listOfFiles.length > 0) {
			for (File aFile : listOfFiles) {
				if (aFile.isDirectory()) {
					recDelete(aFile.getAbsolutePath());
				} else {
					if (aFile.getName().endsWith(".class"))
						aFile.delete();
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/*
	 * Assume that Projects contains sub directories that contain .class files and
	 * is passed as an argument to the recDelete() method when it is invoked.
	 * 
	 * What is the result?
	 * 
	 * A. The method deletes all the .class files in the Projects directory and its
	 * sub directories. 
	 * 
	 * B. The method deletes the .class files of the Projects
	 * directory only. 
	 * 
	 * C. The method executes and does not make any changes to the
	 * Projects directory. 
	 * 
	 * D. The method throws an IOException.
	 * 
	 * 
	 * 
	 * Correct Answer: A
	 */

}
