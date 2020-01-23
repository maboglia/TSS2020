package view;

import controller.StudentiController;
import model.Studente;

public class Registro {

	public static void main(String[] args) {
		
		StudentiController sc = new StudentiController();
		
		for (Studente s : sc.getStudenti()) {
			System.out.println(s);
		}
		

	}

}
