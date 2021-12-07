package icici.loan.eduloan;

import java.util.Scanner;

public class Methods {
	// Fields, Constructor, Blocks , Nested Class, Interface
	
	public int add(int a,int b)
	{
		System.out.println("The addition is:" +(a+b));
	return a+b;
	}
	public static int mul(int a,int b)
	{
		System.out.println("The Multiplication is:" +(a*b));
	return a*b;
	}
	public static void main(String[] args) {
		
		System.out.println("Please enter two numbers:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Methods bv=new Methods();
		bv.add(a, b);
		
		Methods.mul(b, b );

	}

}
