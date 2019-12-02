package collezioni;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ProvaLIste {

	public static void main(String[] args) {
		
		String[] nanetti = {"pisolo", "mammolo"};
		List<String> nani = new ArrayList<>();
		for (String string : nanetti) {
			nani.add(string);
		}
		System.out.println(nani.size());
		
		List<String> nani2 = new LinkedList<>();
		for (String string : nanetti) {
			nani2.add(string);
		}		
		System.out.println(nani2.size());		
		
		List<String> nani3 = new Vector<>();
		for (String string : nanetti) {
			nani3.add(string);
		}		
		System.out.println(nani3.size());		

	}

}
