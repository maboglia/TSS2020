package model;

public class Punto {

	private int x, y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Punto() {
		this.x=0;
		this.y=0;
	}
	public Punto(int x) {
		this.x=x;
		this.y=0;
	}
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public static void main(String[] args) {
		Punto a, b,c;
		a = new Punto();
		b = new Punto(2);
		c = new Punto(5,3);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	
}
