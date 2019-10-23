package esempi;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Aula {

	public static void main(String[] args) {
		
		Studente[] studenti = {
				new Studente("EUGENIO","ALOI"),
				new Studente("PIERO","BAGLIVO"),
				new Studente("ALESSIA","BALCONETTI"),
				new Studente("ROBERTO","BELLARDI GIOLI"),
				new Studente("CHIARA","BUSINARO"),
				new Studente("MATTEO","CALFA"),
				new Studente("OANA VIORICA","CERBU"),
				new Studente("LAURA","CONTI"),
				new Studente("JAVIER","DE LA FUENTE"),
				new Studente("MIHAI","FEDOT"),
				new Studente("AHMED","HABOULA"),
				new Studente("BIAGIO","INGUSCI"),
				new Studente("MATTIA","ISOLDI"),
				new Studente("ANDREA EDSON","LORENZONI"),
				new Studente("FEDERICA","LUISE"),
				new Studente("VALENTINA","MANGIONE"),
				new Studente("MARIARITA","MASIA"),
				new Studente("MATTIA","MONTENEGRO")
				
		};

		Scanner in = new Scanner(System.in);
		int presenti=0;
		int assenti=0;
		for (int i = 0; i < studenti.length; i++) {
			System.out.println((i+1) +": "+studenti[i].firma() + " è presente?");
			String risposta = in.next();
			if (risposta.equals("s")) 
				presenti++;
			else
				assenti++;
		}

		System.out.println("sono presenti " + presenti + " studenti");
		System.out.println("sono assenti " + assenti + " studenti");
		
	
	}

}
