package controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Operazioni7 {

	public static void main(String[] args) {
		HashSet<String> nomi = new HashSet<>();
		nomi.add("federica");
		nomi.add("mihai");
		nomi.remove("mihai");
		nomi.add("mihai");
		nomi.add("eugenio");
		for (String nome : nomi) {
			System.out.println(nome);
		}

		LinkedHashSet<Integer> voti = new LinkedHashSet<>();
		voti.add(30);
		voti.add(20);
		voti.add(24);
		voti.add(24);
		voti.forEach(System.out::println);
	
		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		};
		//e stavolta persino matteo (non so se mi spiego!!) ha contato male le lettere
		TreeSet<String> note = new TreeSet<>(comp);
		note.addAll(Arrays.asList("do","rere","mimimi","fafafafaf","sol","lalaland", "si"));
		note.forEach(System.out::println);
	}

}
