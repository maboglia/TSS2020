package esempi;

public class Batteria {

	public String suona() {
		
		String s = null;
		
		if (Math.random() < 0.5)
			s = "tusg tusg";
		else
			s = "cic tump";
		return s;
		
	}
	
}
