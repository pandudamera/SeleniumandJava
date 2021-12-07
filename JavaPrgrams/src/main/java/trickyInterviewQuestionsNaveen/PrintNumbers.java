package trickyInterviewQuestionsNaveen;

import java.util.Arrays;
import java.util.BitSet;

public class PrintNumbers {

	// Print from to 1 to 100 without using loop and recursion
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Array Fill:
		
		Object num[]=new Object[100];
		Arrays.fill(num, new Object()
	{ 
			int count=0;
			public String toString()
			{
				return Integer.toString(++count);
				
			}
			
				});
		System.out.println(Arrays.toString(num));
		
		//2. BitSet :
		String set=new BitSet( ) {{set(1,101);}}.toString();
		System.out.append(set, 1, set.length());

	}

}
