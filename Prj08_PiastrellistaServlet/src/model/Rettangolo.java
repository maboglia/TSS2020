package model;

public class Rettangolo extends Figura{

	protected Punto p;
	protected int base, altezza;
	public Rettangolo(Punto p, int base, int altezza) {
		super("Rettangolo");
		this.p = p;
		this.base = base;
		this.altezza = altezza;
	}

	public Rettangolo(String nome, int base, int altezza) {		
		super(nome);
		this.base = base;
		this.altezza = altezza;
	}
	
	public int perimetro() {
		return 2* (base+altezza);
	}
	@Override
	public double area() {
		return base* altezza;
	}
	
	public static void main(String[] args) {
		Rettangolo r = new Rettangolo(new Punto(), 10, 5);
		System.out.printf("Il rettangolo di area %s, e perimetro %d", r.area(), r.perimetro());
	}
}
