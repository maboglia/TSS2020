package mappe;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Regione implements Comparable<Regione>{
	
	String nome;
	String capoluogo;
	int abitanti;
	
	public Regione(String nome, String capoluogo, int abitanti) {
		this.nome = nome;
		this.capoluogo = capoluogo;
		this.abitanti = abitanti;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "regione: " + this.nome.toUpperCase() +
				" capoluogo: " + this.capoluogo.toUpperCase() + 
				" abitanti: " + this.abitanti * 10_000;
	}
	@Override
	public int compareTo(Regione o) {
		// TODO Auto-generated method stub
		if (this.abitanti - o.abitanti != 0 )
		return this.abitanti - o.abitanti;
		else 
		return this.nome.compareTo(o.nome);
	}
}

public class Mappa1 {

	public static void main(String[] args) {
	
		//    key     value
		Map<Regione, String> capoluoghi = new TreeMap<>();
		capoluoghi.put(new Regione("piemonte", "torino", 400),"torino");
		capoluoghi.put(new Regione("Lombardia", "milano", 900),"milano");
		capoluoghi.put(new Regione("Campania", "napoli", 400),"napoli");
		
//		System.out.println(capoluoghi.get("piemonte"));
//		
//		capoluoghi.put("piemonte", "cuneo");
//		System.out.println(capoluoghi.get("piemonte"));
		
		Set<Regione> regioni = capoluoghi.keySet();

		for (Regione regione : regioni) {
			System.out.println(regione);
		}
		
		int[] numeri = {1,3,2,4,5,7};
		
		//IMPERATIVO!!!!!!!!!!
		for (int i = 0; i < 6; i++) {
			System.out.println(numeri[i]);
		}
		for (int i : numeri) {
			System.out.println(i);
		}
		
		//funzionale
		Collection<String> citta = capoluoghi.values();

		
		citta.stream()
			.filter(c -> c.startsWith("t"))//operazioni intermedie
			.forEach(c -> System.out.println(c)); //operazione terminale
		
		
		

		
	}

}
