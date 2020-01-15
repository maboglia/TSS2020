package model;

import java.util.List;

public class Libro implements Comparable<Libro> {

	private int id;
	private String titolo;
	private List<Autore> autore;
	private String genere;
	private static int contatore = 0;
	private boolean inPrestito = false;
	
	public boolean isInPrestito() {
		return inPrestito;
	}

	public void setInPrestito(boolean inPrestito) {
		this.inPrestito = inPrestito;
	}

	public static void resetta() {
		contatore = 0;
	}
	
	public int getId() {
		return id;
	}
	
	public Libro(String titolo, List<Autore> autore, String genere) {
		contatore++;
		this.titolo = titolo;
		this.autore = autore;
		this.genere = genere;
		this.id = contatore;
	}
	
	public Libro(String titolo) {
		this.titolo = titolo;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public List<Autore> getAutore() {
		return autore;
	}



	public void setAutore(List<Autore> autore) {
		this.autore = autore;
	}



	@Override
	public int compareTo(Libro o) {
		return this.titolo.compareTo(o.titolo);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.titolo + " " +this.autore + " " + this.genere;
	}
	
}
