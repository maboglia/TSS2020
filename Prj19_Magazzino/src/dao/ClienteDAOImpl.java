package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import database.Connessione;
import model.Cliente;

public class ClienteDAOImpl implements ClienteDAO {
	
	private List<Cliente> clienti= new ArrayList<>();
	private Connection conn = null;
	private Statement statement = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	@Override
	public List<Cliente> clientiAll() throws SQLException {
		conn = Connessione.getConnessione();
		statement = conn.createStatement();
		rs = statement.executeQuery(TROVA_TUTTI);
		
		while (rs.next()) {
			Cliente c = new Cliente();
			c.setNome(rs.getString(1));
			c.setCognome(rs.getString(2));
			clienti.add(c);
		}
		
		return clienti;
	}

	@Override
	public Cliente findById(int id) throws SQLException {
		
		Cliente c = new Cliente();
		conn = Connessione.getConnessione();
		//statement = conn.createStatement();
		ps = conn.prepareStatement(TROVA_UNO);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		
		while (rs.next()) {
			c.setNome(rs.getString(1));
			c.setCognome(rs.getString(2));
			clienti.add(c);
		}
		return c;
	}

	@Override
	public void insert(Cliente c) throws SQLException {
		conn = Connessione.getConnessione();
		ps = conn.prepareStatement(INSERISCI);
		ps.setString(1, c.getNome());
		ps.setString(2, c.getCognome());
		
		int inseriti = ps.executeUpdate();
		
		System.out.println("inseriti " + inseriti + " record");
		
	}

}
