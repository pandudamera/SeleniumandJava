package javastreamsExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {
		
		// 1. Approach 
		List<Integer> list = Arrays.asList(1, 3,10, 20,30, 15,1,13,1,2,2,10,30,19,3);
		Set<Integer> dulicatesNumbers = list.stream().filter(e->Collections.frequency(list,e)>1).collect(Collectors.toSet());
		System.out.println(dulicatesNumbers);
		
		//2.Approach
		
		Set<Integer> duplic=new HashSet<Integer>();
		Set<Integer> dulicatesNumbers1=list.stream().filter(e->!duplic.add(e)).collect(Collectors.toSet());
				
		System.out.println(dulicatesNumbers1);
	}

}
