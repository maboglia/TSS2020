package dao;

import java.sql.SQLException;
import java.util.List;

import model.Studente;

public interface StudenteDAO {

	String TROVA_TUTTI = "select studente_id, nome, cognome from studente";
	
	List<Studente> getAll() throws SQLException;
	void addStudent(Studente s) throws SQLException;
	void deleteStudent(Studente s) throws SQLException;
	void updateStudent(Studente s) throws SQLException;
	
	
}
