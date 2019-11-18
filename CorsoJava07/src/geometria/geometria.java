package geometria;

import java.util.ArrayList;
import java.util.Scanner;

import model.Figura;
import model.Punto;
import model.Quadrato;
import model.Rettangolo;
import model.Triangolo;

public class Geometria {

	public static void main(String[] args) {
		
		ArrayList<Figura> camere = new ArrayList<Figura>();
		Scanner sc = new Scanner(System.in);
		boolean finito = false;
		String camera = "", formaCamera="";
		int base, altezza;
		while (!finito) {
			
			System.out.println("inserisci tipo camera");
			camera = sc.next();
			
			System.out.println("inserisci forma (t,r,q)");
			formaCamera = sc.next();
			
			switch(formaCamera) {
			case "t":
				System.out.println("inserisci base");
				base = sc.nextInt();
				System.out.println("inserisci altezza");
				altezza = sc.nextInt();
				camere.add(new Triangolo(camera,base, altezza));
				break;
			case "r":
				System.out.println("inserisci base");
				base = sc.nextInt();
				System.out.println("inserisci altezza");
				altezza = sc.nextInt();
				camere.add(new Rettangolo(camera,base, altezza));
				break;
			case "q":
				System.out.println("inserisci lato");
				base = sc.nextInt();
				camere.add(new Quadrato(camera,base));
				break;
			}
		
			System.out.println("premi un tasto per continuare oppure 0 per uscire");
			if (sc.next().equals("0"))
				finito = true;
		}
		double metratura =0;
		for (Figura figura : camere) {
			System.out.print (figura);
			metratura += figura.area();
		}
		System.out.println("metratura = " + metratura);
		System.out.println("piastrelle = " + (metratura / 0.4));
	}
	
}
