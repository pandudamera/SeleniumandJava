package smartProgramming;

public class Arrays2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{10,20,30,90},{40,50},{60,70,80}};
		//System.out.println(a[0][0]);
		//System.out.println(a.length);
		//System.out.println(a[0].length);
		//System.out.println(a[0][0].length);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
