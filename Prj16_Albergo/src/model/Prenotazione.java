package model;

public class Prenotazione {

	private int nGiorni; 
	private int nPersone; 
	private final double COSTO_GG = 50.0; 
	private double costoTot = 0;
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double calcolaPreventivo() {
		
		if (nPersone < 3) {
			costoTot =  nPersone * COSTO_GG * nGiorni;
		} else {
			costoTot = (nPersone-1) * COSTO_GG * nGiorni;
		}
		
		return costoTot;
	}

	public int getnGiorni() {
		return nGiorni;
	}

	public void setnGiorni(int nGiorni) {
		this.nGiorni = nGiorni;
	}

	public int getnPersone() {
		return nPersone;
	}

	public void setnPersone(int nPersone) {
		this.nPersone = nPersone;
	}
	
}
