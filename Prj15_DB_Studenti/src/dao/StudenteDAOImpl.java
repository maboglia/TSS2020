package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.Connessione;
import model.Studente;

public class StudenteDAOImpl implements StudenteDAO {

	Connection conn = null;
	Statement statement = null;
	ResultSet rs = null;
	Connessione c = new Connessione();
	List<Studente> studenti = new ArrayList<>();
	
	
	@Override
	public List<Studente> getAll() throws SQLException {

		conn = c.getConnessione();
		statement = conn.createStatement();
		rs = statement.executeQuery(TROVA_TUTTI);
		
		while(rs.next()) {
			studenti.add(new Studente( rs.getInt(1), rs.getString(2), rs.getString(3)  ));
		}
		
		return studenti;
	}

	@Override
	public void addStudent(Studente s) throws SQLException {
		conn = c.getConnessione();
		statement = conn.createStatement();	
		
		
	}

	@Override
	public void deleteStudent(Studente s) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(Studente s) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
