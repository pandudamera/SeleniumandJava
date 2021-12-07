package pavanSdet;

import java.util.HashSet;

public class FindDuplicateElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"Pandu","Java","Python","C++","Java","Python"};

		HashSet<String> h=new HashSet();
		for(String s1:s)
		{
			if(h.add(s1)==false)
			{
				System.out.println("Duplicate Elements are:" +s1);
			}
		}
	}
}		