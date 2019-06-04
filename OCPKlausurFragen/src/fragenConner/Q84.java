package fragenConner;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//Given the records from the STUDENT table:

/*
 
 	--------------------------------------
 	sid		|	sname	|	semail
 	--------------------------------------
 	111		|	James	|	james@uni.com
 	112		|	Jane	|	jane@uni.com	
 	114		|	John	|	john@uni.com
 
 */

public class Q84 {

	public static void main(String[] args) throws SQLException {
		// Given the code fragment:
		// code to load and register valid jdbc driver go here

		Connection con = DriverManager.getConnection(URL, username, password);
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

		st.execute("SELECT * FROM student");
		ResultSet rs = st.getResultSet();
		rs.absolute(3);
		rs.moveToInsertRow();
		rs.updateInt(1, 113);
		rs.updateString(2, "Jannet");
		rs.updateString(3, "jannet@uni.com");
		rs.updateRow();
		rs.refreshRow();
		System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
		
	}
	
	/*
	 * Assume that the URL, username, and password are valid.
	 * 
	 * What is the result?
	 * 
	 * A.	The STUDENT table is not updated and the program prints:
	 * 		114 : John : john@uni.com
	 * 
	 * B.	The STUDENT table is updated with the record:
	 * 		113 : Jannet : jannet@uni.com and the program prints:
	 * 		114 : John : john@uni.com
	 * 
	 * C.	The STUDENT table is updated with the record:
	 * 		113	: Jannet : jannet@uni.com and the program prints:
	 * 		113 : Jannet : jannet@uni.com
	 * 
	 * D.	A SQLException is thrown at run time.
	 * 
	 * 
	 * 
	 * 		Correct Answer: D
	 * 
	 */

}
