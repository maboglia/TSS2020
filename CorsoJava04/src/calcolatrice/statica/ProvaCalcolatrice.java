package calcolatrice.statica;

public class ProvaCalcolatrice {

	public static void main(String[] args) {


		double[] numeriUtente = InterfacciaUtente.chiediDueNumeri();
		
		Calcolatrice.a = numeriUtente[0];
		Calcolatrice.b = numeriUtente[1];
		double addizione = Calcolatrice.addizione();
		
		System.out.printf("il risultato dell'addizione è: %.2f", addizione);
		

	}

}
