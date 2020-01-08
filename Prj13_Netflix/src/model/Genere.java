package model;

public enum Genere {
	
	//AZIONE("uno"),HORROR("due"),FANTASCIENZA("tre"),COMMEDIA("quattro"),GIALLO("cinque");
	AZIONE,HORROR,FANTASCIENZA,COMMEDIA,GIALLO;
	
	private String descrizione;
	
	private Genere() {
		
		this.descrizione = "prova";
		
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	

}
