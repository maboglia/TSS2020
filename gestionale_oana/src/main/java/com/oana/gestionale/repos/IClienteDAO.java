package com.oana.gestionale.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.oana.gestionale.entities.Cliente;

public interface IClienteDAO extends JpaRepository<Cliente, Integer>{

	
	
}
