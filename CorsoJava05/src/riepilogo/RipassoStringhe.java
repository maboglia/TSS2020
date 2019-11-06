package riepilogo;

/**
 * La classe RipassoStringhe contiene esempi di stringhe
 * @author teacher
 *	cn: la classe inizia per maiuscola, 
 *  se ci sono più parole devo capitalizzare...
 */
public class RipassoStringhe {

	/**
	 * Costruttore degli oggetti di tipo RS, 
	 * il costruttore è un metodo che segue le CN della classe, 
	 * non ha tipo di ritorno in quanto ritorna l'oggeto costruito
	 */
	public RipassoStringhe() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * CN non posso scrivere il main in altri modi!!!
	 * CN main è un metodo, quindi si scrive con lettera iniziale minuscola
	 * @param args - argomenti opzionali da passare al main
	 */
	public static void main(String[] args) {

		
		/**
		 * 
		 */

		String s1 = "ciao";
			   s1 += " mondo";	
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(s1.length()-1));
		System.out.println(s1.endsWith("do"));
		System.out.println(s1.startsWith("cia"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.substring(2, 6));
		char[] caratteri = s1.toCharArray();
		System.out.println(caratteri);
		
		String username = " mauro ";
		String password = "12345";
		

		
		if (username.trim().equals("mauro") && password.equals("12345") )
			System.out.println("user logged");
		else
			System.out.println("username o password errati!");
		
		String frase = "ALOI;EUGENIO;1992;6;22;2;4";
		
		String[] paroleDellaFrase = frase.split(";");
		String cognome = paroleDellaFrase[0];
		String nome = paroleDellaFrase[1];
		System.out.println(cognome + " "+ nome);
		
		StringBuilder sb = new StringBuilder();
		sb.append("ciao").append(" ").append("mondo");
		System.out.println(sb.substring(5, 9));
		
	}

}
