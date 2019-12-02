package model;

public class Prodotto implements Comparable<Prodotto> {

	private String nome;
	private double prezzo;
	public String getNome() {
		return nome;
	}

	public Prodotto() {
	}
	
	public Prodotto(String nome, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
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

	@Override
	public String toString() {
		return "Prodotto [nome=" + nome + ", prezzo=" + prezzo + "]";
	}

	@Override
	public int compareTo(Prodotto o) {
		return this.nome.compareTo(o.nome);
	}
	
	
	
}
