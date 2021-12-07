package trickyInterviewQuestionsNaveen;

import java.util.stream.IntStream;

public class PrintWithoutLoop {
	//print without using loop
	// Recursive function
	//Streams 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //printNumber(1);
    //printNum(1, 100);
    IntStream.range(5, 101).forEach(e ->System.out.println(e));
	}
	
	public static void printNumber(int num)
	{
		
		if(num<=100)
		{
			System.out.println(num);
			num++;
			printNumber(num);
		}
	}
	
	public static void printNum(int stnum, int endnum)
	{
		
		if(stnum<=endnum)
		{
			System.out.println(stnum);
			stnum++;
			printNum(stnum, endnum);
		}
	}

}
