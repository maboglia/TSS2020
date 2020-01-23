package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.Connessione;
import model.Studente;

public class StudentiController {

	private Statement statement = null;
	private ResultSet rs = null;
	
	private List<Studente> studenti = new ArrayList<>();
	
	public List<Studente> getStudenti() {
		return studenti;
	}
	
	public StudentiController() {
		this.caricaStudenti();
	}

	private void caricaStudenti() {

		Connessione conn = new Connessione();
		Connection connessione = conn.getConnessione();
		
		try {
			//1 creo statement
			statement = connessione.createStatement();

			//2 eseguo query
			String sql = "select studente_id, nome, cognome from studente";
			rs = statement.executeQuery(sql);
			
			//3 scorro il resultset
			while (rs.next()) {
				
				Studente s = new Studente();
				s.setId(rs.getInt(1));
				s.setNome(rs.getString(2));
				s.setCognome(rs.getString(3));
				
				studenti.add(s);
				
			}
			
			
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
