package eccezioni;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		int a=0, b=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci 2 interi");
		
		try {
		 a = sc.nextInt();
		 b = sc.nextInt();
		if (b == 0) throw new EccezionePersonalizzata("0 non va bene come valore di b");
		
		}
		catch(EccezionePersonalizzata e) {
			System.out.println(e.getMessage());
			b=1;
		}
		catch(InputMismatchException e) {
			System.out.println("non hai inserito il formato corretto");
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("a vale "+ a );
		System.out.println("b vale "+ b );
		
	}
	
	
}
