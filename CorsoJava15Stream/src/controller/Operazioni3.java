package controller;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Operazioni3 {

	public static void main(String[] args) throws IOException {

		List<String> moto = Arrays.asList("Yamaha", "BMW", "Honda", "Ducati");
		moto.stream().map(String::toUpperCase).filter(m->m.endsWith("A")).forEach(System.out::println);
		//un plus per biagio, che ci è arrivato subito, dimostrando incredibili doti ddi osservazione e perspicacia, oltre ad una inngegabile conoscenza del linguaggio java, anche nella sua evoluzione funzionale. ma chi è quest'uomo!?
		Stream<String> versi = Files.lines(Paths.get("divina.txt"), Charset.forName("Cp1252"));
		//versi.filter(s -> s.contains("disgusto")).sorted().forEach(System.out::println);
		
		List<String> versiBiagio = versi.filter(v -> v.contains("selva")).collect(Collectors.toList());
		versiBiagio.forEach(System.out::println);
		
		Stream<String> ore = Files.lines(Paths.get("aula.txt"), Charset.forName("Cp1252"));
		ore.map(s->s.split(",")).forEach(as -> System.out.println(as[0] + as[1]));
		
		
	}

}
