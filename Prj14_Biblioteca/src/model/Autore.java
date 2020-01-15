package model;

import java.util.List;

public class Autore implements Comparable<Autore> {

	private String nome;
	private List<Libro> libri;
	
	public Autore(String nome, List<Libro> libri) {
		this.nome = nome;
		this.libri = libri;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Libro> getLibri() {
		return libri;
	}
	public void setLibri(List<Libro> libri) {
		this.libri = libri;
	}
	@Override
	public int compareTo(Autore o) {
		
		return this.getNome().compareTo(o.getNome());
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getNome().toUpperCase();
	}
	
}
