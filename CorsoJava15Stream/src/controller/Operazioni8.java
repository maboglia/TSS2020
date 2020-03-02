package controller;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Operazioni8 {

	
	
	public static void main(String[] args) {
	
		
		Map<String, Integer> popolazione = new TreeMap<>((o1,o2) -> o1.length()-o2.length());
		
		popolazione.put("Torino", 1_000_000);
		popolazione.put("Roma", 3_000_000);
		popolazione.put("Milano", 2_000_000);

		//System.out.println(popolazione.get(1));
		
		Set<String> keySet = popolazione.keySet();
		Collection<Integer> values = popolazione.values();
//	Iterator<Map.Entry<String, Integer>> it = popolazione.entrySet().iterator();
//	while(it.hasNext()) {
//		String s = it.next().getKey();
//		Integer pop = it.next().getValue();
//		System.out.println(s +  " ha una popolazione di " + pop);
//	}

		Set<String> citta = popolazione.keySet();
		for (String string : citta) {
			System.out.println(string + " ha abitanti " + popolazione.get(string));
		}
		

	}
	
}
