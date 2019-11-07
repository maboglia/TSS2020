package model;

/**
 * Classe per l'astrazione di un dipendente:
 * rappresenta il modello del dipendente per questo software
 * @author teacher
 *
 */
public class Dipendente {

	//elenco attributi/proprietà/fields
	//stato interno 
	//ingredienti della ricetta
	//appartengono alle istanze della classe: variabili di istanza
	private String nome, cognome;
	private int nMat;
	
	//proprietà statica: appartiene alla classe
	//variabile di classe
	private static int contatore = 1000;
	
	//creare l'oggetto
	//costruttori (metodi con lo stesso nome della classe e nessun tipo di ritorno, normalmente pubblici)
	public Dipendente() {
		setnMat();
	}
	/**
	 * Metodo costruttore (overload)
	 * @param nome - inserire come primo argomento il nome del dipendente
	 * @param cognome - inserire come secondo argomento il cognome del dipendente
	 */
	public Dipendente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		setnMat();
	}

	
	
	//metodi getter, setter
	
	/**
	 * Restituisce la rappresentazione a stringa dell'oggetto
	 */
	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", cognome=" + cognome + ", nMat=" + nMat + "]";
	}

	public String getNome() {
		return nome.toUpperCase();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getnMat() {
		return nMat;
	}

	private void setnMat() {
		this.nMat = contatore++;
	}
	
	public static int getContatore() {
		return contatore;
	}

	public double calcolaStipendio() {
		return 500;
	}
	
	
}
