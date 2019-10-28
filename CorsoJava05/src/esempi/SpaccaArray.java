package esempi;

public class SpaccaArray {

	public static void main(String[] args) {
		
		String[] settimana = {
				"lunedì",
				"martedì",
				"mercoledì",
				"giovedì",
				"venerdì",
				"sabato",
				"domenica",
		};
		
		int[] ore = new int[8];
		
		for (int i = 0; i < ore.length; i++) {
			ore[i] = i + 8;
		}
		
		
		for (String giorno : settimana) {
			System.out.print(giorno + "\t");
			
			for (int ora : ore) {
				System.out.print(ora + "\n");
			}
			
			
			
		}
		
		char[] lettere = {'c','i','a', 'o'};
		String s = new String(lettere);
		System.out.println(s.charAt(2));

	}

}
