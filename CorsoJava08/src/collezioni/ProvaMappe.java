package collezioni;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProvaMappe {

	public static void main(String[] args) {

		Map<String, String> risultati = new HashMap<>();
		risultati.put("46", "rossi");
		risultati.put("93", "marquez");
		risultati.put("12", "vinales");
		risultati.put("04", "dovizioso");
		risultati.put("46", "mattia");
		
//		System.out.println(risultati.size());
//		System.out.println(risultati.get("46"));
		
		Set<String> chiavi = risultati.keySet();
		List<String> piloti = (List<String>) risultati.values();
		for (String string : chiavi) {
			System.out.println(risultati.get(string));
		}
//		Collections.sort(piloti);
//		for (String pilota : piloti) {
//			System.out.println(pilota);
//		}
//		
//		
		
	}

}
