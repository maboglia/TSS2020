package controller;

@FunctionalInterface
interface SenzaParametri {
	void stampa();
}

@FunctionalInterface
interface UnParametro {
	void stampa(String s);
}

@FunctionalInterface
interface MoltiParametri {
	void stampa(String uno, String due);
}

public class Operazioni4 {

	public static void main(String[] args) {
		SenzaParametri sp = () -> System.out.println("non c'è niente da stampare");
		sp.stampa();
		
		UnParametro up = parametro -> System.out.println("test "+parametro);
		up.stampa("prova");
		
		MoltiParametri mp = (uno, due) -> System.out.println(uno +" "+ due);
		mp.stampa("mauro", "bogliaccino");
		
	}

}
