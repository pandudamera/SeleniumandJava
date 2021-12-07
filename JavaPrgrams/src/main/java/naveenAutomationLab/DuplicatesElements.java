package naveenAutomationLab;

import java.util.HashSet;

public class DuplicatesElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"Pandu","Java","Python","C++","Java","Python"};
				//o(n) approach :Approach
		for(int i=1;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					System.out.println("Duplicate Element is::" +s[i]);
				}
			}
		}
		
		System.out.println("#############################");
         //Using HashSet:Second Approach
		HashSet<String> h = new HashSet<String>();
		for (String s1 : s) {
			if (h.add(s1) == false) {
				System.out.println("Duplicate Elements are:" + s1);
			}
		}
	}

}
