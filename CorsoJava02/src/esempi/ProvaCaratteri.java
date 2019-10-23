package esempi;

public class ProvaCaratteri {

	public static void main(String[] args) {
		
		//interi: byte, short, int, long
		//reali: float, double
		
		//boolean: true, false
		//char: il singolo carattere
		
		String s = "buongiorno a tutti";
		
		for (int i = 0; i < s.length(); i++) {
			
			System.out.println(i +": " + s.charAt(i));
			
		}
		
		
		
		

	}

}
