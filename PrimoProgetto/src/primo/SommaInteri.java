package primo;

public class SommaInteri {

	public static void main(String[] args) {

		//qui richiamo il metodo addizione()
		addizione(5.6,4);
		addizione(7,13.4);
		addizione(25.7,89);
		
		

	}
	
	//questo è il metodo addizione(), non ritorna nulla e stampa un valore
	public static void addizione(double num1, double num2) {
		
		double a = num1;
		double b = num2;
		
		double c = a - b;
		
		System.out.println("il risultato dell'addizione è " + c);
		
	}
	

}
