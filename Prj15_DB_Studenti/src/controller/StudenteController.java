package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.StudenteDAOImpl;
import model.Studente;

public class StudenteController {

	public List<Studente> studenti = new ArrayList<>();
	StudenteDAOImpl std = new StudenteDAOImpl();
	
	public List<Studente> getAll() throws SQLException{
		
		studenti = std.getAll();
		return this.studenti;
	}
	
	
	
	
}
