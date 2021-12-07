package smartProgramming;

import java.util.HashSet;

public class RemoveDuplicateElements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,2,2,3,4,5,5,5,5};
		HashSet<Integer> h=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			h.add(a[i]);
			
		}
		for(int no:h)
		{
			System.out.println(no+"");
		}

	}

}
