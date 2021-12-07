package smartProgramming;

public class DeleteAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,40,50,60,70};
		int delete=30;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(delete==a[i])
			{
				for(int j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
				}
				count=count+1;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Element is not found");
		}
		else
		{
			System.out.println("Element is delete sucessfully");
		
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]+"");
		}

	}
	}
	

}
