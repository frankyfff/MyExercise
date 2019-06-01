package fragenConner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*9*/	 Connection conn = DriverManager.getConnection(dbURL, userName, passWord);
		/*10*/	 String query = "SELECT id FROM Employee";
		/*11*/	 try (Statement stmt = conn.createStatement()) {
		/*12*/		ResultSet rs = stmt.executeQuery(query);
		/*13*/		stmt.executeQuery("SELECT id FROM Customer");
		/*14*/		while (rs.next()) {
		/*15*/			 //process the results
		/*16*/			System.out.println("Employee ID: "+ rs.getInt("id")); 
		/*17*/		} 
		/*18*/	 }catch (Exception e) {
		/*19*/		System.out.println ("Error");
		/*20*/	 }
		
	}
	
	/**
	 * Assume that:
	 * The required database driver is configured in the classpath.
	 * The appropriate database is accessible with the dbURL, 
	 * userName, and passWord exists.
	 * The Employee and Customer tables are available 
	 * and each table has id column with a few records and the SQL queries are valid.
	 * What is the result of compiling and executing this code fragment?
	 * 
	 * 
	 * A. The program prints employee IDs.
	 * 
	 * B. The program prints customer IDs.
	 * 
	 * C. The program prints Error.
	 * 
	 * D. compilation fails on line 13.
	 * 
	 * 
	 * Correct Answer: C
	 * 
	 * 
	 */

}
