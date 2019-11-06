package controller;

import java.util.ArrayList;

import model.Dado;

public class Gioco {

	private ArrayList<Integer> c1,c2,c3,c4,c5,c6;
	private Dado d1, d2;
	public Gioco() {

		this.c1 = new ArrayList<>();
		this.c2 = new ArrayList<>();
		this.c3 = new ArrayList<>();
		this.c4 = new ArrayList<>();
		this.c5 = new ArrayList<>();
		this.c6 = new ArrayList<>();
		this.d1 = new Dado("bianco", 6);
		this.d2 = new Dado("bianco", 6);
	}
	
	public String gioca(int nVolte) {
		int sommaSuccessi=0;
		for (int i = 0; i < nVolte; i++) {
			
			if(d1.lancia()-d2.lancia()==0){
				
				switch (d1.getValoreDado()) {
				case 1:	c1.add(1);	break;
				case 2:	c2.add(2);	break;		
				case 3:	c3.add(3);	break;					
				case 4:	c4.add(4);	break;					
				case 5:	c5.add(5);	break;					
				case 6:	c6.add(6);	break;					
				default:			break;
				}
				
			}
			
			
		}
		sommaSuccessi = 
				c1.size() +
				c2.size() +
				c3.size() +
				c4.size() +
				c5.size() +
				c6.size() ;
		return "hai vinto " + sommaSuccessi + " volte!"; 
		
		
	}

	public ArrayList<Integer> getC1() {
		return c1;
	}

	public ArrayList<Integer> getC2() {
		return c2;
	}

	public ArrayList<Integer> getC3() {
		return c3;
	}

	public ArrayList<Integer> getC4() {
		return c4;
	}

	public ArrayList<Integer> getC5() {
		return c5;
	}

	public ArrayList<Integer> getC6() {
		return c6;
	}
	
	
	
}
