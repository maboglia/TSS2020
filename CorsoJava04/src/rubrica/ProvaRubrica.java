package rubrica;

public class ProvaRubrica {

	public static void main(String[] args) {


		Rubrica rub = new Rubrica();
		
		long inizio = System.currentTimeMillis();
		
		
		rub.aggiungiVoce("mauro", "321-456789");
		rub.aggiungiVoce("andrea", "322-456789");
		rub.aggiungiVoce("federica", "323-456789");
		rub.aggiungiVoce("mihai", "324-456789");
		rub.aggiungiVoce("federica", "323-456789");
		rub.aggiungiVoce("federica", "323-456789");
		rub.aggiungiVoce("eugenio", "321-456789");
		rub.aggiungiVoce("roberto", "322-456789");
		rub.aggiungiVoce("oana", "323-456789");
		rub.aggiungiVoce("oana", "323-456789");
		rub.aggiungiVoce("laura", "324-456789");
		rub.aggiungiVoce("matteo", "323-456789");
		rub.aggiungiVoce("chiara", "323-456789");
		rub.aggiungiVoce("mattia", "323-456789");
		rub.aggiungiVoce("chiara", "323-456789");
		rub.aggiungiVoce("biagio", "323-456789");
		

		
		for (Contatto contatto : rub.elencoVoci()) {
			if (contatto != null)
			System.out.println(contatto.getNome());
		}

		long fine = System.currentTimeMillis();
		
		long tempo = (fine-inizio);
		
		System.out.println("tempo complessivo " + tempo);

	}

}
