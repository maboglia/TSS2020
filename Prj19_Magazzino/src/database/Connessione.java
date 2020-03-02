package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	
	private final static String DB_URL = "jdbc:mysql://localhost:3306/gestionale";
	private final static String USER = "root";
	private final static String PASS = "";
	
	private  static Connection conn = null;

	
	public static Connection getConnessione() throws SQLException {
		
		conn = DriverManager.getConnection(DB_URL,USER,PASS); 
		return conn;
	}
	
	public static void chiudiConn() throws SQLException {
		if(conn != null) {
			conn.close();
		}
	}
}
