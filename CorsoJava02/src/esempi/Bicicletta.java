package esempi;

public class Bicicletta {

	int ruote;
	double prezzo;
	String marca;
	int marcia;
	int cadenza;
	double velocita;
	
	public double getVelocita() {
		velocita = cadenza * marcia * 1.90 * 60 /1000;
		return velocita;
	}
	
	
	
	
	
}
