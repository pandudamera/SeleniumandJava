package javastreamsExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWith {
	
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(2,22,234,567,890,432,236,211,22)	;
		
		// Even Numbers
		List<Integer> numberWith=numbers.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).map(Integer::valueOf)
				.collect(Collectors.toList());
		System.out.println(numberWith);

}
}
