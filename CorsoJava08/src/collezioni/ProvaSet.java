package collezioni;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProvaSet {

	public static void main(String[] args) {
	Set<Integer> chiavi = new TreeSet<>();
	Set<Integer> chiavi2 = new HashSet<>();
 
	int[] chiaviInglesi = {7,8,9,15,12,14,7,8,10,17,22,14};
	
	for (int i : chiaviInglesi) {
		chiavi.add(i);
		chiavi2.add(i);
	}
	System.out.println("------ciclo su chiavi TreeSet---------");
	for (int i : chiavi) {
		System.out.println(i);
	}
	
	System.out.println("------ciclo su chiavi2 HashSet---------");
	for (int i : chiavi2) {
		System.out.println(i);
	}
	
	System.out.println(chiaviInglesi.clone().length);
	System.out.println(chiavi.size());
	System.out.println(chiavi2.size());
	
	
	}

}
