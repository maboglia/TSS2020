package controller;

import java.util.Arrays;
import java.util.stream.Stream;

public class Operazioni2 {

	public static void main(String[] args) {

//		Stream.of("do","re","mi", "fa","sol", "la","si")
//			.sorted()
//			.findFirst().ifPresent(System.out::println);
//		

//		String[] note = { "do","re","mi", "fa","sol", "la","si"};
//		Arrays.stream(note).filter(nota -> nota.startsWith("r")).forEach(System.out::print);
//		
		Arrays.stream(new int[] {1,3,5,7,9}).map(x -> x * 3).forEach(System.out::print);
		Arrays.stream(new int[] {1,3,5,7,9}).map(x -> x * 3).average().ifPresent(m->System.out.println( "media: " +m ));
	
	}

}
