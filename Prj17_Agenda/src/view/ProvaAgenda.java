package view;

import model.Agenda;

public class ProvaAgenda {

	public static void main(String[] args) {
		
		Agenda provaAgenda = new Agenda();
		provaAgenda.definisci("tagliarmi i capelli", "Coppola", 2, 0, 0);
		provaAgenda.definisci("uscire", "Torino centro", 10, 1, 1);
		provaAgenda.definisci("Mosh", "casa mia", 6, 2, 2);
		
//		for (int i = 0; i < provaAgenda.visualizza().length; i++) {
//			for (int j = 0; j < provaAgenda.visualizza()[i].length; j++) {
//				System.out.println(provaAgenda.visualizza()[i][j]);				
//			}
//			System.out.println("________________________________");
//		}
		for (int i = 0; i < 5; i++) {
			for (String string :provaAgenda.visualizza()[i]) {
		   System.out.println(string);
		}
			System.out.println();
	}
  }
}
