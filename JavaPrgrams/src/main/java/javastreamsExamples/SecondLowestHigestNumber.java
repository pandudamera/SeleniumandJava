package javastreamsExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestHigestNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(0, 3,10, 20,30, 15,1,13,1,2,2,10,40,19,3,40);
		//secondHighest 
		int secondHighest=list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println(secondHighest);
		int secondHighestnumber=list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secondHighestnumber);
		//Second Lowest 
		int secondLowest=list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secondLowest);

	}

}
