package model;

public class Studente {

	private long studente_id;
	private String nome, cognome, indirizzo, citta;
	private char genere;
	
	public Studente() {
		// TODO Auto-generated constructor stub
	}

	public Studente(long studente_id, String nome, String cognome, String indirizzo, String citta, char genere) {
		this.studente_id = studente_id;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.citta = citta;
		this.genere = genere;
	}

	public long getStudente_id() {
		return studente_id;
	}

	public void setStudente_id(long studente_id) {
		this.studente_id = studente_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public char getGenere() {
		return genere;
	}

	public void setGenere(char genere) {
		this.genere = genere;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome + "  " + this.cognome.toUpperCase();
	}
	
	
}
