package model;

public class Fattorino extends Dipendente {

	int nConsegne;
	
	public void setnConsegne(int nConsegne) {
		this.nConsegne = nConsegne;
	}
	
	public double calcolaStipendio() {
		return 2.50 * nConsegne;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fattorino" + super.toString();
	}
}
