package calcolatrice;

import java.util.Scanner;

public class MiniCalcolatrice {

	public static void main(String[] args) {
		
		double a=0, b=0, risultato = 0;
		
		double num1 = Double.parseDouble(getInput("inserisci il primo numero"));
		double num2 = Double.parseDouble(getInput("inserisci il secondo numero"));
		String operazione = getInput("inserisci l'operatore aritmetico\n"
				+ "scegli tra: +, -, *, /");
		
		if (operazione.equals("+"))
			risultato = addizione(num1, num2);
		else if (operazione.equals("-"))
			risultato = sottrazione(num1, num2);
		else if (operazione.equals("*"))
			risultato = moltiplicazione(num1, num2);
		else if (operazione.equals("/"))
			risultato = divisione(num1, num2);
		else
			System.out.println("non ho capito....");
		
		if (true) {
			System.out.println("il risultato è: " + risultato);
		}
		
		System.out.println("grazie per aver usato i prodotti della"
				+ " Next Level MIHAI software corp.");
	}
	
	public static String getInput(String s) {
		
		System.out.println(s);
		Scanner scan = new Scanner(System.in);
		
		String risposta = scan.next();
		
		return risposta;
		
	}
	
	public static double addizione(double numero1, double numero2) { 
		return numero1 + numero2;
	}
	public static double sottrazione(double numero1, double numero2) { 
		return numero1 - numero2;
	}
	public static double moltiplicazione(double numero1, double numero2) { 
		return numero1 * numero2;
	}
	public static double divisione(double numero1, double numero2) { 
		return numero1 / numero2;
	}
	

}
