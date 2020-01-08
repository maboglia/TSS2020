package mappe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProvaStream {

	public static void main(String[] args) throws IOException {


		//1 stream interi
//		IntStream.range(0, 101).forEach(System.out::println);
		//2 skip
		IntStream.range(0, 101).skip(50).forEach(System.out::println);
		//3 findFirst
		IntStream.range(0, 101).findFirst().ifPresent(System.out::println);
		//4 stream di array di stringhe
		Stream.of("mi", "re", "do").sorted().forEach(System.out::println);
		//5 stream di array di stringhe
		String[] note = {"mi", "re", "do","fa","sol", "la", "si"};
		Arrays.stream(note).filter(n -> n.length()<3).sorted().forEach(System.out::println);
		//6 stream di array di interi
		Arrays.stream(new int[] {2,8,6,3,4,9,5})
				.map(x -> x*2)
				.average()
				.ifPresent(System.out::println);
		//7 stream su List
		List<String> noteList = Arrays.asList(note);
		noteList.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println(noteList);
		
		//8 stream su file
		Stream<String> ore = Files.lines(Paths.get("aula.txt"));
		ore.filter(s -> s.startsWith("10")).forEach(System.out::println);
		ore.close();
		System.out.println("----------------------------------------------");
		//9 ritorna una collezione
		List<String> oreList = Files.lines(Paths.get("aula.txt"))
									.filter(s -> s.startsWith("10"))
									.collect(Collectors.toList());
	
	}

}
