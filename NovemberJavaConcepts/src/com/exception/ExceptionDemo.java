package com.exception;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		int rd = 100, dr = 10, result;
    Scanner sc=new Scanner(System.in);
    
		while(true)
		{
			System.out.println("Eneter the nr values:");
			dr=sc.nextInt();
			System.out.println("Eneter the dr values:");
			dr=sc.nextInt();
		
		try {
			//result = rd + dr;
			result=rd/dr;
			System.out.println(result);
			break;
		} 
		
		catch (Exception e) {

			e.printStackTrace();
		}
		}
	}
}
