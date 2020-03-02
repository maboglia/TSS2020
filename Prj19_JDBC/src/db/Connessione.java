package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	//parametri connessione
	private final String DB_URL = "jdbc:mysql://localhost:3306/tss_2020";
	private final String USER = "root";
	private final String PASS = "";
	
	private static Connessione conn = new Connessione();
	
	public static Connessione getConn() {
		return conn;
	}
	
	private Connessione() {
		
	}
	
	public Connection connetti() {
		Connection con = null;
		try {
			
			con = DriverManager.getConnection(DB_URL, USER, PASS);
			if(con != null)
				System.out.println("connesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
		
	}
	
	
}
