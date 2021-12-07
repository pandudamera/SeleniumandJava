package pavanSdet;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ::");
		String  n = sc.next();
		
		//1. USing + (String Concatenation) operator
		//String s="ABCD";
		
		/*int len=n.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+n.charAt(i);
		}*/
		
		//2.Using Character Array 
		
		/*char a[]=n.toCharArray();
		int len=n.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}*/
		
		//3.Using String Buffer
		
		StringBuffer sb=new StringBuffer(n);
		
		System.out.println("Reverse The String::" +sb.reverse());
		

	}

}
