package model;

public class Segmento {

	private Punto a , b;
	private double l;
	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
		this.setL();
	}
	
	public Punto getA() {
		return a;
	}
	public Punto getB() {
		return b;
	}
	
	public double getL() {
		return l;
	}
	
	private void setL() {
		
		double ls = Math.sqrt(  
				Math.pow(  ( b.getX() - a.getX() )   , 2)    
				+
				Math.pow(  ( b.getY() - a.getY() )   , 2)  
				);
		
		this.l = ls;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "segmento: a"+
					this.a+", b"+
					this.b+", lunghezza("+
					this.getL()+
					")";
	}
	
	public static void main(String[] args) {
		Segmento s = new Segmento(new Punto(3,2), new Punto(3,4));
		
		
		System.out.println(s);
		
		
	
	}
	
}
