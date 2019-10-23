package esempi;

public class Caramelle {


	public static void main(String[] args) {

		int barattolo1 = 120;
		int barattolo2 = barattolo1;
		
		System.out.println(barattolo1);
		System.out.println(barattolo2);
		System.out.println(barattolo1==barattolo2);
		barattolo2 -=  1;
		System.out.println(barattolo1);
		System.out.println(barattolo2);

	}

}
