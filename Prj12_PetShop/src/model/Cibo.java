package model;

public class Cibo implements Commestibile {

	private String nome;
	private double quantita;
	
	@Override
	public boolean isMorto(boolean b) {
		return false;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getQuantita() {
		return quantita;
	}

	public void setQuantita(double quantita) {
		this.quantita = quantita;
	}


	
	
	
}
