package smartProgramming;

public class MaximumValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,30,40,3,4};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum and Minimum values::" +max);

	}

}
