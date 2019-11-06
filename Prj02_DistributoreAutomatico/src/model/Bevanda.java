package model;

public class Bevanda {

	private String nome;
	private double prezzo;
	
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

	/**
	 * 
	 * @param nome - Nome della bevanda da caricare sul menu
	 * @param prezzo - Prezzo della bevanda da caricare sul menu
	 */
	public Bevanda(String nome, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
		//System.out.println("bevanda costruita");
	}

	@Override
	public String toString() {
		return "Bevanda [nome=" + nome + ", prezzo=" + prezzo + "]";
	}
	
	
	
}
