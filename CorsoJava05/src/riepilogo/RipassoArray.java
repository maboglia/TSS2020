package riepilogo;

import java.util.Random;

public class RipassoArray {

	public static void main(String[] args) {

		int[] voti = new int[5];
		
		int somma = 0;
		
		Random casuale = new Random();
		
		for (int i = 0; i < voti.length; i++) {
			voti[i] = casuale.nextInt(12)+18;
		}

		for (int voto : voti) {
			somma += voto;
			System.out.println(voto);
		}
		
		double media = (double) somma / voti.length;
		
		System.out.println(media);
		System.out.println(media/3*11);
	}

}
