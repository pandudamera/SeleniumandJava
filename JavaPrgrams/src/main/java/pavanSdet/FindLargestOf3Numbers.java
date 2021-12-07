package pavanSdet;

import java.util.Scanner;

public class FindLargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number::");
		int a = sc.nextInt();
		System.out.println("Enter number::");
		int b = sc.nextInt();
		System.out.println("Enter number::");
		int c = sc.nextInt();
		//1.Approach
		/*if(a>b&&a>c)
		{
			System.out.println("A is Largest number::" +a);
		}
		else if(b>a&&b>c)
		{
			System.out.println("B is Largest number::" +b);
		}
		else
		{
			System.out.println("C is Largest number::" +a);
		}*/
		
		////2.Approach
		//Ternary Operator 
		/*int largest1=a>b?a:b;
		int largest2=c>largest1?c:largest1;*/
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("Is Largest Number::" +largest);
		//System.out.println("Is Largest Number::" +largest2);

	}

}
