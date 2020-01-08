package model;

import java.time.LocalDate;

public abstract class Animale {
	
	private String nome;
	private double prezzo;
	private LocalDate dataNascita;
	private boolean soddisfazione;
	
	
	
	public void setSoddisfazione(boolean soddisfazione) {
		this.soddisfazione = soddisfazione;
	}

	public boolean getSoddisfazione() {
		return this.soddisfazione;
	}
	
	public abstract void mangia(Commestibile c);
	public abstract boolean isSoddisfatto(boolean b);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public LocalDate getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}
	@Override
	public String toString() {
		return "Animale [nome=" + nome + " felice: "  + this.getSoddisfazione() + "]";
	}
	
	public void scappa(Animale a) {
			System.out.println("Io non scappo!!!");
	}
	

}
