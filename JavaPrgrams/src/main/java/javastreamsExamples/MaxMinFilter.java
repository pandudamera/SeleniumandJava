package javastreamsExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class MaxMinFilter {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 40, 19, 3,40);
		int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
		
		int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);


	}

}
