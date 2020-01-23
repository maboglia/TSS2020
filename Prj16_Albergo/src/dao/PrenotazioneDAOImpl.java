package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Prenotazione;

public class PrenotazioneDAOImpl implements PrenotazioneDAO {


	private Connection connessione = Database.getConnessione();
	private Statement statement;
	private ResultSet rs;
	List<Prenotazione> prenotazioni = new ArrayList<>();
	
	
	@Override
	public List<Prenotazione> getAll() {
		
		try {
			statement = connessione.createStatement();
			rs = statement.executeQuery("select * from prenotazioni");
			
			while (rs.next()) {
				Prenotazione p = new Prenotazione();
				p.setnGiorni(rs.getInt("nGiorni"));
				p.setnPersone(rs.getInt("nPersone"));
				p.setNome(rs.getString("nome"));
				prenotazioni.add(p);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return prenotazioni;
	}

	@Override
	public void insert(Prenotazione p) {
		
		try {
			statement = connessione.createStatement();
			String sql = "insert into prenotazioni(nPersone, nGiorni, nome) values("+
					p.getnPersone() + 
					"," + p.getnGiorni() +
					",'" + p.getNome() +
					"')";
			System.out.println(sql);
			statement.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
