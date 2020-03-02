package model;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class Agenda {

//Nested class
class Giorno {
	   private Impegno[] giorno = new Impegno[10];

	public Impegno[] getGiorno() {
		return giorno;
	}

	public void setGiorno(Impegno[] giorno) {
		this.giorno = giorno;
	}   
	}
	
	private Giorno[] settimana = new Giorno[] {
			new Giorno(),
			new Giorno(),
			new Giorno(),
			new Giorno(),
			new Giorno()
	};
	
	public void definisci(String argomento, String luogo, int priorita, int ora, int dayWeek) {
		
		Impegno i = new Impegno(argomento, luogo, priorita);
		settimana[dayWeek].getGiorno()[ora] = i;
		
	}
	
	
	
	public String[][] visualizza() {
		
		//10 righe, 5 colonne
		String[][] stampa = new String[5][10];
		
		int	colonna = 0;
		for (Giorno giorno : settimana) {
			int riga = 0;
			for (Impegno impegno : giorno.getGiorno()) {
				
				stampa[colonna][riga] = (impegno != null)?impegno.toString():"---";
				if(riga < 9)
				riga++;
			}
			colonna++;
		}
		return stampa;
	}
}
