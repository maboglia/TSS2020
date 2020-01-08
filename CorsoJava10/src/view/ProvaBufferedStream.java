package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProvaBufferedStream {

	public static void main(String[] args) {
		
		try(
				BufferedReader in = new BufferedReader( new FileReader("files/divina.txt"));
				BufferedWriter out =new BufferedWriter( new FileWriter("files/divina_copia.txt"));
				
				) {
			
		int c;
			
			while ( ( c = in.read() ) != -1  ) {
				out.write(c);
			}
			System.out.println("tutto okkkkei");
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	
	
	
	}

}
