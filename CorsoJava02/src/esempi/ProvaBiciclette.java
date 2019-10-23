package esempi;

public class ProvaBiciclette {

	public static void main(String[] args) {

		Bicicletta b1 = new Bicicletta();
		
		b1.cadenza = 100;
		b1.marcia = 3;
		System.out.println(b1.getVelocita());
		
		Bicicletta b2 = new Bicicletta();
		b2.cadenza = 80;
		b2.marcia = 4;
		System.out.println(b2.getVelocita());
		
		b2.marcia = 1;
		System.out.println(b2.getVelocita());
		
		if (b1.getVelocita() > b2.getVelocita()) {
			System.out.println("b1 è più veloce di b2");
		} else {
			System.out.println("b2 è più veloce di b1");
			
		}
		
	}

}
