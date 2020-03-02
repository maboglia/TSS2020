package model;

public class ConsumazioneFactory {

	public Consumazione getConsumazione(String consumazione) {
		
		if (consumazione == null) { return null;}

		if (consumazione.equalsIgnoreCase("dolce")) {
			return new Dolce();
		} else 
			
			if (consumazione.equalsIgnoreCase("salato")) {
				return new Salato();
			} else 
				
				if (consumazione.equalsIgnoreCase("bevanda")) {
					return new Bevanda();
				} 
					
		
		return null;
	}
	
	
}
