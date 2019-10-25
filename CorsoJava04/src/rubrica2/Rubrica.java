package rubrica2;

import java.util.ArrayList;

import rubrica.Contatto;

public class Rubrica {

	private ArrayList<Contatto> contatti;

	public Rubrica() {
		this.contatti = new ArrayList<>();
	}
	
	public void aggiungiVoce(Contatto c) {
		if (contatti.contains(c));
		contatti.add(c);
	}
	
	public ArrayList<Contatto> leggiContatti(){
		return contatti;
	}
}
