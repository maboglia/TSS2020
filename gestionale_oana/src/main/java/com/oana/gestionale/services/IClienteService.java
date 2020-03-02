package com.oana.gestionale.services;

import java.util.List;

import com.oana.gestionale.entities.Cliente;

public interface IClienteService {
	
	void addCliente(Cliente c);
	void eliminaCliente(Cliente c);
	Cliente getClienteById(int i );
	List<Cliente> getAll();

}
