package smartProgramming;

public class DuplicateElements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,5,4,3,2,2,1};
		System.out.println("Duplicate Elements Are::");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]==a[j])&&(i!=j))
				{
					System.out.println("" +a[i]);
				}
			}
		}

	}

}
