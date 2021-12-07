package com.test;

import java.util.HashMap;
import java.util.Map;


public class CountingRepeatedElements {

	public static void main(String[] args) {

		int[] array = new int[] {1,2,3,2,4,5,6,7,8,6,9,9,9};
		Map<Integer, Integer> counterMap = new HashMap<Integer, Integer>();

		// fill the array

		for (int i = 0; i < array.length; i++) {
			if (counterMap.containsKey(array[i])) {
				counterMap.put(array[i], counterMap.get(array[i]) + 1);
			} else {
				counterMap.put(array[i], 1);
			}
		}
		System.out.println("Repeated Numbers::" +counterMap);
	}
}