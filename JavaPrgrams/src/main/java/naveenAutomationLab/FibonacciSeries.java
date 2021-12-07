package naveenAutomationLab;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Fibonacci Series Number::");
		int n=sc.nextInt();
		int f1=0,f2=1,f3=0;
		for(int i=1;i<=n;i++)
		{
			System.out.println("Fibonacci Series Number:"+f3);
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}

	}

}
