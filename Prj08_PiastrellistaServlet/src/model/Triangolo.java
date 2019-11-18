package model;

public class Triangolo extends Figura {

	private Punto v1, v2, v3;
	private Segmento l1,l2,l3;
	private int base, altezza;
	
	public Triangolo(Punto v1, Punto v2, Punto v3) {
		super("Triangolo");
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;

		l1 = new Segmento(v1, v2);
		l2 = new Segmento(v2, v3);
		l3 = new Segmento(v3, v1);
	}

	public Triangolo(String nome, int base, int altezza) {
		super(nome);
		this.base = base;
		this.altezza = altezza;
	}
	
	public double perimetro() {
		return l1.getL()+l2.getL()+l3.getL();
	}
	
	public double aretta() {
		
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

	@Override
	public
	double area() {
		double area = this.base * this.altezza / 2;
		return area;
	}
}


