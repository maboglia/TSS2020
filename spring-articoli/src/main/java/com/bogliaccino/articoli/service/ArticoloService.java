package com.bogliaccino.articoli.service;

import java.util.List;

import com.bogliaccino.articoli.model.Articolo;

public interface ArticoloService {

	Articolo salvaArticolo(Articolo articolo);
	Articolo aggiornaArticolo(Articolo articolo);
	void eliminaArticolo(Articolo articolo);
	Articolo getArticoloById(Articolo articolo);
	List<Articolo> getAllArticoli();
}
