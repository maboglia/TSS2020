package model;

public class Studente {

	private String nome, cognome;
	private int nMat;
	private static int matricola=0;

	private static int immatricolatore() {
		return matricola += 1;
	}
	
	public Studente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.nMat = immatricolatore();
	}
	
	public Studente(String cognome) {
		this.cognome = cognome;
		this.nMat = immatricolatore();		
	}
	
	public Studente() {
		this.nMat = immatricolatore();
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

	public int getnMat() {
		return nMat;
	}

	@Override
	public String toString() {
		return nMat +") " + nome + " - " + cognome;
	}
	
}
