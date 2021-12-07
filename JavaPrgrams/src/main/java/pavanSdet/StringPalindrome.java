package pavanSdet;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ::");
		String  n = sc.next();
		
		//1. USing + (String Concatenation) operator
		
		int len=n.length();
		String rev="";
		String org=n;
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+n.charAt(i);
		}
		if(rev.equals(org))
		{
			System.out.println("Is String Palindrome::" +rev);
		}
		else
		{
		System.out.println("Is not String Palindrome::" +rev);
		}
	}

}
