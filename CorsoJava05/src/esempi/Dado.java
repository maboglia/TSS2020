package esempi;

public class Dado {

	int nFacce=6;
	
	public int lancia() {
		
		int res = (int) (Math.random() * nFacce) + 1;
		
		return res;
	}
	
	
}
