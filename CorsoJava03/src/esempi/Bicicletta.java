package esempi;

public class Bicicletta {

	String colore;
	String marca;
	int marce;
	
	public String stampaInfo() {
		return "colore: " + colore +
				"marca: " + marca +
				"numero marce: " + marce;
	}
	
	public static void main(String[] args) {

		Bicicletta b1 = new Bicicletta();
		Bicicletta b2 = b1;
		Bicicletta b3 = new Bicicletta();
		
		b1.colore = "rosso";
		b1.marca = "ATALA";
		b1.marce = 18;
		
		b3.marca="BIANCHI";
		System.out.println(b1.stampaInfo());
		System.out.println(b2.stampaInfo());
		System.out.println(b3.stampaInfo());
	}
}
