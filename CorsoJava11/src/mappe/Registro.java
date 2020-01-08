package mappe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import model.Studente;

public class Registro {

	private static Map<Integer, Studente> registroMappa = new HashMap<>();
	
	static {

		registroMappa.put(1, new Studente("EUGENIO","ALOI", 1992));
		registroMappa.put(2, new Studente("PIERO","BAGLIVO", 1993));
		registroMappa.put(4, new Studente("ROBERTO","BELLARDI GIOLI", 1994));
		registroMappa.put(5, new Studente("CHIARA","BUSINARO", 1992));
		registroMappa.put(6, new Studente("MATTEO","CALFA", 1997));
		registroMappa.put(77, new Studente("OANA VIORICA","CERBU", 1992));
		registroMappa.put(8, new Studente("LAURA","CONTI", 1994));
		registroMappa.put(9, new Studente("JAVIER","DE LA FUENTE", 1996));
		registroMappa.put(10, new Studente("MIHAI","FEDOT", 1995));
		registroMappa.put(11, new Studente("AHMED","HABOULA", 1995));
		registroMappa.put(12, new Studente("BIAGIO","INGUSCI", 1994));
		registroMappa.put(13, new Studente("MATTIA","ISOLDI", 1997));
		registroMappa.put(14, new Studente("ANDREA EDSON","LORENZONI", 1993));
		registroMappa.put(15, new Studente("FEDERICA","LUISE", 1990));
		registroMappa.put(17, new Studente("MARIARITA","MASIA", 1993));
		registroMappa.put(18, new Studente("MATTIA","MONTENEGRO", 1994));	

		
	}

	public static Map<Integer, Studente> getAll() {
		return registroMappa;
	}
	
	public static Studente getById(int id) {
		return registroMappa.get(id);
	}
	
	public static List<Studente> getAllByCognome() {
		
		List<Studente> ss = new ArrayList<Studente>(registroMappa.values());
		Collections.sort(ss);
				
		return ss;
	}
	
	public static List<Studente> getAllByEta(){
		List<Studente> ss = new ArrayList<Studente>(registroMappa.values());
		Comparator<Studente> comp = new Comparator<Studente>() {

			@Override
			public int compare(Studente o1, Studente o2) {
				return o1.getEta() - o2.getEta();
			}
		};
		Collections.sort(ss, comp);
				
		return ss;
		
	}

	public static List<Studente> getAllByEta(int limite) {
		List<Studente> ss = new ArrayList<Studente>(registroMappa.values());
		List<Studente> ss2 = new ArrayList<Studente>();
		Comparator<Studente> comp = new Comparator<Studente>() {

			@Override
			public int compare(Studente o1, Studente o2) {
				return o1.getEta() - o2.getEta();
			}
		};
		Collections.sort(ss,     (o1, o2) -> o1.getEta() - o2.getEta()    );
		int id = 0;
		
		Iterator<Studente> it = ss.iterator();
		
		while (it.hasNext()) {
			Studente studente = (Studente) it.next();
			if (studente.getEta() < limite)
				ss2.add(studente);
		}
		
		return ss2;

	}
}
