package esempi;

public class MetodiStatici {

	public static void main(String[] args) {
		raddoppia(4);
		raddoppia("4");

	}
	private static void raddoppia(String string) {
		System.out.println(string + string);
		
	}
	private static void raddoppia(int i) {
		System.out.println(i * 2);
		
	}
	
}
