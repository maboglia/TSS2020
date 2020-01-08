package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProvaByteStream01 {

	public static void main(String[] args) {
		//try with resources:  gli oggetti che istanzio nelle parentesi() verrano automaticamente chiusi
		try  (FileInputStream in = new FileInputStream("files/lisbona_cp.jpg");
			FileOutputStream out = new FileOutputStream("files/lisbona_copia.jpg");)   {
			
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
