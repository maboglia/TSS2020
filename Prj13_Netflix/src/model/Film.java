package model;

public class Film implements Comparable<Film>{
	
	private String titolo;
	private String regista;
	private Genere genere;
	private int durata;
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getRegista() {
		return regista;
	}
	public void setRegista(String regista) {
		this.regista = regista;
	}
	public Genere getGenere() {
		return genere;
	}
	public void setGenere(Genere genere) {
		this.genere = genere;
	}
	public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}
	public Film(String titolo, String regista, Genere genere, int durata) {
		this.titolo = titolo;
		this.regista = regista;
		this.genere = genere;
		this.durata = durata;
	}
	@Override
	public String toString() {
		return "Film [titolo=" + titolo + ", regista=" + regista + ", genere=" + genere + ", durata=" + durata + "]";
	}
	@Override
	public int compareTo(Film o) {
		return this.titolo.compareTo(o.titolo);
	}
	
	
	

}
