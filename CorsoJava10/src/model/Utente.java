package model;

public class Utente {

	private int id ;
	private String username;

	public Utente(int id, String username) {
		this.id = id;
		this.username = username;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Utente " + this.username + " id: " + this.id;
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}
	
}
