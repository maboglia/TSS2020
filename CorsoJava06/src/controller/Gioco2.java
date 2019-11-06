package controller;

import java.util.ArrayList;

import model.Dado;

public class Gioco2 {

	private ArrayList<ArrayList<Integer>> coppie;
	private Dado d1, d2;
	public Gioco2() {

		this.coppie = new ArrayList<ArrayList<Integer>>();
		
		this.d1 = new Dado("bianco", 6);
		this.d2 = new Dado("bianco", 6);
	}
		
	
}
