package pavanSdet;

public class FindMaximumandMinimumValuesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {50,30,40,20,60};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)  //30>50
			{
				max=a[i];
			}
		}
		System.out.println("Maximum elements array:"+max);

		int b[]= {50,100,30,40,20,60};
		int min=b[0];
		for(int i=1;i<b.length;i++)
		{
			if(b[i]<min)  //30>50
			{
				min=b[i];
			}
		}
		System.out.println("Minimum elements array:"+min);
	}

}
