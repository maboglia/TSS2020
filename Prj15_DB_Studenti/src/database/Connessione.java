package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String DB_URL = "jdbc:mysql://localhost:3306/tss_2020";
	private final String USER = "root";
	private final String PASS = "";
	
	//oggetto per gestire la connessione
	private Connection conn = null;
	
	public Connection getConnessione() {
		
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			if (conn!=null) System.out.println("connessi!!!!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void main(String[] args) {
		Connessione c = new Connessione();
		c.getConnessione();
	}
}
