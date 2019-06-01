package fragenConner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Give code fragment:
/**
 * Item table 
 * • ID, INTEGER: PK 
 * • DESCRIP, VARCHAR(100) 
 * • PRICE, REAL 
 * • QUANTITY< INTEGER
 *
 */
public class Q34 {

	public static void main(String[] args) {
		// and the given code fragment:

		/* 9 */ try {
			/* 10 */ Connection conn = DriverManager.getConnection(dbURL, username, password);
			/* 11 */ String query = "Select * FROM Item WHERE ID = 110";
			/* 12 */ Statement stmt = conn.createStatement();
			/* 13 */ ResultSet rs = stmt.executeQuery(query);
			/* 14 */ while (rs.next()) {
				/* 15 */ System.out.println("ID: " + rs.getInt("Id"));
				/* 16 */ System.out.println("Description: " + rs.getString("Descrip"));
				/* 17 */ System.out.println("Price: " + rs.getDouble("Price"));
				/* 18 */ System.out.println("Quantity: " + rs.getInt("Quantity"));
				/* 19 */ }
			/* 20 */ } catch (SQLException se) {
			/* 21 */ System.out.println("Error");
			/* 22 */ }
	}
	
	/**
	 * Assume that:
	 * The required database driver is configured in the classpath.
	 * The appropriate database is accessible with the dbURL, userName, and passWord exists. 
	 * The SQL query is valid.
	 * 
	 * What is the result?
	 * A. An exception is thrown at runtime.
	 * B. Compilation fails.
	 * C. The code prints Error.
	 * D. The code prints information about Item 110.
	 * 
	 * Correct Answer: D
	 */

}
