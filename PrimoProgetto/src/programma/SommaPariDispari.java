package programma;

import java.util.Scanner;

public class SommaPariDispari {

	public static void main(String[] args) {

		/* Dato un numero X 
		 * sommarlo a Y se X � pari 
		 * sommarlo a Z se X � dispari 
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
			System.out.println("x � divisibile per 2, quindi � pari");
			risultato = x + y;
			
		} else {
			System.out.println("x NON � divisibile per 2, quindi � dispari");
			risultato = x + z;
		}
		
		System.out.println("il risultato �: ");
		System.out.println(risultato);
		
		
	}

}
