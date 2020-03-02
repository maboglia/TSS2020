package controller;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Operazioni9 {

	public static void main(String[] args) throws IOException {

		Stream<String> studenti = Files.lines(Paths.get("aula.txt"), Charset.forName("Cp1252"));
		Map<Object, Object[]> mappa = new HashMap<>();
		
		mappa = studenti
				.map(x -> x.split(","))				
				.collect(Collectors.toMap(x -> x[0], x -> Arrays.copyOfRange(x, 1, 22)));

		Set<Object> keySet = mappa.keySet();
		for (Object object : keySet) {
			String chiave = (String) object;
			System.out.println(chiave);
			Object[] valori = mappa.get(chiave);
			Stream<Object> valori2 = Stream.of(mappa.get(chiave));
			Stream.of(valori).forEach(voto -> {
				double v = Double.parseDouble((String) voto);
				System.out.print(v);
				});
			
				
			System.out.println("----------------");
		}
		
	}

}
