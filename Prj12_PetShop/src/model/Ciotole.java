package model;

public enum Ciotole {

	PICCOLA(0.2), MEDIA(0.5), GRANDE(1.0);

	private double qty;
	
	private Ciotole(double d) {
		qty = d;
	}

	public double getQty() {
		return qty;
	}
	
	public String stampaInfo() {
		return "quantità" + qty;
	}
}
