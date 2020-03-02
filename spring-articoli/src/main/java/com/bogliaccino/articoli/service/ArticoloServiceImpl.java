package com.bogliaccino.articoli.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bogliaccino.articoli.model.Articolo;
import com.bogliaccino.articoli.repos.ArticoloRepository;

public class ArticoloServiceImpl implements ArticoloService {

	@Autowired
	private ArticoloRepository repo;

	@Override
	public Articolo salvaArticolo(Articolo articolo) {
		// TODO Auto-generated method stub
		return repo.save(articolo);
	}

	@Override
	public Articolo aggiornaArticolo(Articolo articolo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminaArticolo(Articolo articolo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Articolo getArticoloById(Articolo articolo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Articolo> getAllArticoli() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
