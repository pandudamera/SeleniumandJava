package smartProgrammingPattern;

import java.util.ArrayList;
import java.util.*;

public class ZerosAndOnes {

	public static void print(int arr[], int n) {
		System.out.print("Array after segregation is ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static int[] segregate0and1(int arr[], int n) {
		int zeroIndex = n - 1;
		int oneIndex = 0;
		int outputArray[] = new int[n];
		// int zeroCount = 0;
		// int oneCount = 0;
		// int count = 0;
		// ArrayList<Integer> sortList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				outputArray[zeroIndex] = arr[i];
				zeroIndex--;
				// zeroCount++;
			} else {
				outputArray[oneIndex] = arr[i];
				oneIndex++;
				// oneCount++;
			}
			/*
			 * else{ sortList.add(arr[i]); count++; }
			 */
		}

		// outputArray = finalArrayCal(sortList,outputArray,zeroCount,oneCount,count);
		return outputArray;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 0, 1, 0, 1, 0, 1, 0, 1 };
		int n = arr.length;
		int outputArray[] = segregate0and1(arr, n);
		print(outputArray, outputArray.length);
	}

}
