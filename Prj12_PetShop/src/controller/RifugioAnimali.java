package controller;

import java.util.List;

import model.Animale;
import model.Cane;
import model.Commestibile;
import model.Gatto;
import model.Topo;

public class RifugioAnimali {

	private List<Animale> rifugioAnimali;

	 RifugioCani rCani;
	 RifugioGatti rGatti;
	 RifugioTopi rTopi;
	
	
	public RifugioAnimali(List<Animale> rifugioAnimali) {
		this.rifugioAnimali = rifugioAnimali;
		rCani = new RifugioCani();
		rGatti = new RifugioGatti();
		rTopi = new RifugioTopi();
		
		for (Animale animale : rifugioAnimali) {
			if (animale instanceof Cane) {
				rCani.elencoCani.add( (Cane) animale);
			}
			if (animale instanceof Gatto) {
				rGatti.setGatti.add( (Gatto) animale);
			}
			if (animale instanceof Topo) {
				rTopi.elencoTopi.add( (Topo) animale);
			}
				
		}
		
	}

	public List<Animale> getRifugioAnimali() {
		return rifugioAnimali;
	}

	public void setRifugioAnimali(List<Animale> rifugioAnimali) {
		this.rifugioAnimali = rifugioAnimali;
	}
	
	public void daiCibo(Commestibile c) {
		for (Animale animale : rifugioAnimali) {
			animale.mangia(c);
		}
	}
	
}
