package esempi;

import java.util.ArrayList;

public class GiocaDadi {

	public static void main(String[] args) {
		
		Dado d1 = new Dado();
		Dado d2 = new Dado();
		
		ArrayList<Integer> successi = new ArrayList<Integer>();
		
		final int LANCI = 100_000;
		
		for (int i = 0; i < LANCI; i++) {
			
			int dado1 = d1.lancia();
			int dado2 = d2.lancia();
			
			if (dado1 == dado2) {
				successi.add(dado1);
			}
		}
		
		double perc =  (double) successi.size() / LANCI ;
		System.out.println("% successi" + perc);
		
		for (Integer integer : successi) {
			System.out.println("coppia di " + integer);
		}
		

	}

}
