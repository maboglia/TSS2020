package model;

public class Triangolo {

	private Punto v1, v2, v3;
	private Segmento l1,l2,l3;
	
	public Triangolo(Punto v1, Punto v2, Punto v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;

		l1 = new Segmento(v1, v2);
		l2 = new Segmento(v2, v3);
		l3 = new Segmento(v3, v1);
	}

	public double perimetro() {
		return l1.getL()+l2.getL()+l3.getL();
	}
	
	public double area() {
		
		double p = perimetro()/2;
		
		return Math.sqrt(p * 
				(p-l1.getL())*
				(p-l2.getL())*
				(p-l3.getL())
				);
		
	}
	public static void main(String[] args) {
		Triangolo t = new Triangolo(
				new Punto(3,2),
				new Punto(5,2),
				new Punto(3,4));
		System.out.println(t.perimetro());
		System.out.println(t.area());
	}
}


