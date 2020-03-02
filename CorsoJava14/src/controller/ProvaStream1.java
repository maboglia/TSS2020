package controller;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProvaStream1 {

	public static void main(String[] args) {

		//stream di interi
		IntStream.range(1, 11).skip(3).forEach(System.out::println);

		Stream.of("pino", "gino", "lino", "nino").sorted().forEach(System.out::println);
		Stream.of("pino", "gino", "lino", "nino").findFirst().ifPresent(System.out::println);
		
	}

}
