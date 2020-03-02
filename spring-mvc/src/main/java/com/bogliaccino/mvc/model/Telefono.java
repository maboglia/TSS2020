package com.bogliaccino.mvc.model;

public class Telefono {

	private double dimSchermo;
	private double batteria;
	private int memoria;
	private String marca;
	private String modello;
		
	public Telefono(double dimSchermo, double batteria, int memoria, String marca, String modello) {
		this.dimSchermo = dimSchermo;
		this.batteria = batteria;
		this.memoria = memoria;
		this.marca = marca;
		this.modello = modello;
	}
	public double getDimSchermo() {
		return dimSchermo;
	}
	public void setDimSchermo(double dimSchermo) {
		this.dimSchermo = dimSchermo;
	}
	public double getBatteria() {
		return batteria;
	}
	public void setBatteria(double batteria) {
		this.batteria = batteria;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	
	
}
