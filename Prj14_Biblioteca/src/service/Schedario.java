package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import model.Libro;

public class Schedario {

	private List<Libro> elencoLibri;
	private Set<String> elencoAutori;
	private Map<Scaffale, List<Libro>> collocazione;
	
	public Schedario() {
		elencoLibri = new ArrayList<>();
		elencoAutori = new TreeSet<>();
		collocazione = new HashMap<>();
	}
	
	public List<Libro> getElencoLibri() {
		Collections.sort(elencoLibri);
		return elencoLibri;
	}
	public void setElencoLibri(List<Libro> elencoLibri) {
		this.elencoLibri = elencoLibri;
	}
	public Set<String> getElencoAutori() {
		return elencoAutori;
	}
	public void setElencoAutori(Set<String> elencoAutori) {
		this.elencoAutori = elencoAutori;
	}
	public Map<Scaffale, List<Libro>> getCollocazione() {
		return collocazione;
	}
	public void setCollocazione(Map<Scaffale, List<Libro>> collocazione) {
		this.collocazione = collocazione;
	}
	
	
	
	
	
}
