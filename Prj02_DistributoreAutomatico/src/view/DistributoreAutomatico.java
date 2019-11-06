package view;

import java.util.Scanner;

import controller.ListaBevande;
import model.Bevanda;

public class DistributoreAutomatico {

	public static void main(String[] args) {
		ListaBevande lb = new ListaBevande();
		lb.riempiLista();
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		System.out.println("scegli bevanda");
		for (Bevanda bev : lb.getBevande()) {
			i++;
			System.out.println(i+") "+bev.getNome() + ": " + bev.getPrezzo());
		}
		
		int scelta = sc.nextInt();
		
		if (scelta < 0 || scelta > lb.getBevande().size()) {
			System.out.println("scelta non corretta reinserire");
			scelta = sc.nextInt();
		
		}
		
		for (int x = 1 ; x<=6; x++) {
			
			if (scelta == x) {
			System.out.println("hai scelto " 
					+ lb.getBevande().get(x-1));

			System.out.println("inserire " 
					+ lb.getBevande().get(x-1).getPrezzo() + " euro");
			
			double denariInseriti = sc.nextDouble();
			
			if (denariInseriti == lb.getBevande().get(x-1).getPrezzo())
				System.out.println("ecco la bevanda");
			else if (denariInseriti > lb.getBevande().get(x-1).getPrezzo())
				System.out.println("ecco la bevanda, "
						+ "" + lb.getBevande().get(x-1).getNome()
						+"il resto è: " 
						+ (denariInseriti - lb.getBevande().get(x-1).getPrezzo()));
			else 
				System.out.println("non bastano...");

			}
		
		
		
		}
	
	}
}
