package com.test;

public class DuplicateElementNumber {

	public static void main(String[] args) {
		
		
		int a[] = { 1, 2, 2,3, 4, 4,5, 6, 6,7};
		int n = a.length;
		int j = 0;
		for (int i = 0; i <n - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j++] = a[i];

			}
		}
		a[j++] = a[n - 1];

		for (int k = 0; k < j; k++) {
			System.out.println("Remove Duplicate numbers are::"+a[k]);
		}

	}

}
