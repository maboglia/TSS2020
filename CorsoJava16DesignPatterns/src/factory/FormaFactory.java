package factory;

public class FormaFactory {

	public Forma getForma(String tipoForma) {
		
		if (tipoForma == null) {
			return null;
		}
		
		if (tipoForma.equalsIgnoreCase("Cerchio")) {
			return new Cerchio();
		} else 
		if (tipoForma.equalsIgnoreCase("Quadrato")) {
			return new Quadrato();
		} else 
		if (tipoForma.equalsIgnoreCase("Rettangolo")) {
			return new Rettangolo();
		}	
		
		
		return null;
	}
	
	
}
