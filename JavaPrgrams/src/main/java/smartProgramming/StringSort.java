package smartProgramming;

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[]= {"Pandu","Shashi","Test","Kumar","Vasu","Rahul"};
		//int temp;
		String temp;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a.length-1-i;j++)
			{
				//if(a[j]>a[j+1])
				if(a[j].compareTo(a[j+1])>0)	
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}

		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}




