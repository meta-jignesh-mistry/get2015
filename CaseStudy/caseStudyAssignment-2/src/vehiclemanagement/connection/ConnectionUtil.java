
package vehiclemanagement.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//class responsible to create connection with vehiclemanagement database

public class ConnectionUtil {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/vehicleManagement";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";
				
	private Connection con = null;
	
	public Connection getConnection() {
		/* register driver */
		try {
				Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			
		/* open connection */
		try {
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
		
}