package controller;

import java.util.LinkedList;
import java.util.List;

import model.Pianta;
import model.PiantaBonsai;
import model.Specie;

public class ListaPiante {

	private List<Pianta> pianteLista = new LinkedList<>();
	
	public List<Pianta> getPianteLista() {
		return pianteLista;
	}
	
	{
		
		
		pianteLista.add(new PiantaBonsai());
		pianteLista.get(0).specie = Specie.MELO;
		pianteLista.add(new PiantaBonsai());
		pianteLista.get(1).setSpecie(Specie.MELO);
		pianteLista.add(new PiantaBonsai());
		pianteLista.add(new PiantaBonsai());
	}
	
	
	
	
}
