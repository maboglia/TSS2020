package controller;

import java.util.ArrayList;
import java.util.List;

import model.*;

public class Prodotti {

	static List<Prodotto> elenco = new ArrayList<>();
	
	static {
		//bevande
		Prodotti.aggiungiProdotto(new Bevanda("caffè", 2.0));  
		Prodotti.aggiungiProdotto(new Bevanda("tè", 5.0));  
		Prodotti.aggiungiProdotto(new Bevanda("ginseng", .8));  
		//dolci

		Prodotti.aggiungiProdotto(new model.Dolce("crostate", 1.5));  
		Prodotti.aggiungiProdotto(new model.Dolce("biscotti", .5));  
		Prodotti.aggiungiProdotto(new model.Dolce("cornetti", 1.0));  

		//salati
		Prodotti.aggiungiProdotto(new model.Salato("focaccia", 1.2));  
		Prodotti.aggiungiProdotto(new model.Salato("panino", 2.5));  
		Prodotti.aggiungiProdotto(new model.Salato("pizze", 1.8));  
			
	
	}
	
	static void aggiungiProdotto(Prodotto p){
		elenco.add(p);
	}
	
	static ArrayList<Prodotto> filtraElenco(String x){
		ArrayList<Prodotto> ap = new ArrayList<>();
		
		for (Prodotto prodotto : elenco) {
			
			switch (x) {
			case "bevande":
				if (prodotto instanceof Bevanda)
					ap.add(prodotto);
				break;
			case "dolci":
				if (prodotto instanceof model.Dolce)
					ap.add(prodotto);
				break;
			case "salati":
				if (prodotto instanceof model.Salato)
					ap.add(prodotto);
				break;

			default:
				break;
			}//end switch
		}//fine for
		return ap;
	}
	
}
