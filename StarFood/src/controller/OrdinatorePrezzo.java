package controller;

import java.util.Comparator;

import model.Prodotto;

public class OrdinatorePrezzo implements Comparator<Prodotto> {

	@Override
	public int compare(Prodotto o1, Prodotto o2) {
		
		double result = o1.getPrezzo()-o2.getPrezzo();
		if (result > 0)
			return 1;
		else if (result < 0)
			return -1;
		else
			return 0;
	}

}
