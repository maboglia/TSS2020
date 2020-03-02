package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection connetti() throws SQLException {
		final String URL = "jdbc:mysql://localhost:3306/tss_2020";
		final String USERNAME = "root";
		final String PW = "";
		
		return DriverManager.getConnection(URL, USERNAME, PW);
		
	}
	
}
