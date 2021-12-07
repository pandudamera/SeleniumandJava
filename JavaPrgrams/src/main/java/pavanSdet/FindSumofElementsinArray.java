package pavanSdet;

public class FindSumofElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,2,7,9,6};
		int sum=0;
		/*for(int i=0;i<=a.length-1;i++) //a.length=4 0,1,2,3,4
		{
			sum=sum+a[i]; //5+2+7+9+6=29
		}*/
		
		for(int b:a)
		{
			sum=sum+b;
		}
		
		System.out.println("Sum of Elements in Array::"+sum);

	}

}
