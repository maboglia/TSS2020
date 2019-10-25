package rubrica;

public class Rubrica {

	final int DIM_RUBRICA = 1000;
	String nomeRubrica;
	private Contatto[] voci;
	
	public Rubrica() {
		nomeRubrica = "Rubrica nera";
		//System.out.println("rubrica costruita: " + nomeRubrica);
		voci = new Contatto[DIM_RUBRICA];
	}
	
	private boolean controlloUtente(String nome) {
		//System.out.println(nome + pos);
		
		/*
		if (voci[pos] != null && voci[pos].getNome().equalsIgnoreCase(nome) )
			return true;

		return false;
		*/
		
		for (Contatto contatto : voci) {
			if (contatto != null && contatto.getNome().equalsIgnoreCase(nome))
				return true;
		}
		return false;
		
		
		
		
	}
	
	public void aggiungiVoce(String nome, String numero) {
		
		boolean presente = controlloUtente(nome);
		if (presente) return;
		
		for (int i = 0; i < voci.length; i++) {
			if (voci[i] != null) {
				System.out.println("c'è un contatto in i " + i);
				continue;
			} 
			else {
				
				Contatto contatto = new Contatto(nome, numero);
				voci[i] = contatto;
				return;
			}
		}
		
	}
	
	public Contatto[] elencoVoci(){
		return voci;
	}
	
	
}
