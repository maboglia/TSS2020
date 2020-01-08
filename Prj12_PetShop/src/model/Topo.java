package model;

public class Topo extends Animale implements Commestibile {


	public Topo() {
		this.setNome("topo");
	}
	
	public void scappa(Animale a) {
		if (a instanceof Topo)
			System.out.println("Io non ho paura!");
		else
			System.out.println("andale andale, arriba arriba");
	}
	
	
	@Override
	public void mangia(Commestibile c) {
		if (c instanceof Secco) {
			if (((Secco) c).getQuantita() > 0.3)
				this.isSoddisfatto(true);
			else 
				this.isSoddisfatto(false);
		}
		if (c instanceof Umido) {
			if (((Umido) c).getQuantita() > 0.2)
				this.isSoddisfatto(true);
			else 
				this.isSoddisfatto(false);
		}
		if (c instanceof Topo) {
			this.isSoddisfatto(false);
		}		

	}

	@Override
	public boolean isSoddisfatto(boolean b) {
		 this.setSoddisfazione(b);
		return getSoddisfazione();
	}

	@Override
	public boolean isMorto(boolean b) {
		return false;
	}



}
