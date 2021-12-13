package icici.loan.homeloan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SwapExamples {

	public static void main(String[] args) {


		ArrayList<String> al=new ArrayList<String>();
		al.add("Pandu");
		al.add("Damera");
		al.add("Shashi");
		al.add("Swapna");
		al.add("Vijayamma");
		al.add("Krishnama Naidu");
		
		for(String str:al)
		{
			System.out.println("Array List Values Retriving from the list:" +str);
			System.out.println("****************************************");
		}
		
		int size=al.size();
		
			for(int i=0;i<size;i++)
			{
				System.out.println(al.get(i));
		}
		Iterator<String> it=al.iterator();
		while(it.hasNext())
		{
			String str2=it.next();
			System.out.println(str2);
			System.out.println("****************************************");
		}
		System.out.println("Before Swapping:" +al);
		Collections.swap(al, 1, 5);
		System.out.println("After Swapping:" +al);
		System.out.println("****************************************");
		System.out.println("Before Sorting:" +al);
		Collections.sort(al);
		System.out.println("After Sorting:" +al);
		List<String> l=Collections.synchronizedList(al);
		System.out.println(l);
		
		System.out.println("****************************************");
		
		HashMap<Integer, String> mp=new HashMap<Integer, String>();
		mp.put(111, "Pandu");
		mp.put(112, "Damera");
		mp.put(113, "Shashi");
		mp.put(114, "Swapna");
		mp.put(115, "Vijayamma");
		mp.put(116, "Krishnama Naidu");
		// Key set() to get all keys
		Set<Integer> s1=mp.keySet();
		System.out.println("All Keys....***:" +s1);
		// values() to get all values
		Collection<String> s2=mp.values();
		System.out.println("All Values******:" +s2);
		// entrySet to get all entries
		Set ss=mp.entrySet();
		System.out.println("All Entries******:" +ss);
		
		for(Map.Entry m:mp.entrySet())
		{
			System.out.println("All Entries******:" +m.getKey()+"********"+m.getValue());
		}

	}

}
