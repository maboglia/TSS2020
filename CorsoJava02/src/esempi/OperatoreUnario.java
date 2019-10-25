package esempi;

public class OperatoreUnario {

	public static void main(String[] args) {
		//variabile locale: deve sempre essere inizializzata
		int saldo = 0;

		//incrementa di una unitè:
		
		saldo = saldo + 1;
		//stampo il valore di saldo
		System.out.println("il saldo è " + saldo);

		saldo += 1;
		//stampo il valore di saldo
		System.out.println("il saldo è " + (saldo += 1));
		
		//operatore unario di post-incremento
		System.out.println("--------"+ (saldo++));
		//stampo il valore di saldo
		System.out.println("il saldo è " + saldo);
	
	}
	
}
