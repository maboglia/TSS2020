package model;

public class Libro implements Comparable<Libro> {

	private int libro_id;
	private String titolo;
	
	public Libro() {}

	public Libro(int libro_id, String titolo) {
		this.libro_id = libro_id;
		this.titolo = titolo;
	}

	public int getLibro_id() {
		return libro_id;
	}

	public void setLibro_id(int libro_id) {
		this.libro_id = libro_id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	@Override
	public String toString() {
		return "Libro [libro_id=" + libro_id + ", titolo=" + titolo + "]";
	}

	@Override
	public int compareTo(Libro o) {
		return this.titolo.compareTo(o.titolo);
	}
	
}
