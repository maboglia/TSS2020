package esempi;

public class CicloForNelFor {

	public static void main(String[] args) {
		ciclo();
	}

	private static void ciclo() {
		int iniziale = 1;
		int finale = 10;
		for (int i = iniziale; i <= finale; i++) {
			//dieci volte
			for (int j = iniziale; j <= finale; j++) {
				//dieci volte
				System.out.print("M");
			}
			//scrive una riga vuota, cioè manda a capo
			System.out.println();
		}

		
	}

}
