package controller;

import java.util.HashMap;
import java.util.Map;

import model.Famiglie;
import model.Pianta;
import model.PiantaBonsai;
import model.Specie;

public class MappaPiante {

	private Map<Integer, Pianta> mappa = new HashMap<>(); 
	
	public Map<Integer, Pianta> getMappa() {
		return mappa;
	}
	
	public void caricaPiante() {
		
		Pianta meloBonsai = new PiantaBonsai();
		Pianta pinoBonsai = new PiantaBonsai();
		
		meloBonsai.famiglia = Famiglie.ANGIOSPERME;
		pinoBonsai.famiglia = Famiglie.CONIFERE;
		
		meloBonsai.specie = Specie.MELO;
		pinoBonsai.specie = Specie.PINO;
		
		mappa.put(1, meloBonsai);
		mappa.put(2, pinoBonsai);
		

		
	}
	
	
	
	
	
}
