package view;

import controller.LibroMatricola;
import model.Dipendente;
import model.Fattorino;
import model.Impiegato;

public class GestioneDipendenti {

	public static void main(String[] args) {
		
		LibroMatricola lm = new LibroMatricola();
		
		stampa(lm);

		Fattorino f = new Fattorino();
		f.setCognome("paperino");
		f.setNome("paolino");
		f.setnConsegne(1000);
		lm.aggiungiDipendente(f);

		Impiegato i = new Impiegato();
		i.setNome("magic");
		i.setCognome("johnson");
		i.setnOreLav(32);
		lm.aggiungiDipendente(i);
		stampa(lm);
		
		
		
		lm.eliminaDipendente(0);
		
		stampa(lm);
		
		bustaPaga(lm);

	}

	private static void stampa(LibroMatricola lm) {
		System.out.println("--------Libro Matricola---------");
		for (Dipendente d : lm.stampaElenco()) {
			System.out.println(d);
		}
		System.out.println("*********************************");
	}
	
	private static void bustaPaga(LibroMatricola lm) {
		System.out.println("--------Busta Paga---------");
		double totale=0;
		for (Dipendente d : lm.stampaElenco()) {
			System.out.println(d.calcolaStipendio());
			totale += d.calcolaStipendio();
		}
		System.out.println("Spesa totale: " + totale);
		System.out.println("*********************************");
	}

}
