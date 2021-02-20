package lettura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LeggiFile {

	public static void main(String[] args)  {
		
		int somma = 0;
		int counter = 0;
		File mioFile = new File("numeri.txt"); 
		try {
			Scanner sc = new Scanner(mioFile);
			
			while(sc.hasNext()) {
				counter++;
				somma += Integer.parseInt(sc.next());
				
				System.out.println(somma);
			}
		} catch (FileNotFoundException e) {
			System.out.println("404: file not found :)");
			//e.printStackTrace();
		} finally {
			//questa istruzione sar� eseguita in ogni caso
			System.out.println(somma/counter);
		}
	}
}
