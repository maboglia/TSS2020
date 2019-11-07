package model;

public class Impiegato extends Dipendente {

	private int nOreLav;
	
	public void setnOreLav(int nOreLav) {
		this.nOreLav = nOreLav;
	}
	
	public double calcolaStipendio() {
		return 9.50 * nOreLav;
	}
	
}
