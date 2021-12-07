package smartProgramming;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,5,4,3,2,2,1};
		System.out.print("Duplicate Elements Are::");
		Set<Integer>h=new HashSet<Integer>();
		for(int n:a)
		{
			boolean b=h.add(n);
			if(b==false)
			{
				System.out.print(n+" ");
			}
		}

	}

}
