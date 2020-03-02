package model;

public class Impegno {

	private String argomento;
	private String luogo;
	private int priorita;
	
	@Override
	public String toString() {
		return "Impegno [argomento=" + argomento + ", luogo=" + luogo + ", priorita=" + priorita + "]";
	}
	public Impegno(String argomento, String luogo, int priorita) {
		this.argomento = argomento;
		this.luogo = luogo;
		this.priorita = priorita;
	}
	public String getArgomento() {
		return argomento;
	}
	public void setArgomento(String argomento) {
		this.argomento = argomento;
	}
	public String getLuogo() {
		return luogo;
	}
	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}
	public int getPriorita() {
		return priorita;
	}
	public void setPriorita(int priorita) {
		this.priorita = priorita;
	}	
}
