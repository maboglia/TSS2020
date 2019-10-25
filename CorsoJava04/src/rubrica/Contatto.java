package rubrica;

public class Contatto {

	//fields privati (incapsulamento)
	private String nome;
	private String numero;
	
	//costruttore 
	public Contatto(String nome, String numero) {

		this.nome = nome;
		this.numero = numero;
		
	}
	//getter 
	public String getNome() {
		return nome.toUpperCase();
	}

	public String getNumero() {
		return numero;
	}
	
	
	
}
