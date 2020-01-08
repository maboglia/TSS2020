package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LeggiFileSuArrayList {

	public static void main(String[] args) {


		Path sorgente = Paths.get("files/divina.txt");
		
		Charset setCaratteri = Charset.forName("Cp1252");
		
		List<String> divina = new ArrayList<>();
		
		try(BufferedReader br = Files.newBufferedReader(sorgente, setCaratteri);){
			
			String linea = null;
			while (  ( linea = br.readLine()  )  != null ) {
				if (!linea.trim().equals(""))
					divina.add(linea);
			}
			System.out.println("tutto ok");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("la divina contiene " + divina.size() + " righe");
		for (String string : divina) {
			System.out.println(string);
		}
		
		
	}

}
