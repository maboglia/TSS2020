package view;

import controller.Gioco;
import model.Dado;

public class GiocoDadi {
	public static void main(String[] args) {
		
		Gioco gioco = new Gioco();
		long start = System.currentTimeMillis();
		String s = gioco.gioca(100_000_000);
		System.out.println(s);
		System.out.println("coppie di 1: "+gioco.getC1().size());
		System.out.println("coppie di 2: "+gioco.getC2().size());
		System.out.println("coppie di 3: "+gioco.getC3().size());
		System.out.println("coppie di 4: "+gioco.getC4().size());
		System.out.println("coppie di 5: "+gioco.getC5().size());
		System.out.println("coppie di 6: "+gioco.getC6().size());
		long stop = System.currentTimeMillis();
		System.out.println(stop-start);
	}
}
