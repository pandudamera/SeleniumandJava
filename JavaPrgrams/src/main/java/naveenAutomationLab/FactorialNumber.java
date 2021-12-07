package naveenAutomationLab;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Factorial Number::");
		int n = sc.nextInt();
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact = fact * i;
			
		}
		System.out.println("Factorial of the given no is::" + fact);
	}

}
