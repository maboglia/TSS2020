package model;

public enum Specie {

	PINO("Il Pino si bagna con la pioggia", 1.5), MELO("Il melo si bagna con l'idrante", 2.5);
	
	private String metodoIrrigazione;
	private double qtaAcqua;
	private Specie(String mI, double qA) {
		this.metodoIrrigazione = mI;
		this.qtaAcqua = qA;
	}
	public String getMetodoIrrigazione() {
		return metodoIrrigazione;
	}
	public double getQtaAcqua() {
		return qtaAcqua;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return metodoIrrigazione + ": " + qtaAcqua + "lt al giorno";
	}
}
