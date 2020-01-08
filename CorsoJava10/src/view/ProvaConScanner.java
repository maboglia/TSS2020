package view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ProvaConScanner {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(new BufferedReader( new FileReader("files/divina.txt")));
				){
			sc.useDelimiter(" ");
			while (sc.hasNext()) {
				System.out.println(""+sc.next());
			}
			System.out.println("ok");
			
			
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		
		

	}

}
