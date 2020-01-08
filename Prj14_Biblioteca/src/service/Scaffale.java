package service;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import model.Libro;

public class Scaffale {

	private final int CAPIENZA = 10;
	private int numero;
	
	public Scaffale(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCAPIENZA() {
		return CAPIENZA;
	}
	//25 dollars term 
	public static void riempiScaffali  (Schedario _schedario) {

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
			
			Libro l = new Libro(titolo, autore);
			schedario.getElencoLibri().add(l);
			schedario.getElencoAutori().add(autore);
			
			
			System.out.println(riga +"-" + splitto[0]);
//			if (riga == 500) break;
		}
		
		
	}
	public static void main(String[] args) {
		Schedario _schedario = new Schedario();
		riempiScaffali(_schedario);
	}
}
