package naveenAutomationLab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] inputrray= {1,2,3,4,1,3,5,6,22,1};
		int count=elementRepetedHighestTimes(inputrray);
		System.out.println(" ************************************* Highet number of times ***************************************");
		System.out.println(count);
	

	}
	
	public static int elementRepetedHighestTimes(int inputArray[])
	{
		int count=0;
		ArrayList<Integer> list=new ArrayList<Integer>(inputArray.length);
		for(int i:inputArray)
		{
			list.add(i);
		}
		//List<Integer> frequencyList=new ArrayList<Integer>();
		Map<Integer, Integer> frequency=new HashMap<Integer, Integer>();
		Set<Integer> distinct=new HashSet<Integer>(list);
		for(Integer element:distinct)
		{
			System.out.println(element + ":" +Collections.frequency(list, element));
			frequency.put(element, Collections.frequency(list, element));
		}
		int maxValueInMap=(Collections.max(frequency.values()));
		for(Map.Entry<Integer, Integer> entry:frequency.entrySet())
		{
			if(entry.getValue()==maxValueInMap)
			{
				count=entry.getKey();
			}
		}
		return count;
		
	}

}
