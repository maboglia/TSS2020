package programma;

import java.util.Scanner;

public class SommaPariDispari {

	public static void main(String[] args) {

		/* Dato un numero X 
		 * sommarlo a Y se X è pari 
		 * sommarlo a Z se X è dispari 
		*
		*/

		int x, y, z, risultato;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("inserisci il valore di x");
		x = input.nextInt(); //qui ricevo il valore di x e devo determinare se pari o dispari

		System.out.println("inserisci il valore di y");
		y = input.nextInt();
		
		System.out.println("inserisci il valore di z");
		z = input.nextInt();

		
		
		if (  (x % 2)  == 0    ) {
			System.out.println("x è divisibile per 2, quindi è pari");
			risultato = x + y;
			
		} else {
			System.out.println("x NON è divisibile per 2, quindi è dispari");
			risultato = x + z;
		}
		
		System.out.println("il risultato è: ");
		System.out.println(risultato);
		
		
	}

}
