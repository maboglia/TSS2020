package dao;

import java.sql.SQLException;
import java.util.List;

import model.Cliente;

public interface ClienteDAO {
	
	String TROVA_TUTTI = "select nome,cognome from cliente";
	String TROVA_UNO = "select nome,cognome from cliente where cliente_id=?";
	String INSERISCI = "insert into cliente (nome,cognome) values (?,?)";

	List<Cliente> clientiAll() throws SQLException;
	Cliente findById(int id) throws SQLException;
	void insert(Cliente c) throws SQLException;
}
