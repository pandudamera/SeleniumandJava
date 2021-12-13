package javastreamsExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateNumbersArrays {

	public static void main(String[] args) {


		 
		Integer[] arr=new Integer[] {1, 3,10, 20,30, 15,1,13,1,2,2,10,30,19,3} ;
		List<Integer> list = Arrays.asList(arr);
		Set<Integer> dulicatesNumbers = list.stream().collect(Collectors.toSet());
		Set<Integer> dulicatesNumbers1 = list.stream().filter(e->Collections.frequency(list,e)>1).collect(Collectors.toSet());
	    System.out.println(dulicatesNumbers);
	    System.out.println(dulicatesNumbers1);

	}

}
