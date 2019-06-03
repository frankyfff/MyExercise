package fragenConner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Q58 {

	public static void main(String[] args) {
		// Given code fragment:

		try {

			Properties prop = new Properties();
			prop.put("user", userName);
			prop.put("password", passWord);
			Connection conn = DriverManager.getConnection(dbURL, prop);
			if (conn != null) {
				System.out.println("Connection Established");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	/*
	 * and the information:
	 * The required database driver is configured in the classpath.
	 * The appropriate database is accessible with the dbURL, username, and passWordexists.
	 * 
	 * What is the result?
	 * 
	 * A.	A ClassNotFoundExceptionis thrown at runtime.
	 * B.	The program prints nothing.
	 * C.	The program prints Connection Established.
	 * D.	A SQLExceptionis thrown at runtime.
	 * 
	 * 
	 * Correct Answer: C
	 * 
	 */

}
