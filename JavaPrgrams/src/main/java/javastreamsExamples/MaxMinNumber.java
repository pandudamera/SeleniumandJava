package javastreamsExamples;

public class MaxMinNumber {

	// Find out Max and Min number out of three positive numbers 
	
		public static void main(String[] args) {
			findMaxNumber(20, 30, 60);
			findMinNumber(30, 70, 100);

		}
		
		public static void findMaxNumber(int a, int b, int c)
		{
			int max=0;
			while(a>0 || b>0 || c>0)
			{
				a--;
				b--;
				c--;
				max++;
			}
			System.out.println(max);
		}
		public static void findMinNumber(int a, int b, int c)
		{
			int min=0;
			while(a>0 && b>0 && c>0)
			{
				a--;
				b--;
				c--;
				min++;
			}
			System.out.println(min);
		}

	}
