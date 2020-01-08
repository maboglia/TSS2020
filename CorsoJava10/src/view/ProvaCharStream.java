package view;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProvaCharStream {

	public static void main(String[] args) {
		
		try(
				FileReader in = new FileReader("files/divina.txt");
				FileWriter out = new FileWriter("files/divina_copia.txt");
				
				) {
			
		int c;
			
			while ( ( c = in.read() ) != -1  ) {
				out.write(c);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	
	
	
	}

}
