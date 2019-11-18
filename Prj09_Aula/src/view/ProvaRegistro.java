package view;

import java.util.Scanner;

import controller.Registro;
import model.Studente;

public class ProvaRegistro {

	public static void main(String[] args) {

		Registro r = new Registro();
		
		for (Studente studente : r.faiAppello()) {
			String risposta = getInput("E' presente " + studente+"?\nRispondere s/n");
		
		if (risposta.equalsIgnoreCase("s"))
			r.aggiungiPresente(studente);
		else
			r.aggiungiAssente(studente);
		
		}

		System.out.println("Sono presenti " + r.getPresenti().size() + "studenti");
		System.out.println("Sono assenti " + r.getAssenti().size() + "studenti");
		
		System.out.println("PRESENTI");
		for (Studente s : r.getPresenti()) {
			System.out.println(s);
		}
		
		System.out.println("ASSENTI");
		for (Studente s : r.getAssenti()) {
			System.out.println(s);
		}
		
	}

	private static String getInput(String domanda) {
		String risposta = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(domanda);
		risposta = sc.next();

		return risposta;
		
	}
	
	
}
