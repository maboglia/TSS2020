package rubrica2;

import rubrica.Contatto;

public class ProvaRubrica {

	public static void main(String[] args) {

		Rubrica rub = new Rubrica();
		rub.aggiungiVoce(  new Contatto("mauro", "321-456789")    );
		rub.aggiungiVoce(  new Contatto("andrea", "322-456789")      );
		rub.aggiungiVoce(  new Contatto("federica", "323-456789")      );
		rub.aggiungiVoce(  new Contatto("mihai", "324-456789")      );
		rub.aggiungiVoce(  new Contatto("federica", "323-456789")      );
		rub.aggiungiVoce(  new Contatto("federica", "323-456789")      );
		rub.aggiungiVoce(  new Contatto("eugenio", "321-456789")      );
		rub.aggiungiVoce(  new Contatto("roberto", "322-456789")      );
		rub.aggiungiVoce(  new Contatto("oana", "323-456789")      );
		rub.aggiungiVoce(  new Contatto("oana", "323-456789")      );
		rub.aggiungiVoce(  new Contatto("laura", "324-456789")      );
		rub.aggiungiVoce(  new Contatto("matteo", "323-456789")      );
		rub.aggiungiVoce(  new Contatto("chiara", "323-456789")      );
		rub.aggiungiVoce(  new Contatto("mattia", "323-456789")      );
		rub.aggiungiVoce(  new Contatto("chiara", "323-456789")      );
		rub.aggiungiVoce(  new Contatto("biagio", "323-456789")      );
		
		for (Contatto cont : rub.leggiContatti()) {
			System.out.println(cont.getNome());
		}
		
	}

}
