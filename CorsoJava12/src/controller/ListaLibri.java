package controller;

import service.LibriService;

public class ListaLibri {

	
	public static void main(String[] args) {
		LibriService servizio = new LibriService();
		for (int i = 0; i < servizio.libri.size(); i++) {
			System.out.println(servizio.libri.get(i).getTitolo());
		}
		
		servizio.libri
			.stream()
			.filter(l->l.getTitolo().startsWith("G"))
			.filter(l->l.getTitolo().endsWith("a"))
			.forEach(libro -> System.out.println(libro));
		
		
	}
	
	
}
