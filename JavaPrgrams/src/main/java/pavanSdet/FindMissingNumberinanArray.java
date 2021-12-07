package pavanSdet;

public class FindMissingNumberinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays should not duplicate
		//Arrays are not sorted order
		//Value should be in range
		
		//1+2+4+5=12--sum
		//1+2+3+4+5=15--sum1
		//sum1-sum=15-12=3
		int a[]= {1,2,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of elements in array is:" +sum);
		
		int sum1=0;
		
		for(int i=0;i<=5;i++)
		{
			sum1=sum1+i;
		}
		System.out.println("Sum of range of elements in array is:" +sum1);
		System.out.println("Missing Number is:" +(sum1-sum));

	}

}
