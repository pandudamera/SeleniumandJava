package smartProgramming;

public class StringSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]= {38,52,9,18,6,62,13};
		
		String[] a= {"Pandu","Shashi","Test","Kumar","Vasu","Rahul"};
		String temp="";
		int min;
		//int min,temp=0;
		for(int i=0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j].compareTo(a[min])<0)
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
				
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}

	}

}
