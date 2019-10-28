package view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Prodotto;

public class ListaSpesa {

	 static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		ArrayList<Prodotto> prodotti = new ArrayList<>();
		//System.out.println("quanti prodotti vuoi acquistare?");
		int nProdotti = 1; //sc.nextInt();

		boolean haiFinito = false;
		
		int e = 0;
		
		while(!haiFinito) { //va avanti finché l'utente non preme q
			char scelta = menu();

			switch (scelta) {
			case 'a':
				System.out.println("inserici prodotto");
					Prodotto p = caricaProdotto();
					prodotti.add(p);
				break;
	
			case 'b':
				System.out.println("vuoi eliminare prodotto");
				break;
				
			case 'c':
				System.out.println("stampa i prodotti");
				for (Prodotto prodotto : prodotti) {
					System.out.println(prodotto.getProdotto());
				}			
				break;
				
			case 'q':
				System.out.println("vuoi uscire dal programma");
				haiFinito=true;
				break;
				
			default:
				System.out.println("scelta non disponibile");
				break;
			}
		}
		
		
		System.out.println("programma terminato");
	}

	private static Prodotto caricaProdotto() {
		
		
		System.out.println("nome prodotto: ");
		String nome = sc.nextLine();
		
		System.out.println("q.ta prodotto: ");
		String prodotto = sc.nextLine();
		
		Prodotto p = new Prodotto(nome, prodotto);
		return p;
	}
	
	public static char menu() {
		
		String s = null;
		String acapo = "\n";
		s = "******************";
		s += acapo;
		s += "a) inserisci prodotto";
		s += acapo;
		s += "b) elimina prodotto";
		s += acapo;
		s += "c) stampa elenco prodotti";
		s += acapo;
		s += "q) esci dal programma";
		s += acapo;
		s += "******************";
		
		System.out.println(s);
		
		char scelta = sc.nextLine().charAt(0);
		
		return scelta;
		
	}
	
}
