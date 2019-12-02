package model;

public class Studente {

	public int matricola;
	public String nome;
	
	public Studente(int m, String n) {
		this.matricola = m;
		this.nome = n;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "studente " + this.nome + " matr. " + this.matricola;
	}

}
