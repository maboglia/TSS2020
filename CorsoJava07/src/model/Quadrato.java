package model;

public class Quadrato extends Rettangolo {

	
	public Quadrato(Punto p, int lato) {
		super(p, lato, lato);
		
	}
	
	public Quadrato(String nome, int lato){
		super(nome, lato, lato);
	}
	
	@Override
	public int perimetro() {
		System.out.println("metodo del quadrato");
		return super.base*4;
	}



	public static void main(String[] args) {
		Quadrato q = new Quadrato(new Punto(), 5);
		System.out.println(q.perimetro());
		System.out.println(q.area());
	}

}
