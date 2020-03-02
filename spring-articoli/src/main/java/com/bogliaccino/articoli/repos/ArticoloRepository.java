package com.bogliaccino.articoli.repos;


import org.springframework.data.repository.CrudRepository;

import com.bogliaccino.articoli.model.Articolo;

public interface ArticoloRepository  extends CrudRepository<Articolo, Integer> {


	
}
