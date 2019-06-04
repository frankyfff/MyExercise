package fragenConner;

import java.sql.Connection;

public class Q82 {

	public static void main(String[] args) {
		// Given code fragment:

		Connection con = null;
		try {
			// line n1
			if (con != null) {
				System.out.println("Connection Established.");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/*
	 * Assume that dbURL, userName, and password are valid.
	 * 
	 * Which code fragment can be inserted at line n1 to enable the code to print: Connection Established?
	 * 
	 * A.	Properties prop = new Properties(); 
	 * 		prop.put("user", userName); 
	 * 		prop.put("password", password); 
	 * 		con = DriverManager.getConnection(dbURL, prop); 
	 * 
	 * B.	con = DriverManager.getConnection(userName, password, dbURL); 
	 * 
	 * C. 	Properties prop = new Properties(); 
	 * 		prop.put("userid", userName); 
	 * 		prop.put("password", password); 
	 * 		prop.put("url", dbURL); 
	 * 		con = DriverManager.getConnection(prop);
	 * 
	 * D. 	con = DriverManager.getConnection(dbURL); 
	 * 		con.setClientInfo("user", userName); 
	 * 		con.setClientInfo ("password", password);
	 * 
	 * 
	 * 
	 * 		Correct Answer: A 
	 */

}
