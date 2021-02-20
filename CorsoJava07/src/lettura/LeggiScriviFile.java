package lettura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class LeggiScriviFile {

	public static void main(String[] args)  {

		try {
			FileReader fr = new FileReader("numeri.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String s = br.readLine();
			String[] numeri = s.split(",");
			
			FileWriter fw = new FileWriter("numeriColonna.txt");
			PrintWriter pw = new PrintWriter(fw);
			
			for (String string : numeri) {
				System.out.println(string);
				pw.println(string);
			}
			
			pw.println();
			pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		

	}
}
