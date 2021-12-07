package trickyInterviewQuestionsNaveen;

import java.util.Arrays;
import java.util.OptionalDouble;

import com.google.common.math.DoubleMath;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class AverageArray {

	/*Calculate average of array using 
	simple loop
	java 8 and google guava library*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {1,2,3,4,5,3,2,3,4,5,6,9,10};
		double total=0;
		for(int e:num)
		{
			total=total+e;
		}
		System.out.println("Total:"+total);
		System.out.println("Avg is:" +(total/num.length));
		
		//Java 8:Streams:
		OptionalDouble avg=Arrays.stream(num).average();
		System.out.println(avg.getAsDouble());
		
		//Google Guava:
		double avg1= DoubleMath.mean(num);
		System.out.println(avg1);

	}

}
