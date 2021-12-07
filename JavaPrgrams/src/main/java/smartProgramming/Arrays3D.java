package smartProgramming;

public class Arrays3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][][]= {{{10,20},{30,40,50,90},{60,70,80}}};
		/*System.out.println(a);
		System.out.println(a[0][0]);
		System.out.println(a[0][0][0]);
		System.out.println(a[0][0][1]);
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[0][0].length);
		System.out.println(a[0][1].length);*/
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.print(a[i][j][k]+" ");
			}
			
			System.out.println();
		}

	}
		
	}

}
