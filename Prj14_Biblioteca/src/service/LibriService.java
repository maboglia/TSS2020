package service;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import model.Autore;
import model.Libro;

public class LibriService {
	//25 dollars term 
	public static void init(Schedario _schedario) {

		Libro.resetta();
		
		Scanner sc;
		Schedario schedario = _schedario;
		
		
		InputStreamReader br = new InputStreamReader
				(Scaffale.class.getResourceAsStream("/elenco_libri.CSV"));
		
		
		sc = new Scanner(br);
		int riga = 0;
		while (sc.hasNextLine()) {
			riga++;
			String string = (String) sc.nextLine();
			String[] splitto = string.split(";");
			
			
			
			String titolo = splitto[0];
			String autore = splitto[1];
			String genere = (splitto.length > 2) ? splitto[2] : "";
			
			
			List<Autore> autori = Arrays.asList(new Autore(autore, null));
			
			
			Libro l = new Libro(titolo, autori, genere);
			schedario.getElencoLibri().add(l);
			schedario.getElencoGeneri().add(genere);
			schedario.getElencoAutori().add(new Autore(autore, null));
			
			
			System.out.println(riga +"-" + splitto[0]);
//			if (riga == 500) break;
		}
		
		
	}
}
