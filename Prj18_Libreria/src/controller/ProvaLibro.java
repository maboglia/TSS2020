package controller;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import model.Libro;
import model.LibroDAOImpl;

public class ProvaLibro {

	public static void main(String[] args) {
		LibroDAOImpl libri = new LibroDAOImpl();
		Map<Integer, Libro> mappa = libri.getAll();
		
		System.out.println(mappa.get(5));
		
		Collection<Libro> valoriMappa = mappa.values();

		//this is functional programming in java!
		//valoriMappa.forEach(System.out::println);
		
		Libro l = libri.getById(5);
		System.out.println(l);
		
		Libro nuovo = new Libro(24, "Guerra e pace");
		libri.insert(nuovo);
		nuovo.setTitolo("Guerra o pace?");
		libri.update(nuovo);
		if (libri.delete(nuovo))
			System.out.println("libro eliminato con successo");;
		
	}

}
