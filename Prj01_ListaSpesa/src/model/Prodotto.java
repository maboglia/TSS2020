package model;

public class Prodotto {

	private String nome, quantita;

	public Prodotto(String nome, String quantita) {
		this.nome = nome;
		this.quantita = quantita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getQuantita() {
		return quantita;
	}

	public void setQuantita(String quantita) {
		this.quantita = quantita;
	}
	
	public String getProdotto(){
		return this.nome.toUpperCase()  + ": " +this.quantita;
	}
	
	
}
