package factory;

import java.util.Arrays;
import java.util.List;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		FormaFactory factory = new FormaFactory();
		
		Forma figura1 = factory.getForma("cerchio");
		Forma figura2 = factory.getForma("cerchio");
		Forma figura3 = factory.getForma("quadrato");
		Forma figura4 = factory.getForma("rettangolo");
		
		List<Forma> forme = Arrays.asList(figura1,figura2,figura3,figura4);
		
		forme.forEach(f -> f.disegna());
		

	}

}
