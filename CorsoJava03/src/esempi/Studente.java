package esempi;

public class Studente {
	
	//stato interno della classe studente
	String nome;
	String cognome;
	
	int eta;
	byte giorno, mese;
	short anno;
	//data 
	byte riga;
	byte colonna;
	
	//costruttore
	Studente(String _nome, String _cognome){
		nome = _nome;
		cognome = _cognome;
	}
	
	int calcolaEta() {
		
		return 2019-anno;
		
	}
	
	String firma() {
		return nome.substring(0, 1) + ". " + cognome;
	}

}
