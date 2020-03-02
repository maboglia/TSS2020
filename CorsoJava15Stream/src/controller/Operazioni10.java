package controller;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Operazioni10 {

	public static void main(String[] args) {

		 IntSummaryStatistics stats = IntStream.of(1,2,5,78,9,45).summaryStatistics();
		 System.out.println(stats);

	}

}
