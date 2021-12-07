package trickyInterviewQuestionsNaveen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String infra[]= {"Azure", "AWS","GCP","Ali Baba","SauceLabs","AWS","Azure","GCP"};
		
		//1. Brute force
		//2.HashSet
		//3.HashMap<K,V>
		//4. Streams
		
		System.out.println("Brute Force");
		
		for(int i=0; i<infra.length;i++)
		{
			for (int j=i+1;j<infra.length;j++)
			{
				if(infra[i].equals(infra[j]))
				{
					System.out.println(infra[i]);
				}
			}
		}
		
		System.out.println("*******Hash Set*****************");
		
		Set<String> data= new HashSet<String>();
		
		for(String e:infra)
		{
			if(data.add(e) == false)
			{
				System.out.println(e);
			}
		}
		
    System.out.println("*******Hash Map*****************");
		
		Map<String, Integer> infraMapa= new HashMap<String,Integer>();
		
		for(String e:infra)
		{
			Integer count=infraMapa.get(e);
			
			if(count == null)
			{
				infraMapa.put(e, 1);
			}
			else
			{
				infraMapa.put(e, ++count);
			}
		}
			
			// Print Duplicate elements 
			
			Set<Entry<String, Integer>> entrySet=infraMapa.entrySet();
			for(Entry<String, Integer> entry:entrySet)
			{
				if(entry.getValue()>1)
				{
					System.out.println(entry.getKey());
				}
			}
		}
		
	}



