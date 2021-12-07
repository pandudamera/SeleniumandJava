package trickyInterviewQuestionsNaveen;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	// How to Print Duplicate charater from String//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDuplicateCharacters("A");
		printDuplicateCharacters("");
		printDuplicateCharacters(null);
		printDuplicateCharacters("javata");
		printDuplicateCharacters("Naveen");
		printDuplicateCharacters("tesla");

	}

	
	
	public static void printDuplicateCharacters(String str)
{
		if(str==null) {
			System.out.println("NULL String");
			return;
		}
		
		if(str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}
		if(str.length()==1)
		{
			System.out.println("Single Character String");
			return;
		}
		char words[]=str.toCharArray();
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		for(Character ch: words)
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		}
		
	// Print Map
	Set<Map.Entry<Character, Integer>> entrySet=charMap.entrySet();	
	
	for(Map.Entry<Character, Integer> entry:entrySet)
	{
		if(entry.getValue()>1)
		{
			System.out.println(entry.getKey() +":" + entry.getValue());
		}
}
}
	}
