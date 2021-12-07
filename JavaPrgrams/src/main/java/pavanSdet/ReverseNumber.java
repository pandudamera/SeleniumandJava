package pavanSdet;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  number::");
		int n = sc.nextInt();
		//1.Use Algorithm 
		/*int rev=0;
		while(n!=0)
		{
			rev=rev*10+n%10; //0+1234%10=4 40+3=43
			n=n/10;
		}*/
		//2. Use StringBuffer
		
		/*StringBuffer sb=new StringBuffer(String.valueOf(n));
		StringBuffer rev=sb.reverse();*/
		
		//3.Use StringBuilder 
		StringBuilder sbl=new StringBuilder();
		sbl.append(n);
		StringBuilder rev=sbl.reverse();
		System.out.println("Reverse The Number is:" +rev);

	}

}
