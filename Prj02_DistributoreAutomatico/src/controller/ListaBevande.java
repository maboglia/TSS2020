package controller;

import java.util.ArrayList;

import model.Bevanda;

public class ListaBevande {

	private ArrayList<Bevanda> bevande;
	
	public ListaBevande() {
		bevande = new ArrayList<>();
		//System.out.println("lista costruita");
	}
	
	public void riempiLista() {
		bevande.add(  new Bevanda("Caffé", 0.30)  );
		bevande.add(  new Bevanda("Caffé Lungo", 0.35)  );
		bevande.add(  new Bevanda("Caffé Macchiato", 0.40)  );
		bevande.add(  new Bevanda("Cioccolata", 0.40)  );
		bevande.add(  new Bevanda("The", 0.50)  );
		bevande.add(  new Bevanda("Ginseng", 0.45)  );
		//System.out.println("lista riempita");
	}
	
	public ArrayList<Bevanda> getBevande() {
		return bevande;
	}
	
}
