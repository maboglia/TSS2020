package controller;

@FunctionalInterface
interface Parametro {
	int somma(int a, int b);
}

@FunctionalInterface
interface Saluta {
	void saluta();
}

public class Operazioni5 {

	private static int moltiplica(Parametro param, int a, int b, int y) {
		return param.somma(a, b)*y;
	}
	
	public static void main(String[] args) {

		System.out.println(moltiplica((a,b)-> a+b, 4, 5, 6));
		
		//
//		Saluta ita = () -> System.out.print("ciao");
//		Saluta fra = () -> System.out.print("salut");
//		Saluta eng = () -> System.out.print("hello");
//
//		ita.saluta();
//		eng.saluta();
//		fra.saluta();

	
	
	}

}
