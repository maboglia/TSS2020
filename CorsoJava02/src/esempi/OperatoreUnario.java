package esempi;

public class OperatoreUnario {

	public static void main(String[] args) {
		//variabile locale: deve sempre essere inizializzata
		int saldo = 0;

		//incrementa di una unit�:
		
		saldo = saldo + 1;
		//stampo il valore di saldo
		System.out.println("il saldo � " + saldo);

		saldo += 1;
		//stampo il valore di saldo
		System.out.println("il saldo � " + (saldo += 1));
		
		//operatore unario di post-incremento
		System.out.println("--------"+ (saldo++));
		//stampo il valore di saldo
		System.out.println("il saldo � " + saldo);
	
	}
	
}
