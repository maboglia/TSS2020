package model;

public class Libro implements Comparable<Libro> {

	private String titolo;
	private String autore;

	public Libro(String titolo, String autore) {
		this.titolo = titolo;
		this.autore = autore;
	}

	public Libro(String titolo) {
		this.titolo = titolo;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}



	public void setAutore(String autore) {
		this.autore = autore;
	}



	@Override
	public int compareTo(Libro o) {
		return this.titolo.compareTo(o.titolo);
	}
	
}
