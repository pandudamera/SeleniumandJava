package naveenAutomationLab;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Prime Number::");
		int n=sc.nextInt();
		int r=0;
		int a=n;
		int remainder;
		while(n>0)
		{
			remainder=n%10;
			r=r*10+remainder;
			n=n/10;
		}
		if(a==r)
		{
			System.out.println("Is Palindrome ::" +a);
		}
		else
		{
		System.out.println("Is not Palindrome ::" +a);
		}
	}

}
