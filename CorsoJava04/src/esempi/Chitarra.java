package esempi;

public class Chitarra {

	//stato interno, elenco di attributi (proprietà, field)
	private String marca;
	String tipo;
	String materiale;
	double prezzo;
	
	//metodo costruttore
	public Chitarra() {
		System.out.println("Ho costruito una chitarra default");
		marca = "Fender";
	}

	//Overload del metodo costruttore
	public Chitarra(String marca) {
		System.out.println("Ho costruito una chitarra custom");
		this.marca = marca;
	}

	//Overload del metodo costruttore
	public Chitarra(String marca, double prezzo) {
		System.out.println("Ho costruito una chitarra custom");
		this.marca = marca;
		this.prezzo = prezzo;
	}	

	public String getMarca() {
		return marca;
	}

	public String schedaTecnica() {
		String s = null;
		s = this.marca + this.tipo + this.materiale + this.prezzo;
		return s;
		
	}
	
	public String suona() {
		
		String suono = null;
		
		switch (this.marca) {
			case "Fender":
				suono = "daunn";
				break;
			
			case "Gibson":
				suono = "tututuututun";
				break;
				
			default:
				suono = "teunnnn";
				break;
		}
		return suono;
	}
	
}
