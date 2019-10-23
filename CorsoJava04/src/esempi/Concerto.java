package esempi;

public class Concerto {
	public static void main(String[] args) {
		
		//costruisco oggetti di tipo chitarra
		Chitarra ibanez = new Chitarra("Ibanez");
		Chitarra gibson = new Chitarra("Gibson", 380);
		Chitarra fender = new Chitarra();

		Batteria b1 = new Batteria();
		Batteria b2 = new Batteria();
		
		Basso bas1 = new Basso();
		
		Chitarra[] chitarre = {ibanez, gibson, fender};
		Batteria[] batterie = {b1, b2};
		Basso[] bassi = {bas1};
		
		for (int i = 0; i < 5; i++) {
			for (Chitarra c : chitarre) {
				System.out.println(c.suona());
			}
			
			for (Basso basso : bassi) {
				System.out.println(basso.suona());
			}
			
			for (Batteria batt : batterie) {
				System.out.println(batt.suona());
			}
		}//qui termina il ciclo for esterno
		
		
		
		//accedo alle proprietà degli oggetti chitarra
		/*
		System.out.println(gibson.suona());
		System.out.println(ibanez.suona());
		System.out.println(fender.suona());
		System.out.println(ibanez.suona());
		System.out.println(fender.suona());
		System.out.println(fender.suona());
		*/
		
		
	}
}
