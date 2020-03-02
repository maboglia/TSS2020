package model;

import java.util.Map;

public interface LibroDAO {

	Map<Integer, Libro> getAll();
	Libro getById(int id);
	void insert(Libro l);
	void update(Libro l);
	boolean delete(Libro l);

	
}
