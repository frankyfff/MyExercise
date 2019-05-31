package playground;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class B02_Connection {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306?serverTimezone=UTC";
		
		String user = "root";
		String password = "1234";
		
		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			
			System.out.println("Die Verbindung steht");
			
			// connection.close() sollte sein (wie hier mit try-with-resources)
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

		System.out.println("Die Verbindung wurde geschlossen");
	}

}
