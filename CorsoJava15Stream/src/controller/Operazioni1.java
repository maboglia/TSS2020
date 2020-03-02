package controller;

import java.util.stream.IntStream;

public class Operazioni1 {

	public static void main(String[] args) {
		
		//IntStream
		IntStream.range(1, 91).filter(e -> e%2==0).forEach(n -> System.out.println(n));
		long somma = IntStream.range(1, 91).filter(e -> e%2==0).count();
		System.out.println(somma);
		
		
		
		
	}
	
	
	
}
