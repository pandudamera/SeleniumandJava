package pavanSdet;

import java.util.Scanner;

public class FactorialofaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number::");
		int n = sc.nextInt();
		int fact=1;
		for(int i=n;i>=1;i--)
		//for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of a Number::"+fact);

	}

}
