package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {

	//parametri connessione
	private final String DB_URL = "jdbc:mysql://localhost:3306/tss_2020";
	private final String USERNAME = "root";
	private final String PASSWORD = "";
	//oggetto connection
	private static Connection connessione;
	//istanza singleton
	private static Database database = new Database();
	//costruttore privato
	private Database() {this.connetti();}
	//singleton getter
	public static Database getDatabase() {
		return database;
	}
	
	public static Connection getConnessione() {
		return connessione;
	}
	
	private void connetti() {
		try {
			connessione = DriverManager.getConnection(DB_URL,USERNAME, PASSWORD);
			System.out.println("siamo connessi");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	
}
