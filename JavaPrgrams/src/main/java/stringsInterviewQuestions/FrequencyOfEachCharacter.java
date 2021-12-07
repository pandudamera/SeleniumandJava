package stringsInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachCharacter {

	// Java program to count occurrence of each  a character in a string
	// Str="Java" {j=1,a=2,v=1}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Programmming";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(Character c:str.toCharArray())
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println(map);

	}

}
