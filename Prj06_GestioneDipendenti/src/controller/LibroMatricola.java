package controller;

import java.util.ArrayList;

import model.Dipendente;

public class LibroMatricola {
	
	/**
	 * field dipendenti dichiarato ed incapsulato
	 */
	private ArrayList<Dipendente> dipendenti;
	
	public LibroMatricola() {

		//inizializzo l'oggetto al
		this.dipendenti= new ArrayList<Dipendente>();
		this.init();
	}
	
	private void init() {
		
		this.dipendenti.add(new Dipendente("giuseppe", "verdi"));
		this.dipendenti.add(new Dipendente("marco", "polo"));
		this.dipendenti.add(new Dipendente("cristoforo", "colombo"));
	
	}
	/**
	 * Questo metodo aggiunge un dipendente alla collezione
	 * @param d - passare in argomento un dipendente d costruito all'esterno
	 */
	public void aggiungiDipendente(Dipendente d) {
		
		this.dipendenti.add(d);
	}
	
	public ArrayList<Dipendente> stampaElenco(){
		return this.dipendenti;
	} 
	
	public void eliminaDipendente(int i) {
		this.dipendenti.remove(i);
	}
}
