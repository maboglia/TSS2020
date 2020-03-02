package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import controller.StudentiCtrl;
import model.Consumazione;
import model.ConsumazioneFactory;

public class ProvaConsumazioni {

	public static void main(String[] args) {
		StudentiCtrl sc = new StudentiCtrl();
		
		Scanner scan = new Scanner(System.in);
		Map<String, Double> scontrino = new HashMap<>();
		
		
		sc.getStudenti().values().stream().limit(4).forEach(s -> {
			
			System.out.println(s.getCognome() + " cosa vuoi ordinare?");
			String risposta = scan.nextLine();
			ConsumazioneFactory cf = new ConsumazioneFactory();
			Consumazione consumazione = cf.getConsumazione(risposta);
			
			scontrino.put(s.getCognome() + ": " + risposta, consumazione.costo());
			
		});
		double totale=0;
		System.out.println("conto: ");
		for (double d : scontrino.values()) {
			totale += d;
		}
		System.out.println(totale);
	}
}
