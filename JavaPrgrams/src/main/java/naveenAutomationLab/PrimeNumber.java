package naveenAutomationLab;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Prime Number::");
		int n=sc.nextInt();
		int temp=0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
		}

	}
	if(temp==0)
	{
		System.out.println("Is Prmie Number::" +n);
	}
	else
	{
		System.out.println("Is not Prime::" +n);
	}
	}
}
