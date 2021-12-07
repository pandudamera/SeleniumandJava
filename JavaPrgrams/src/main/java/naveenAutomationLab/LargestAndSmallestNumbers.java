package naveenAutomationLab;

import java.util.Arrays;

public class LargestAndSmallestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {1,4,40,50,90,100,150,200};
		int largest=n[0];
		int smallest=n[0];
		//Time Complexity O(N)
		for(int i=1;i<n.length;i++)
		{
			if(n[i]>largest)
			{
				largest=n[i];
			}
			else if(n[i]<smallest)
			{
				smallest=n[i];
			}
		}
		System.out.println("\nGiven Array is:"+Arrays.toString(n));
		System.out.println("Larest Number Is::"+largest);
		System.out.println("Smallest Number Is::" +smallest);

	}

}
