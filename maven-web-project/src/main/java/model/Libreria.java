package model;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

	public static List<Libro> scaffale = new ArrayList<>();
	
	static {
		Libro l = new Libro();
		Libro l1 = new Libro();
		Libro l2 = new Libro();

		l.setAutore("Camilleri");
		l.setTitolo("Il campo del vasaio");
		l.setnPagine(120);
		
		l1.setTitolo("Guerra e pace");
		l1.setAutore("Tolstoj");
		l1.setnPagine(200);
		
		l2.setTitolo("Io robot");
		l2.setAutore("Asimov");
		l2.setnPagine(300);
		
		scaffale.add(l);
		scaffale.add(l1);
		scaffale.add(l2); 
	}
	
	
	
	
	
}
