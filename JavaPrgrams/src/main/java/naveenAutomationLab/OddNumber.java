package naveenAutomationLab;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter even or odd number::");
		int n = sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Is an even number::"+n);
		}
		else
		{
			System.out.println("Is not an even number::"+n);
		}

	}

}
