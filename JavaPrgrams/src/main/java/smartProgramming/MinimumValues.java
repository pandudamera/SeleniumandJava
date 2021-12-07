package smartProgramming;

public class MinimumValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {20,30,40,3,4};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Maximum and Minimum values::" +min);

	}

}