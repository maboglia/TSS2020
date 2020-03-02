package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Libro implements Comparable<Libro>, Serializable {

	private String titolo, autore;
	private int nPagine;
	
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public int getnPagine() {
		return nPagine;
	}
	public void setnPagine(int nPagine) {
		this.nPagine = nPagine;
	}
	
	public static void main(String[] args) {
		Libro l1 = new Libro();
		Libro l2 = new Libro();
		l1.setTitolo("Guerra e pace");
		l1.setAutore("Tolstoj");
		l1.setnPagine(200);
		l2.setTitolo("Io robot");
		l2.setAutore("Asimov");
		l2.setnPagine(300);
		
		List<Libro> scaffale = new ArrayList<>();
		
		scaffale.add(l1);
		scaffale.add(l2);
		
		Collections.sort(scaffale);
		//scaffale.forEach(System.out::println);
		
		Comparator<Libro> c = new Comparator<Libro>() {

			@Override
			public int compare(Libro o1, Libro o2) {
				return o1.getAutore().compareTo(o2.getAutore());
			}
		};
		
		//ordino per autore
		Collections.sort(scaffale, c);
		//scaffale.forEach(System.out::println);

		//ordino per numero pagine
		Collections.sort(scaffale,    (o1, o2) -> o1.getnPagine()-o2.getnPagine()    );
		scaffale.forEach(System.out::println);

	}
	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		return this.titolo.compareTo(o.titolo);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.titolo + " " + this.autore + " " + this.nPagine;
	}
	
}
