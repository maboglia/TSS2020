package morracinese;
import java.util.Scanner;

public class MorraCinese {
	
	public static String[] scelte = {"carta", "forbici", "sasso"};
	
	public static int contatore = 0;
	public static int vittorieUmano = 0;

		public static void main(String[] args) {
			
			int sceltab = sceltaComputer();
			//System.out.println(sceltab);
			
			int sceltaa =sceltaUmano();
			
			//System.out.println(sceltaa);
			
			String ris = valuta(sceltaa,sceltab);
			
			
			System.out.println("Umano ha giocato: " + scelte[sceltaa]);
			System.out.println("Computer ha giocato: " + scelte[sceltab]);
			System.out.println("Il risultato è: " + ris);
			

	}



		public static String valuta(int sceltaa, int sceltab) {
			contatore++;
			String temp = null;
			
			if(sceltaa == sceltab)
				return "pareggio";
			switch (sceltaa) {
			case 0:
				if (sceltab == 1)
					temp = "Vince computer";
			
				else
					{
						temp = "Vince l'umano";
						vittorieUmano++;
					}
				
				break;
			case 1:
				if (sceltab == 2)
					temp = "Vince computer";
				
				else
				{
					temp = "Vince l'umano";
					vittorieUmano++;
				}
				
				break;

			default: 
				if (sceltab == 0)
					temp = "Vince computer";
				
				else
				{
					temp = "Vince l'umano";
					vittorieUmano++;
				}
				break;
			}
			
			return temp;
		}



		public static int sceltaUmano() {
			
			Scanner scanner = new Scanner(System.in);
			StringBuilder sb = new StringBuilder("Gioca con noi!");
			sb.append("\n").append("premi c per carta");			
			sb.append("\n").append("premi f per forbici");
			sb.append("\n").append("premi p per pietra");
			
			System.out.println(sb);	
			
			String temp = scanner.nextLine();
			
			
			int ris = 0;
			switch (temp) {
			case "c":
				ris = 0;
				
				break;
				
			case "f":
				ris = 1;
				
				break;
				
			case "p":
				ris = 2;
				
				
				break;

			default:
				break;
			}
			
			
			return ris;
		}



		public static int sceltaComputer() {
			
			
			
			return (int)(Math.random() * scelte.length);
		}


}
