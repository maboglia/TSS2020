package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import db.Connessione;
import model.Studente;

public class StudentiCtrl {

	private Statement statement = null;
	private ResultSet rs = null;

	private Map<Long, Studente> studenti = new HashMap<>();
	
	public Map<Long, Studente> getStudenti() {
		return studenti;
	}
	
	public StudentiCtrl() {
		this.caricaStudenti();
	}
	
	private void caricaStudenti() {
		
		Connection connetti = Connessione.getConn().connetti();
		
		try {
			statement = connetti.createStatement();
			rs = statement.executeQuery("select * from studente");
			
			while (rs.next()) {
				System.out.println(rs.getString(6));
				Studente s = new Studente(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(5),rs.getString(6), rs.getString(4).charAt(0));
				studenti.put(s.getStudente_id(), s);
				
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		studenti.values().forEach(System.out::println);
		
		
	}
	
	

	
}
