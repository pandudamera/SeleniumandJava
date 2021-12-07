package naveenAutomationLab;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Leap Year::");
		int year = sc.nextInt();
		{
			if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))

			{
				System.out.println("Is a leap year::" + year);
			} else {
				System.out.println("Is not a leap year::" + year);

			}

		}

	}
}
