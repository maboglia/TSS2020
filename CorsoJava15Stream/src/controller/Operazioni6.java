package controller;

import java.util.ArrayList;
import java.util.Arrays;

public class Operazioni6 {

	
	public static void main(String[] args) {
		ArrayList<Integer> numeri = new ArrayList<>();
		numeri.addAll(Arrays.asList(1,2,3,4,5,6));
		System.out.println(numeri.get(3));		
		numeri.set(3, 75);
		System.out.println(numeri.get(3));
		numeri.remove(3);
		for (int x :numeri ) {
			System.out.println(x);
		}
	}



}
