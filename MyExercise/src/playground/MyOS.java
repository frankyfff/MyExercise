package playground;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MyOS {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306?serverTimezone=UTC";
		
		Connection connection = DriverManager.getConnection(url, "root", "1234");
			
		Statement stm = connection.createStatement();
			
		String sql = "SELECT * FROM test_db_java.tiere";
			
		ResultSet res = stm.executeQuery(sql);
		
		res.next();
			
		res.close();
		stm.close();
		connection.close();
			
		
	}
}
