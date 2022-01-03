package naveenAutomationLab;

public class SumofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]={1,2,3,4,5}
		//1+2+3+4=10
		//1+2+3++4+5=15
		//sum=15-10=5
		int a[]= {1,0,1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int j=0;j<=a.length;j++)
		{
			sum1=sum1+j;
	
		}
		System.out.println(sum1);
		System.out.println("The Sum of Value::" +(sum1-sum));
		

	}

}
