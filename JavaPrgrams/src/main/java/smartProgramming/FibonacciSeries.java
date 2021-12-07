package smartProgramming;
import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter FibonacciSeries Numbers ::");
		int n=sc.nextInt();
		int a,b=0,c=1;
		
		for(int i=0;i<=n;i++)
		{
		System.out.println("Out Put Values Are::" +c);
			a=b;
			b=c;
			c=a+b;
				
		}

	}

}
