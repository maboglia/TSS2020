package view;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import controller.ListaPiante;
import controller.MappaPiante;
import model.Famiglie;
import model.Pianta;
import model.PiantaBonsai;
import model.Specie;

public class GestionePIante {

	public static void main(String[] args) {
		
		MappaPiante mp = new MappaPiante();
		mp.caricaPiante();
		
		ListaPiante lp = new ListaPiante();
		
		System.out.println(lp.getPianteLista());
		
		
		
		//System.out.println(mp.getMappa());
		
		//System.out.println(mp.getMappa().keySet());
		
		
		//faccio un ciclo sulle chiavi
//		for(   Integer i :   mp.getMappa().keySet() ) {
//			System.out.println(mp.getMappa().get(i));
//		}
			
		//faccio un ciclo sui valori
//		for (Pianta pianta : mp.getMappa().values()) {
//			System.out.println(pianta);
//		}


	}
	
}
