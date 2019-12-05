package model;

public class PiantaBonsai extends Pianta {

	public PiantaBonsai() {
		this.famiglia = Famiglie.ANGIOSPERME;
		this.specie = Specie.PINO;
		this.altezza = 1.50;
	}
	
	
	@Override
	public void pianta() {
		
		System.out.println("ho piantato la pianta");
		System.out.println("adesso devi bagnarla");
		if (this.famiglia==Famiglie.ANGIOSPERME)
			System.out.println("come le angiosperme!!!");
		System.out.println(this.specie);

	}

	@Override
	public String toString() {
		return super.toString();
	}

	
	
}
