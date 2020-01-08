package model;

import java.time.LocalDate;

public class Studente implements Comparable<Studente> {

	private int matricola;
	private String nome;
	private String cognome;
	private int eta;
	private LocalDate dataNascita;
	private static int counter = 0;
	
	
	
	public Studente(String nome, String cognome, int anno) {
		counter++;
		this.matricola = counter;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = LocalDate.of(anno, 1, 1);
		this.calcolaEta();
	}

	public void calcolaEta() {
		this.eta = 2019 - this.dataNascita.getYear();
		
	}
	
	public int getEta() {
		return eta;
	}
	
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.matricola+") "+ this.nome + " " + this.cognome + " " + this.eta;
	}

	@Override
	public int compareTo(Studente altro) {
		
		return this.cognome.compareTo(altro.cognome);
		
	}

}
