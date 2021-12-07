package trickyInterviewQuestionsNaveen;

import java.util.Arrays;
import java.util.stream.Stream;

import com.google.common.collect.ObjectArrays;
import com.google.common.primitives.Ints;

public class ArrayJoins {

 /*Join Two arrays using java 8 Google guava library*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] batsme= {
				"Rohit","Virat","Dhawan","Shreyas","Rishabh","Rahul"
				
		};
		
		String [] bowlers= {
				"Hard","Bhuvi","Bumrah","Chahal","Jaddu"
		};
		//With Java 8
		System.out.println("##########################");
		Stream<String>sBat=Arrays.stream(batsme);
		Stream<String>sBow=Arrays.stream(bowlers);
		String fullTeams[]=Stream.concat(sBat, sBow).toArray(size ->new String[size]);
		for(String s:fullTeams)
		{
			System.out.println(s);
		}
		
		System.out.println("##########################");
		// Google guava library
		// for objective type arrays
		String allTeams[]=ObjectArrays.concat(batsme, bowlers,String.class);
		for(String s:allTeams)
		{
			System.out.println(s);
		}
		System.out.println("##########################");
		// for primitive types arrays
       int p1[]= {1,2,3,4};
       int p2[]= {5,6,7,8,9};
       int p3[]=Ints.concat(p1,p2);
       for(int i:p3)
       {
    	   System.out.println(i);
       }
	}

}
