package calcolatrice.statica;

import java.util.Scanner;

public class InterfacciaUtente {

	static Scanner sc = new Scanner(System.in);
	
	static double[] chiediDueNumeri() {
		System.out.println("Inserisci 2 numeri decimali");
		
		double[] addendi = new double[2];
		
		addendi[0]=sc.nextDouble();
		addendi[1]=sc.nextDouble();
		
		return addendi;
	}
	
	
}
