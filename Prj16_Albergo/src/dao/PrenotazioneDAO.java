package dao;

import java.util.List;

import model.Prenotazione;

public interface PrenotazioneDAO {

	List<Prenotazione> getAll();
	void insert(Prenotazione p);
	
	
}
