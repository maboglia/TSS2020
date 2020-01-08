package view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ProvaLeggiScriviNIO {

	public static void main(String[] args) {
		
		Path sorgente = Paths.get("files", "divina.txt");
		Path destinazione = Paths.get("copie", "divina.txt");
		
		try {
			Files.copy(sorgente, destinazione);
			System.out.println("tutto ok");
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		

	}

}
