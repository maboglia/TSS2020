package model;

public class Dado {

	//stato interno
	private String colore;
	private int nFacce;
	private int valoreDado;
	
	public int getValoreDado() {
		return valoreDado;
	}
	
	//costruttore dado
	public Dado(String colore, int nFacce) {
		this.colore=colore;
		this.nFacce = nFacce;
	}
	
	public int lancia() {
		
		this.valoreDado=(int)(Math.random() * this.nFacce) + 1;
		return this.valoreDado;
	}
	
}
