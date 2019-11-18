package model;

public abstract class Figura {

	public String nomeCamera = "";
	public abstract double area();
	
	public Figura(String nome) {
		this.nomeCamera = nome;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nomeCamera + ": " + this.area();
	}
	
	
}
