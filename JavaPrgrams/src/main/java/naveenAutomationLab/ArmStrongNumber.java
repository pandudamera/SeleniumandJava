package naveenAutomationLab;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ArmStrong number::");
		int n = sc.nextInt();
		int a=n;
		int r=0;
		int remainder;
		while(n>0)
		{
			remainder=n%10;
			r=r+(remainder*remainder*remainder);
			n=n/10;
		}
		if(a==r)
		{
			System.out.println("is ArmStrong number:"+a);
		}
		else
		{
			System.out.println("is not ArmStrong number:"+a);
		}

	}

}
