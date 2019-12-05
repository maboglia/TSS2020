package model;

public abstract class Pianta {

	public Specie specie;
	public Famiglie famiglia;
	public double altezza;
	
	public abstract void pianta();

	public void setSpecie(Specie specie) {
		this.specie = specie;
	}
	
	
	
	@Override
	public String toString() {
		return "Pianta [specie=" + specie + ", famiglia=" + famiglia + ", altezza=" + altezza + "]";
	}
	
	
	
}
