package view;

import model.Cerchio;
import model.CromatoreForme;
import model.Forma;
import model.Rettangolo;

public class ProvaDecoratorPattern {

	public static void main(String[] args) {

		Forma cerchio = new Cerchio();
		Forma cerchioCromato = new CromatoreForme(new Cerchio());
		Forma rettangoloCromato = new CromatoreForme(new Rettangolo());
		
		cerchio.disegna();
		cerchioCromato.disegna();
		rettangoloCromato.disegna();

	}

}
