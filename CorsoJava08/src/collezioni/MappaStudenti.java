package collezioni;

import java.util.HashMap;
import java.util.Map;

import model.Studente;

public class MappaStudenti {

	public static void main(String[] args) {
		
		Studente s1 = new Studente(1, "Andrea");
		Studente s2 = new Studente(2, "Federica");
		Studente s3 = new Studente(3, "Roberto");
		
		Map<Integer, Studente> studenti = new HashMap<>();
		
		studenti.put(s1.matricola, s1);
		studenti.put(s2.matricola, s2);
		studenti.put(s3.matricola, s3);
		
		System.out.println(studenti.get(2));
		
		
	}

}
