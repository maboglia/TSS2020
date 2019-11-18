package controller;

import java.util.ArrayList;

import model.Studente;

public class Registro {

	private ArrayList<Studente> registro;
	private ArrayList<Studente> presenti;
	private ArrayList<Studente> assenti;
	
	public Registro() {
		this.registro = new ArrayList<>();
		this.presenti = new ArrayList<>();
		this.assenti = new ArrayList<>();
		this.init();
	}
	
	public ArrayList<Studente> getPresenti() {
		return presenti;
	}
	public ArrayList<Studente> getAssenti() {
		return assenti;
	}
	
	public ArrayList<Studente> faiAppello() {
		return this.registro;
	}
	
	public void aggiungiAssente(Studente s) {
		this.assenti.add(s);
	}
	
	public void aggiungiPresente(Studente s) {
		this.presenti.add(s);
	}
	
	private void init() {
		this.registro.add(new Studente("EUGENIO","ALOI"));
		this.registro.add(new Studente("PIERO","BAGLIVO"));
		this.registro.add(new Studente("ALESSIA","BALCONETTI"));
		this.registro.add(new Studente("ROBERTO","BELLARDI GIOLI"));
		this.registro.add(new Studente("CHIARA","BUSINARO"));
		this.registro.add(new Studente("MATTEO","CALFA"));
		this.registro.add(new Studente("OANA VIORICA","CERBU"));
		this.registro.add(new Studente("LAURA","CONTI"));
		this.registro.add(new Studente("JAVIER","DE LA FUENTE"));
		this.registro.add(new Studente("MIHAI","FEDOT"));
		this.registro.add(new Studente("AHMED","HABOULA"));
		this.registro.add(new Studente("BIAGIO","INGUSCI"));
		this.registro.add(new Studente("MATTIA","ISOLDI"));
		this.registro.add(new Studente("ANDREA EDSON","LORENZONI"));
		this.registro.add(new Studente("FEDERICA","LUISE"));
		this.registro.add(new Studente("VALENTINA","MANGIONE"));
		this.registro.add(new Studente("MARIARITA","MASIA"));
		this.registro.add(new Studente("MATTIA","MONTENEGRO"));		
	}
	
	
	
	
	
	
}
