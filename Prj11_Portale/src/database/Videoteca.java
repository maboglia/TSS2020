package database;

import java.util.ArrayList;
import java.util.List;

import model.Serie;

public class Videoteca {

	public static List<Serie> elencoSerie = new ArrayList<>();
	
	public static Serie findById(int id) {
		return elencoSerie.get(id);
	}
	
}
