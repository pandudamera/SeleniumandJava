package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RepeatedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,8,1,4,4,8,5,6,8,7,9,11,2,8};
		int[] array = new int [50];
		int count =0;
		Arrays.sort(a);
		for(int i=1;i<a.length;i++)
		{
			if(a[i]!=a[i-1])
			{
				count++;
				if(count==1)
				{
					System.out.println(a[i]);
				}
			}
			else
			{
				count=0;
			}
		}
	}
	}

	/*{
		
Map<Integer,Integer> counterMap = new HashMap<>();

//fill the array

    for(int i=0;i<array.length;i++){
         if(counterMap.containsKey(array[i])){
          counterMap.put(array[i], counterMap.get(array[i])+1 );
         }else{
          counterMap.put(array[i], 1);
         }
    }
    }
	}
}
*/
	


