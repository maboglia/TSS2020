package model;

public class Cane extends Animale {

	public Cane() {
		this.setNome("cane");
	}
	
	@Override
	public void mangia(Commestibile c) {
		if (c instanceof Secco) {
			if (((Secco) c).getQuantita() > 0.5)
				this.isSoddisfatto(true);
			else 
				this.isSoddisfatto(false);
		}
		if (c instanceof Umido) {
			if (((Umido) c).getQuantita() > 0.3)
				this.isSoddisfatto(true);
			else 
				this.isSoddisfatto(false);
		}
		if (c instanceof Topo) {
			if (  ((Topo) c).isMorto(true) )
				this.isSoddisfatto(true);
			else 
				this.isSoddisfatto(false);
		}
		
	}

	@Override
	public boolean isSoddisfatto(boolean b) {
		 this.setSoddisfazione(b);
		return getSoddisfazione();
	}



}
