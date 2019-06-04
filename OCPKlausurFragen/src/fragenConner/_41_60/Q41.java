package fragenConner._41_60;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* Given the records from the Employee table:
	eid		ename
	111		Tom
	112		Jerry
	113		Donald
*/
public class Q41 {

	public static void main(String[] args) {
		// and the given code fragment:
		try {
			Connection conn = DriverManager.getConnection(URL, userName, passWord);
			Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			st.execute("SELECT*FROM Employee");
			ResultSet rs = st.getResultSet();
			while (rs.next()) {
				if (rs.getInt(1) == 112) {
					rs.updateString(2, "Jack");
				}
			}
			rs.absolute(2);
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		} catch (SQLException ex) {
			System.out.println("Exception is raised");
		}

	}
	
/**
 * Assume that:
 * The required database driver is configured in the classpath.
 * The appropriate database accessible with the URL, userName, and passWord exists. 
 * What is the result?
 * 
 * A. 	The Employee table is updated with the row: 
 * 		112 Jack 
 * 		and the program prints: 
 * 		112 Jerry
 * 
 * B. The Employee table is updated with the row: 
 * 		112 Jack 
 * 		and the program prints: 
 * 		112 Jack
 * 
 * C. The Employee table is not updated and the program prints: 
 * 		112 Jerry
 * 
 * D. The program prints Exception is raised.
 * 
 * 
 * Correct Answer: C
 */

}
