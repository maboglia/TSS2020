package com.bogliaccino.articoli.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "articolo")
public class Articolo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
//	@Column(name = "rimanenza")
	private int rimanenza;
	private double prezzo;
	private String descrizione;
	private String categoria;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRimanenza() {
		return rimanenza;
	}
	public void setRimanenza(int rimanenza) {
		this.rimanenza = rimanenza;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "Articolo [id=" + id + ", rimanenza=" + rimanenza + ", prezzo=" + prezzo + ", descrizione=" + descrizione
				+ ", categoria=" + categoria + "]";
	}

	
	
}
