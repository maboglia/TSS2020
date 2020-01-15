package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import model.Autore;
import model.Libro;

public class Schedario {

	private List<Libro> elencoLibri;
	private Set<Autore> elencoAutori;
	private Set<String> elencoGeneri;
	private Map<Scaffale, List<Libro>> collocazione;
	
	public Libro getLibroById(int id) {
		
		for (Libro l : elencoLibri) {
			if (l.getId()==id)
				return l;
		}
		
		return null;
		
	}
	
	
	public Schedario() {
		elencoLibri = new ArrayList<>();
		elencoAutori = new TreeSet<>();
		elencoGeneri = new TreeSet<>();
		collocazione = new HashMap<>();
	}
	
	public Set<String> getElencoGeneri() {
		return elencoGeneri;
	}

	public void setElencoGeneri(Set<String> elencoGeneri) {
		this.elencoGeneri = elencoGeneri;
	}

	public List<Libro> getElencoLibri() {
		Collections.sort(elencoLibri);
		return elencoLibri;
	}
	public void setElencoLibri(List<Libro> elencoLibri) {
		this.elencoLibri = elencoLibri;
	}
	public Set<Autore> getElencoAutori() {
		return elencoAutori;
	}
	public void setElencoAutori(Set<Autore> elencoAutori) {
		this.elencoAutori = elencoAutori;
	}
	public Map<Scaffale, List<Libro>> getCollocazione() {
		return collocazione;
	}
	public void setCollocazione(Map<Scaffale, List<Libro>> collocazione) {
		this.collocazione = collocazione;
	}
	
	
	
	
	
}
