package com.oana.gestionale.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oana.gestionale.entities.Cliente;
import com.oana.gestionale.repos.IClienteDAO;

@Service
public class IClienteServiceImpl implements IClienteService{
	
	@Autowired
	private IClienteDAO repo;
	
	@Override
	public void addCliente(Cliente c) {
		
		repo.save(c);
		
	}

	@Override
	public void eliminaCliente(Cliente c) {
		repo.delete(c);
		
	}

	@Override
	public Cliente getClienteById(int i) {
		Optional<Cliente> findById = repo.findById(i);
		return findById.get();
	}

	@Override
	public List<Cliente> getAll() {
		return repo.findAll();
		
	}

}
