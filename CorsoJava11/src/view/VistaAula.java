package view;

import java.util.List;
import java.util.function.Consumer;

import mappe.Registro;
import model.Studente;

public class VistaAula {

	public static void main(String[] args) {

		double mediaEta = 0;
		
		//stampo registro (paradigma imperativo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!)
		System.out.println("----------------REGISTRO-----------------");
		for (Integer matricola : Registro.getAll().keySet()) {
			System.out.println(Registro.getById(matricola));
			mediaEta += Registro.getById(matricola).getEta();
		}
		
		System.out.println("età media " + (  mediaEta/Registro.getAll().size()  ));
	
	
		//stampo elenco studenti ordinato per cognome
		System.out.println("----------------COGNOME-----------------");
		for (Studente studente : Registro.getAllByCognome()) {
			System.out.println(studente);
		}
	
	
		//stampo elenco studenti ordinato per eta
		
		System.out.println("----------------ETA-----------------");
		for (Studente studente : Registro.getAllByEta()) {
			System.out.println(studente);
		}
		
		
		
		//stampo elenco studenti ordinato per eta
		
		System.out.println("----------------Filtro su età-----------------");
		for (Studente studente : Registro.getAllByEta(25)) {
			System.out.println(studente);
		}
		
		
		System.out.println("----------------Functional way!-----------------");

		Registro.getAllByCognome().forEach(System.out::println);
		
		
		System.out.println("----------------Filtro su età functional-----------------");
		Registro.getAllByCognome()
			.stream()
			.filter(s -> s.getEta() > 25)
			.sorted()
//			.filter(s -> s.getNome().startsWith("P"))
			.forEach(System.out::println);
		
		
		
	
	}
	
	
	
	
	

}
